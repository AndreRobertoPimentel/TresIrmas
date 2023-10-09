package arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import classes.Funcionario;



public class LerEscreverObjeto {

    private String nomeArquivo;
    //construtor
    public LerEscreverObjeto(String nomearquivo) {
        // TODO Auto-generated constructor stub
        this.nomeArquivo = nomearquivo;
    }
    public void escreverObjeto(Funcionario[] usuarios) {

        try {
            FileOutputStream fluxo = new FileOutputStream(nomeArquivo);//passo o nome do arquivo
            ObjectOutputStream objeto = new ObjectOutputStream(fluxo);
            objeto.writeObject(usuarios);
            objeto.close();
            JOptionPane.showMessageDialog(null, "Gravado com Sucesso");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        }

    }
    public Funcionario [] lerObjeto() {

        Funcionario [] usuario = null;//variavel que vai receber o objeto do arquivo
        FileInputStream fluxo ;

        try {
            fluxo = new FileInputStream(nomeArquivo);
            ObjectInputStream objeto = new ObjectInputStream(fluxo);
            usuario = (Funcionario[]) objeto.readObject();
            objeto.close();
            ;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }//ler arquivo
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        }




        return usuario;

    }
}
