package telas;

import classes.CadastroProdutos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroProduto extends JFrame {

    private JLabel NomeProduto,CodigodoProduto,TipodeProduto,PrecoProduto,PesoProduto;//aceita pequeno textos
    private JTextField NomeProdutoJTF,CodigodoProdutoJTF,TipodeProdutoJTF,PrecoProdutoJTF,PesodoProdutoJTF;// pequenos textos
    private JButton jbCadastrar ,jbMostrar;
    private JTextArea jtaMostrar;// usado para grande textos.
    private JScrollPane jspMostrar;//barra de rolagem
    private CadastroProdutos[] produtos  = new CadastroProdutos[40];
    private int indice = 0;



    public TelaCadastroProduto(String title) throws HeadlessException {
        super(title);
        // TODO Auto-generated constructor stub

        setSize(450, 400);//tamnho da tela
        setLayout(null);//dasabilita o dimensionamento automatico do java
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha a jane e encerra o programa
        getContentPane().setBackground(Color.GRAY);
        setLocationRelativeTo(this);//centraliza a tela
        iniciarComponente();
        criarEventos();
    }

    private void iniciarComponente() {
        // criando os objeto

        NomeProduto = new JLabel("Nome");
        NomeProdutoJTF =new JTextField();
        CodigodoProduto = new JLabel("Produto");
        CodigodoProdutoJTF =new JTextField();
        TipodeProduto= new JLabel("Tipo Produto");
        TipodeProdutoJTF =new JTextField();
        PrecoProduto = new JLabel("Preço");
        PrecoProdutoJTF = new JTextField();
        PesoProduto = new JLabel("Peso");
        PesodoProdutoJTF = new JTextField();
        jtaMostrar = new JTextArea();
        jspMostrar = new JScrollPane(jtaMostrar);
        jbCadastrar = new JButton("Cadastrar");
        jbMostrar = new JButton("Mostrar");

        //adionar a tela
        add(NomeProduto);
        add(NomeProdutoJTF);
        add(CodigodoProduto);
        add(CodigodoProdutoJTF);
        add(TipodeProduto);
        add(TipodeProdutoJTF);
        add(PrecoProduto);
        add(PrecoProdutoJTF);
        add(PesoProduto);
        add(PesodoProdutoJTF);
        add(jbCadastrar);
        add(jbMostrar);
        add(jspMostrar);//barra de rolagem

        //dimensionamento
        NomeProduto.setBounds(10, 10, 80, 20);
        NomeProdutoJTF.setBounds(83, 10, 280, 20);
        CodigodoProduto.setBounds(10, 40, 150, 20);
        CodigodoProdutoJTF.setBounds(83, 40, 50, 20);
        TipodeProduto.setBounds(10, 70, 200, 20);
        TipodeProdutoJTF.setBounds(80, 73, 150, 20);
        PrecoProduto.setBounds(250, 40, 50, 20);
        PrecoProdutoJTF.setBounds(300, 40, 58, 20);
        PesoProduto.setBounds(140, 40, 80, 20);
        PesodoProdutoJTF.setBounds(180, 40, 50, 20);
        jbCadastrar.setBounds(80, 100, 100, 20);
        jbMostrar.setBounds(200, 100, 100, 20);
        jspMostrar.setBounds(77, 130, 280, 200);//barra de rolagem

    }

    private void criarEventos() {
        // TODO Auto-generated method stub
        // criar evento do botao cadastrar

        jbCadastrar.addActionListener(new ActionListener() {



            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stubString nome;
                String nomeProd, codigoProd, tipoProd, precoProd, pesoProd;


                if (!NomeProdutoJTF.getText().isEmpty() &&
                        !CodigodoProdutoJTF.getText().isEmpty() &&
                        !TipodeProdutoJTF.getText().isEmpty() &&
                        !PrecoProdutoJTF.getText().isEmpty() &&
                        !PesodoProdutoJTF.getText().isEmpty()) {
                    nomeProd = NomeProdutoJTF.getText();
                    codigoProd = CodigodoProdutoJTF.getText();
                    tipoProd = TipodeProdutoJTF.getText();
                    precoProd = PrecoProdutoJTF.getText();
                    pesoProd = PesodoProdutoJTF.getText();
                    //objeto

                    produtos[indice] = new CadastroProdutos(nomeProd, codigoProd, tipoProd, precoProd, pesoProd);


                    indice++;


                    //apagar campos


                    NomeProdutoJTF.setText("");
                    CodigodoProdutoJTF.setText("");
                    TipodeProdutoJTF.setText("");
                    PrecoProdutoJTF.setText("");
                    PesodoProdutoJTF.setText("");

                } else {

                    JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Produtos", JOptionPane.WARNING_MESSAGE);
                }



            }
        });//aqui termina um evento

        //evento do botao mostrar

        jbMostrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                if (produtos[0] != null) {

                    for (int i = 0; i < indice; i++) {
                        jtaMostrar.append("\n*****************" + "\n" + produtos[i].mostrarDados());
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "Nao ha Produtos cadastrado", "Produtos", JOptionPane.WARNING_MESSAGE);
                }

            }
        });// fim do segundo metodo

    }
    public static void main(String[] args) {
        TelaCadastroProduto telaCadastroProduto = new TelaCadastroProduto("Cadasttro");
        telaCadastroProduto.setVisible(true);
    }

}
