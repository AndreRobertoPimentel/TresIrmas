package telas;

import classes.CadastroProdutos;
import classes.Fornecedor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaFornecedor extends JFrame {

    private JLabel nome,cpf_cnpj,logradouro,numero,telefone,cidade,estado,pais;//aceita pequeno textos
    private JTextField nomejtf,cpf_cnpjjtf,logradourojtf,numerojtf,telefonejtf,cidadejtf,estadojtf,paisjtf;// pequenos textos
    private JButton jbCadastrar ,jbMostrar;
    private JTextArea jtaMostrar;// usado para grande textos.
    private JScrollPane jspMostrar;//barra de rolagem
    private Fornecedor[] fornecedor  = new Fornecedor[40];
    private int indice = 0;



    public TelaFornecedor(String title) throws HeadlessException {
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

        nome = new JLabel("Nome : ");
        nomejtf = new JTextField();
        cpf_cnpj = new JLabel("CPF/CNPJ : ");
        cpf_cnpjjtf = new JTextField();
        logradouro = new JLabel("Av/Rua : ");
        logradourojtf =new JTextField();
        numero = new JLabel("Numero : ");
        numerojtf = new JTextField();
        telefone = new JLabel("telefone : ");
        telefonejtf = new JTextField();
        cidade = new JLabel("Cidade : ");
        cidadejtf =new JTextField();
        estado = new JLabel("Estado : ");
        estadojtf = new JTextField();
        pais = new JLabel("pais : ");
        paisjtf = new JTextField();
        jtaMostrar = new JTextArea();
        jspMostrar = new JScrollPane(jtaMostrar);
        jbCadastrar = new JButton("Cadastrar");
        jbMostrar = new JButton("Mostrar");

        //adionar a tela
        add(nome);
        add(nomejtf);
        add(cpf_cnpj);
        add(cpf_cnpjjtf);
        add(logradouro);
        add(logradourojtf);
        add(numero);
        add(numerojtf);
        add(telefone);
        add(telefonejtf);
        add(cidade);
        add(cidadejtf);
        add(estado);
        add(estadojtf);
        add(pais);
        add(paisjtf);
        add(jbCadastrar);
        add(jbMostrar);
        add(jspMostrar);//barra de rolagem

        //dimensionamento
        nome.setBounds(10, 10, 80, 20);
        nomejtf.setBounds(83, 10, 280, 20);
        cpf_cnpj.setBounds(10, 40, 150, 20);
        cpf_cnpjjtf.setBounds(83, 40, 50, 20);
        logradouro.setBounds(10, 70, 200, 20);
        logradourojtf.setBounds(80, 73, 150, 20);
        numero.setBounds(250, 40, 50, 20);
        numerojtf.setBounds(300, 40, 58, 20);
        telefone.setBounds(140, 40, 80, 20);
        telefonejtf.setBounds(180, 40, 50, 20);
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
                String nome, cpf_cnpj, logradouro, numero,telefone;


                if (!nomejtf.getText().isEmpty() &&
                        !cpf_cnpjjtf.getText().isEmpty() &&
                        !logradourojtf.getText().isEmpty() &&
                        !numerojtf.getText().isEmpty() &&
                        !telefonejtf.getText().isEmpty()) {
                    nome = nomejtf.getText();
                    cpf_cnpj = cpf_cnpjjtf.getText();
                    logradouro = logradourojtf.getText();
                    numero = numerojtf.getText();
                    telefone = telefonejtf.getText();
                    //objeto

                    fornecedor[indice] = new Fornecedor( nome,cpf_cnpj,logradouro, numero,telefone);


                    indice++;


                    //apagar campos


                    nomejtf.setText("");
                    cpf_cnpjjtf.setText("");
                    logradourojtf.setText("");
                    numerojtf.setText("");
                    telefonejtf.setText("");

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

                /*if (produtos[0] != null) {

                    for (int i = 0; i < indice; i++) {
                        jtaMostrar.append("\n*****************" + "\n" + produtos[i].mostrarDados());
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "Nao ha Produtos cadastrado", "Produtos", JOptionPane.WARNING_MESSAGE);
                }
*/
            }
        });// fim do segundo metodo

    }
    public static void main(String[] args) {
        TelaFornecedor telaFornecedor = new TelaFornecedor("Cadastro Fornecedor");
        telaFornecedor.setVisible(true);
    }

}