package telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//@SuppressWarnings("serial")
public class TelaMenu extends JFrame {


    private JButton jbtCadastroProduto, jbtCadastroFornecedor, jbtCadastroVenda, jbtCadastroCliente, jbtSair;


    public TelaMenu(String title) throws HeadlessException {
        super(title);
        // TODO Auto-generated constructor stub
        setSize(350, 220);//tamnho da tela
        setLayout(null);//dasabilita o dimensionamento automatico do java
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha a jane e encerra o programa
        getContentPane().setBackground(Color.lightGray);
        setLocationRelativeTo(this);//centraliza a tela
        iniciarComponente();
        //criarEventos();
    }


    private void iniciarComponente() {
        // TODO Auto-generated method stub

        jbtCadastroProduto = new JButton(" Produtos");
        jbtCadastroFornecedor = new JButton("Fornecedores");
        jbtCadastroVenda = new JButton("Vendas");
        jbtCadastroCliente = new JButton("Clientes");
        jbtSair = new JButton(" Sair");


        add(jbtCadastroProduto);
        add(jbtCadastroFornecedor);
        add(jbtCadastroVenda);
        add(jbtCadastroCliente);
        add(jbtSair);


        jbtCadastroProduto.setBounds(160, 10, 150, 20);
        jbtCadastroFornecedor.setBounds(160, 40, 150, 20);
        jbtCadastroVenda.setBounds(160, 70, 150, 20);
        jbtCadastroCliente.setBounds(160, 100, 150, 20);
        jbtSair.setBounds(160, 130, 150, 20);


    }

    private void criarEventos() {
        // TODO Auto-generated method stub
        //botao cadastrar
        jbtCadastroCliente.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


                TelaCliente cliente = new TelaCliente("Cadastro ");
                cliente.setVisible(true);


            }
        });
        jbtCadastroFornecedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        jbtCadastroProduto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        jbtCadastroVenda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        jbtSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main (String[]args){
        TelaMenu menu = new TelaMenu("Menu");
        menu.setVisible(true);
    }
}