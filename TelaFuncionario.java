package telas;

import arquivos.LerEscreverObjeto;
import classes.Funcionario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaFuncionario extends JFrame {

    private JLabel jlLogin, jlSenha;
    private JTextField jtfLogin;
    private JPasswordField jpfSenha;
    private JButton  jbtCadastrar;
    private Funcionario[] usuarios;
    private int indice;


    public TelaFuncionario(String title, Funcionario[] usuarios, int indice) throws HeadlessException {
        super(title);
        this.usuarios = usuarios;
        this.indice = indice;
        // TODO Auto-generated constructor stub
        setSize(250, 250);//tamnho da tela
        setLayout(null);//dasabilita o dimensionamento automatico do java
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha a jane e encerra o programa
        getContentPane().setBackground(Color.YELLOW);
        setLocationRelativeTo(this);//centraliza a tela
        iniciarComponente();
        criarEventos();
    }



    private void iniciarComponente() {
        // TODO Auto-generated method stub
        jlLogin = new JLabel("Login");
        jlSenha = new JLabel("Senha");
        jtfLogin = new JTextField();
        jpfSenha = new JPasswordField();

        jbtCadastrar = new JButton("Cadastrar");


        add(jlLogin);
        add(jlSenha);
        add(jtfLogin);
        add(jpfSenha);

        add(jbtCadastrar);

        jlLogin.setBounds(80, 10, 50, 20);
        jtfLogin.setBounds(80, 30, 80, 20);
        jlSenha.setBounds(80, 50, 80, 20);
        jpfSenha.setBounds(80, 70, 80, 20);
        jbtCadastrar.setBounds(70, 115, 100, 20);

    }
    private void criarEventos() {
        // TODO Auto-generated method stub
        jbtCadastrar.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                String Login = jtfLogin.getText();
                String Senha = String.valueOf(jpfSenha.getPassword());//converte conjuto de caracter para string , valueOf.

                for (int i  = 0;i<usuarios.length;i++) {

                    if (usuarios [i]== null) {
                        usuarios[i] =new Funcionario(Login, Senha);
                        setVisible(false);
                        LerEscreverObjeto gravar = new LerEscreverObjeto("Usuario.bin");
                        gravar.escreverObjeto(usuarios);
                        break;
                    }}

            }

        });


    }
}