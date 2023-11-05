package telas;


import classes.Fornecedor;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaFornecedor extends JFrame {

    private JLabel nomejl,cpf_cnpjjl,logradourojl,numerojl,telefonejl,cidadejl,estadojl,paisjl,codigojl,emailjl;//aceita pequeno textos
    private JTextField nomejtf,cpf_cnpjjtf,logradourojtf,numerojtf,telefonejtf,cidadejtf,estadojtf,paisjtf,codigojtf,emailjtf;// pequenos textos
    private JButton jbCadastrar ,jbMostrar,jbPesquisar,jbVoltar;
    private JTextArea jtaMostrar;// usado para grande textos.
    private JScrollPane jspMostrar;//barra de rolagem
    private ArrayList<Fornecedor> fornecedorArrayList = new ArrayList<>();
    public TelaFornecedor(String title) throws HeadlessException {
        super(title);
        setSize(450, 400);//tamnho da tela
        setLayout(null);//dasabilita o dimensionamento automatico do java
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha a jane e encerra o programa
        getContentPane().setBackground(Color.lightGray);
        setLocationRelativeTo(this);//centraliza a tela
        iniciarComponente();
        criarEventos();
    }
    private void iniciarComponente() {
        // criando os objeto
        nomejl = new JLabel("Nome");
        nomejtf =new JTextField();
        logradourojl= new JLabel("Endereço");
        logradourojtf =new JTextField();
        telefonejl= new JLabel("Telefone");
        telefonejtf =new JTextField();
        cpf_cnpjjl = new JLabel("CNPJ");
        cpf_cnpjjtf = new JTextField();
        numerojl = new JLabel("Numero");
        numerojtf = new JTextField();
        cidadejl = new JLabel("Cidade");
        cidadejtf = new JTextField();
        estadojl = new JLabel("Estado");
        estadojtf = new JTextField();
        paisjl = new JLabel("Pais");
        paisjtf = new JTextField();
        emailjl =  new JLabel("Email");
        emailjtf = new JTextField();
        codigojl =  new JLabel("Codigo");
        codigojtf = new JTextField();
        jtaMostrar = new JTextArea();
        jspMostrar = new JScrollPane(jtaMostrar);
        jbCadastrar = new JButton("Cadastrar");
        jbMostrar = new JButton("Mostrar");
        jbPesquisar = new JButton("Pesquisar");
        jbVoltar = new JButton("Voltar");
        //adionar a tela
        add(nomejl);
        add(nomejtf);
        add(logradourojl);
        add(logradourojtf);
        add(telefonejl);
        add(telefonejtf);
        add(cpf_cnpjjl);
        add(cpf_cnpjjtf);
        add(numerojl);
        add(numerojtf);
        add(cidadejl);
        add(cidadejtf);
        add(estadojl);
        add(estadojtf);
        add(paisjl);
        add(paisjtf);
        add(emailjl);
        add(emailjtf);
        add(codigojl);
        add(codigojtf);
        add(jspMostrar);
        add(jbCadastrar);
        add(jbMostrar);
        add(jbPesquisar);
        add(jbVoltar);
        //dimensionamento
        nomejl.setBounds(10, 20, 50, 20);
        nomejtf.setBounds(10, 40, 150, 20);
        logradourojl.setBounds(180, 20, 70, 20);
        logradourojtf.setBounds(180, 40, 170, 20);
        numerojl.setBounds(370,20,70,20);
        numerojtf.setBounds(370,40,50,20);
        telefonejl.setBounds(10, 60, 80, 20);
        telefonejtf.setBounds(10, 80, 80, 20);
        cpf_cnpjjl.setBounds(110,60,50,20);
        cpf_cnpjjtf.setBounds(110,80,110,20);
        emailjl.setBounds(240,60,50,20);
        emailjtf.setBounds(240,80,180,20);
        cidadejl.setBounds(10,100,50,20);
        cidadejtf.setBounds(10,120,150,20);
        estadojl.setBounds(180,100,50,20);
        estadojtf.setBounds(180,120,50,20);
        paisjl.setBounds(250,100,50,20);
        paisjtf.setBounds(250,120,100,20);
        codigojl.setBounds(370,100,50,20);
        codigojtf.setBounds(370,120,50,20);
        jbCadastrar.setBounds(310,180,100,20);
        jspMostrar.setBounds(10,180,270,160);
        jbMostrar.setBounds(310,260,100, 20);
        jbPesquisar.setBounds(310,220,100,20);
        jbVoltar.setBounds(310,300,100,20);
    }
    private void criarEventos() {
        // criar evento do botao cadastrar
        jbCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome,logradouro, cidade, estado,pais,email,cpf_cnpj;;
                int telefone, numero,codigo;
                if (!nomejtf.getText().isEmpty() &&
                        !cpf_cnpjjtf.getText().isEmpty() &&
                        !logradourojtf.getText().isEmpty() &&
                        !numerojtf.getText().isEmpty() &&
                        !telefonejtf.getText().isEmpty()&&
                        !cidadejtf.getText().isEmpty()&&
                        !estadojtf.getText().isEmpty()&&
                        !paisjtf.getText().isEmpty()&&
                        !codigojtf.getText().isEmpty()){
                    nome = nomejtf.getText();
                    cpf_cnpj = cpf_cnpjjtf.getText();
                    logradouro = logradourojtf.getText();
                    numero = Integer.parseInt(numerojtf.getText());
                    telefone = Integer.parseInt(telefonejtf.getText());
                    cidade = cidadejtf.getText();
                    estado = estadojtf.getText();
                    pais = paisjtf.getText();
                    codigo = Integer.parseInt(codigojtf.getText());
                    email = emailjtf.getText();
                    //objeto
                    Fornecedor fornecedor = new Fornecedor( nome,cpf_cnpj,logradouro, numero,telefone ,cidade, estado, pais,email, codigo);
                    fornecedorArrayList.add(fornecedor);
                    //apagar campos
                    nomejtf.setText("");
                    cpf_cnpjjtf.setText("");
                    logradourojtf.setText("");
                    numerojtf.setText("");
                    telefonejtf.setText("");
                    cidadejtf.setText("");
                    emailjtf.setText("");
                    estadojtf.setText("");
                    paisjtf.setText("");
                    codigojtf.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Cadastrop Fornecedor", JOptionPane.WARNING_MESSAGE);
                   }
            }
        });//aqui termina um evento
        //evento do botao mostrar
        jbMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaMostrar.setText("\t Cadastro Fornecedor "+"\n*****************************");
                if (!fornecedorArrayList.isEmpty() ) {
                    for (Fornecedor fornecedor :fornecedorArrayList) {
                        jtaMostrar.append("\n*****************" + "\n" + fornecedor.mostrarDados());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Nao ha Fornecedores  Cadastrados", "Cadastro Fornecedor", JOptionPane.WARNING_MESSAGE);
                }
            }
        });// fim do segundo metodo
        jbPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String termoPesquisa = JOptionPane.showInputDialog("Digite o nome a ser pesquisado:");
                termoPesquisa = termoPesquisa.trim();

                if (termoPesquisa != null) {
                    termoPesquisa = termoPesquisa.trim();
                    jtaMostrar.setText(""); // Limpa a área de texto antes de exibir os resultados
                    if (!termoPesquisa.isEmpty()) {
                        for (Fornecedor fornecedor: fornecedorArrayList) {
                            if (fornecedor!= null && fornecedor.nome.equalsIgnoreCase(termoPesquisa)) {
                                // Exibe os detalhes do Fornecedor  que corresponde ao nome pesquisado
                                jtaMostrar.append(fornecedor.mostrarDados() + "\n");
                            }
                        }
                        if (jtaMostrar.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Nenhum Fornecedor  encontrado com o nome informado.", "", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Digite um nome válido para pesquisar.", "Pesquisa", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });
        //Botao Voltar
        jbVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaMenu menu  = new TelaMenu("Menu");
                menu.setVisible(true);
                setVisible(false);//deixa a tela  invisivel
            }
        });

    }
 }
