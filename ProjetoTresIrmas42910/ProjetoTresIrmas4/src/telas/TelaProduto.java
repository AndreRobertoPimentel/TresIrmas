package telas;

import classes.Fornecedor;
import classes.Produtos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaProduto extends JFrame {
    private JLabel nomeProdutojl,codigodoProdutojl,tipodeProdutojl,precoProdutojl,pesoProdutojl,avaliacaojl,codigoFornecedorjl,nomeFornecedorjl;//aceita pequeno textos
    private JTextField nomeProdutojtf,codigodoProdutojtf,tipodeProdutojtf,precoProdutojtf,pesodoProdutojtf,avaliacaojtf,codigoFornecedorjtf,nomeFornecedorjtf;// pequenos textos
    private JButton jbCadastrar ,jbMostrar,jbVoltar,jbPesquisar;
    private JTextArea jtaMostrar;// usado para grande textos.
    private JScrollPane jspMostrar;//barra de rolagem
    private ArrayList<Produtos> produtos = new ArrayList<>();

      public TelaProduto(String title) throws HeadlessException {
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
        nomeProdutojl = new JLabel("Nome");
        nomeProdutojtf = new JTextField();
        nomeFornecedorjl = new JLabel("Nome Fornecedor");
        nomeFornecedorjtf =new JTextField();
        codigodoProdutojl = new JLabel("Codigo");
        codigodoProdutojtf =new JTextField();
        tipodeProdutojl= new JLabel("Tipo Produto");
        tipodeProdutojtf =new JTextField();
        precoProdutojl = new JLabel("Preço");
        precoProdutojtf = new JTextField();
        pesoProdutojl = new JLabel("Peso");
        pesodoProdutojtf = new JTextField();
        avaliacaojl = new JLabel("Avaliacao");
        avaliacaojtf = new JTextField();
        codigoFornecedorjl = new JLabel("Codigo Fornecedor");
        codigoFornecedorjtf = new JTextField();
        jtaMostrar = new JTextArea();
        jspMostrar = new JScrollPane(jtaMostrar);
        jbCadastrar = new JButton("Cadastrar");
        jbMostrar = new JButton("Mostrar");
        jbPesquisar = new JButton("Pesquisar");
        jbVoltar = new JButton("Voltar");
        //adionar a tela
        add(nomeFornecedorjl);
        add(nomeFornecedorjtf);
        add(nomeProdutojl);
        add(nomeProdutojtf);
        add(codigodoProdutojl);
        add(codigodoProdutojtf);
        add(tipodeProdutojl);
        add(tipodeProdutojtf);
        add(pesoProdutojl);
        add(pesodoProdutojtf);
        add(precoProdutojtf);
        add(precoProdutojl);
        add(avaliacaojl);
        add(avaliacaojtf);
        add(jbCadastrar);
        add(jbMostrar);
        add(jspMostrar);//barra de rolagem
        add(jbPesquisar);
        add(jbVoltar);
        add(codigoFornecedorjl);
        add(codigoFornecedorjtf);
        //dimensionamento
        nomeProdutojl.setBounds(80, 10, 50, 20);
        nomeProdutojtf.setBounds(80, 30, 170, 20);
        codigodoProdutojl.setBounds(10, 10, 50, 20);
        codigodoProdutojtf.setBounds(10, 30, 50, 20);
        tipodeProdutojl.setBounds(270, 10, 80, 20);
        tipodeProdutojtf.setBounds(270, 30, 140, 20);
        precoProdutojl.setBounds(10, 70, 50, 20);
        precoProdutojtf.setBounds(10, 90, 80, 20);
        pesoProdutojl.setBounds(120, 70, 80, 20);
        pesodoProdutojtf.setBounds(120, 90, 80, 20);
        avaliacaojl.setBounds(270,70,80,20);
        avaliacaojtf.setBounds(270,90,140,20);
        jbCadastrar.setBounds(310,180,100,20);
        jspMostrar.setBounds(10,180,270,160);
        jbMostrar.setBounds(310,260,100, 20);
        jbPesquisar.setBounds(310,220,100,20);
        jbVoltar.setBounds(310,300,100,20);
        nomeFornecedorjl.setBounds(250,130,160,20);
        nomeFornecedorjtf.setBounds(250,150,160,20);
        codigoFornecedorjl.setBounds(10,130,160,20);
        codigoFornecedorjtf.setBounds(10,150,160,20);
    }
    private void criarEventos() {
        // criar evento do botao cadastrar
        jbCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stubString nome;
                String nomeProd, tipoProd, nomeForn;
                int avaliacao,codigoProd,codigoForn;
                float precoProd,pesoProd;
                if (!nomeProdutojtf.getText().isEmpty() &&
                        !codigodoProdutojtf.getText().isEmpty() &&
                        !tipodeProdutojtf.getText().isEmpty() &&
                        !precoProdutojtf.getText().isEmpty() &&
                        !pesodoProdutojtf.getText().isEmpty()&&
                        !avaliacaojtf.getText().isEmpty()&&
                        !codigoFornecedorjtf.getText().isEmpty()&&
                        !nomeFornecedorjtf.getText().isEmpty()) {
                    nomeProd = nomeProdutojtf.getText();
                    codigoProd = Integer.parseInt(codigodoProdutojtf.getText());
                    tipoProd = tipodeProdutojtf.getText();
                    precoProd = Float.parseFloat(precoProdutojtf.getText()) ;
                    pesoProd = Float.parseFloat(pesodoProdutojtf.getText());
                    codigoForn = Integer.parseInt(codigodoProdutojtf.getText());
                    nomeForn = nomeFornecedorjtf.getText();
                    avaliacao = Integer.parseInt(avaliacaojtf.getText());
                    //objeto
                    Produtos produtos1 = new Produtos(nomeProd, codigoProd, tipoProd, precoProd, pesoProd,  avaliacao,codigoForn,nomeForn);
                    produtos.add(produtos1);
                    //apagar campos
                    nomeFornecedorjtf.setText("");
                    codigoFornecedorjtf.setText("");
                    tipodeProdutojtf.setText("");
                    precoProdutojtf.setText("");
                    pesodoProdutojtf.setText("");
                    avaliacaojtf.setText("");
                    codigodoProdutojtf.setText("");
                    nomeProdutojtf.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Cadastro Produtos", JOptionPane.WARNING_MESSAGE);
                }
            }
        });//aqui termina um evento
           //evento do botao mostrar
        jbMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!produtos.isEmpty()) {
                    for (Produtos produtos1 : produtos) {
                        jtaMostrar.append("\n*****************" + "\n" + produtos1.mostrarDados());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Nao ha Produtos cadastrado", "Cadastro Produtos", JOptionPane.WARNING_MESSAGE);
                }
            }
        });// fim do segundo metodo
        // Botao Pesquisar
        jbPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String termoPesquisa = JOptionPane.showInputDialog("Digite o nome a ser pesquisado:");
                termoPesquisa = termoPesquisa.trim();
                if (termoPesquisa != null) {
                    termoPesquisa = termoPesquisa.trim();
                    jtaMostrar.setText(""); // Limpa a área de texto antes de exibir os resultados

                    if (!termoPesquisa.isEmpty()) {
                        for (Produtos produtos1 : produtos) {
                            if (produtos != null && produtos1.nomeProd.equalsIgnoreCase(termoPesquisa)) {
                                jtaMostrar.append(produtos1.mostrarDados() + "\n");
                            }
                        }
                        if (jtaMostrar.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Nenhum Produto encontrado com o nome informado.", "Cadastro Produto", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Digite um nome válido para pesquisar.", "cadastro Produto", JOptionPane.WARNING_MESSAGE);
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