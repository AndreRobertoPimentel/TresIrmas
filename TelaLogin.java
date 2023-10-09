package telas;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import arquivos.LerEscreverObjeto;
import classes.Funcionario;

@SuppressWarnings("serial")
public class TelaLogin extends JFrame {

    private JLabel jlLogin, jlSenha;
    private JTextField jtfLogin;
    private JPasswordField jpfSenha;
    private JButton jbtLogar, jbtCadastrar;
    private Funcionario [] usuarios = new Funcionario[40];
    private int indice = 0;


    public TelaLogin(String title) throws HeadlessException {
        super(title);
        // TODO Auto-generated constructor stub
        setSize(250, 250);//tamnho da tela
        setLayout(null);//dasabilita o dimensionamento automatico do java
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha a jane e encerra o programa
        getContentPane().setBackground(Color.blue);
        setLocationRelativeTo(this);//centraliza a tela
        leituraArquivo();
        iniciarComponente();
        criarEventos();
    }
    private void leituraArquivo(){
        LerEscreverObjeto leitura = new LerEscreverObjeto("Usuario.bin");
        if (leitura.lerObjeto()!=null) {
            usuarios = leitura.lerObjeto();


        }
    }

    private void iniciarComponente() {
        // TODO Auto-generated method stub
        jlLogin = new JLabel("Login");
        jlSenha = new JLabel("Senha");
        jtfLogin = new JTextField();
        jpfSenha = new JPasswordField();
        jbtLogar = new JButton("Logar");
        jbtCadastrar = new JButton("Cadastrar");


        add(jlLogin);
        add(jlSenha);
        add(jtfLogin);
        add(jpfSenha);
        add(jbtLogar);
        add(jbtCadastrar);

        jlLogin.setBounds(80, 10, 50, 20);
        jtfLogin.setBounds(80, 30, 80, 20);
        jlSenha.setBounds(80, 50, 80, 20);
        jpfSenha.setBounds(80, 70, 80, 20);
        jbtLogar.setBounds(70, 115, 100, 20);
        jbtCadastrar.setBounds(70, 155, 100, 20);



    }

    private void criarEventos() {
        // TODO Auto-generated method stub
        //botao cadastrar
        jbtCadastrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                TelaFuncionario funcionario= new TelaFuncionario("Cadastro",usuarios,indice);
                funcionario.setVisible(true);
                indice ++;
            }
        });
        jbtLogar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                                TelaMenu menu  = new TelaMenu("Menu");
                                menu.setVisible(true);


                                setVisible(false);//deixa a tela login invisivel


            }
            });

    }

    public static void main(String[] args) {
        TelaLogin login = new TelaLogin("login");
        login.setVisible(true);
    }

}