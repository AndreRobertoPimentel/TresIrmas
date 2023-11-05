package telas;


import classes.Vendas;
import com.sun.net.httpserver.Headers;
import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TelaVenda extends JFrame{
    //Declarando os botoes da tela
    private JLabel codVendajl,valorTotaljl,dataVendajl,quantidadejl,pesojl,codProdutojl,formaPgjl,codClientjl,nomeClientejl,nomeProdjl;
    private JTextField codVendajtf,valorTotajtf,dataVendajtf,quatidadejtl,pesojtf,codProdutojtf,codClientejtl,nomeClientejtf,nomeProdjtf;
    private JButton jbCadastrar ,jbMostrar,jbVoltar,jbPesquisar;
    private JRadioButton jrbCartaoCredito,jrbCartaoDebito,jrbBoleto;
    private ButtonGroup bgformaPagamento;
    private JTextArea jtaMostrar;
    private JScrollPane jspMostrar;
    private Vendas [] vendas = new Vendas[40];
    private int indice = 0 ;
    // Declarando a Tela
    public TelaVenda(String title) throws HeadlessException {
        super(title);
        setSize(450, 400);//tamnho da tela
        setLayout(null);//dasabilita o dimensionamento automatico do java
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha a jane e encerra o programa
        getContentPane().setBackground(Color.lightGray);
        setLocationRelativeTo(this);//centraliza a tela
        iniciarComponente();
        criarEventos();
    }
    //Iniciando os Componentes
    private void iniciarComponente() {
        codVendajl = new JLabel("Cod Venda");
        codVendajtf = new JTextField();
        valorTotaljl = new JLabel("Valor Total");
        valorTotajtf = new JTextField();
        dataVendajl = new JLabel("Data");
        dataVendajtf = new JTextField();
        quantidadejl = new JLabel("QTD");
        quatidadejtl = new JTextField();
        pesojl = new JLabel("Peso");
        pesojtf = new JTextField();
        codProdutojl = new JLabel("Cod. Produto");
        codProdutojtf = new JTextField();
        nomeProdjl = new JLabel("Nome Produto");
        nomeProdjtf = new JTextField();
        formaPgjl = new JLabel("Tipo de Pagamento");
        codClientjl = new JLabel("Cod. Cliente");
        codClientejtl =new JTextField();
        nomeClientejl = new JLabel("Nome Cliente");
        nomeClientejtf = new JTextField();
        jtaMostrar = new JTextArea();
        jspMostrar = new JScrollPane(jtaMostrar);
        jbCadastrar = new JButton("Cadastrar");
        jbMostrar = new JButton("Mostrar");
        jbPesquisar = new JButton("Pesquisar");
        jbVoltar = new JButton("Voltar");
        jrbCartaoCredito = new JRadioButton("Cartão Credito");
        jrbCartaoCredito.setOpaque(false);
        jrbCartaoDebito =new JRadioButton("Cartão Debito");
        jrbCartaoDebito.setOpaque(false);
        jrbBoleto = new JRadioButton("Boleto");
        jrbBoleto.setOpaque(false);
        bgformaPagamento = new ButtonGroup();
        //Adicionando os Componentes
        add(codVendajl);
        add(codVendajtf);
        add(valorTotaljl);
        add(valorTotajtf);
        add(dataVendajl);
        add(dataVendajtf);
        add(quantidadejl);
        add(quatidadejtl);
        add(pesojl);
        add(pesojtf);
        add(codProdutojl);
        add(codProdutojtf);
        add(nomeProdjl);
        add(nomeProdjtf);
        add(formaPgjl);
        add(jrbBoleto);
        add(jrbCartaoCredito);
        add(jrbCartaoDebito);
        bgformaPagamento.add(jrbCartaoCredito);
        bgformaPagamento.add(jrbCartaoDebito);
        bgformaPagamento.add(jrbBoleto);
        add(codClientjl);
        add(codClientejtl);
        add(nomeClientejl);
        add(nomeClientejtf);
        add(jspMostrar);
        add(jbCadastrar);
        add(jbMostrar);
        add(jbPesquisar);
        add(jbVoltar);
        //Dimencionando os Componentes
        codVendajl.setBounds(10, 10, 70, 20);
        codVendajtf.setBounds(10, 30, 70, 20);
        dataVendajl.setBounds(100, 10, 40, 20);
        dataVendajtf.setBounds(100, 30, 55, 20);
        codClientjl.setBounds(165,10,70,20);
        codClientejtl.setBounds(165,30,50,20);
        nomeClientejl.setBounds(240, 10,100,20);
        nomeClientejtf.setBounds(240,30,170,20);
        codProdutojl.setBounds(10,70,100,20);
        codProdutojtf.setBounds(10,90,70,20);
        nomeProdjl.setBounds(100,70,100,20);
        nomeProdjtf.setBounds(100,90,181,20);
        quantidadejl.setBounds(10, 130, 50, 20);
        quatidadejtl.setBounds(10, 150, 50, 20);
        pesojl.setBounds(100, 130, 70, 20);
        pesojtf.setBounds(100, 150, 70, 20);
        valorTotaljl.setBounds(210, 130, 70, 20);
        valorTotajtf.setBounds(210, 150, 70, 20);
        formaPgjl.setBounds(290,70,120,20);
        jrbBoleto.setBounds(290,90,100,20);
        jrbCartaoDebito.setBounds(290,110,130,20);
        jrbCartaoCredito.setBounds(290,130,130,20);
        jbCadastrar.setBounds(310,180,100,20);
        jspMostrar.setBounds(10,180,270,160);
        jbMostrar.setBounds(310,260,100, 20);
        jbPesquisar.setBounds(310,220,100,20);
        jbVoltar.setBounds(310,300,100,20);
    }
    //Iniciando os Botoes
    private void criarEventos(){
        jbCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codVenda, quantidade, codProduto,codCliente;
                float valorTotal,peso;
                String dataVenda;
                String formaPag="", nomeCliente,nomeProd;
                //entradas
                if (!codVendajtf.getText().isEmpty() &&
                        !valorTotajtf.getText().isEmpty() &&
                        !dataVendajtf.getText().isEmpty() &&
                        !codClientejtl.getText().isEmpty() &&
                        !quatidadejtl.getText().isEmpty() &&
                        !pesojtf.getText().isEmpty() &&
                        !codProdutojtf.getText().isEmpty() &&
                        !nomeProdjtf.getText().isEmpty() &&
                        !nomeClientejtf.getText().isEmpty()){
                codVenda = Integer.parseInt(codVendajtf.getText());
                valorTotal = Float.parseFloat(valorTotajtf.getText());
                codCliente=Integer.parseInt(codProdutojtf.getText());
                dataVenda = dataVendajtf.getText();
                quantidade = Integer.parseInt(quatidadejtl.getText());
                peso = Float.parseFloat(pesojtf.getText());
                codProduto = Integer.parseInt(codProdutojtf.getText());
                nomeProd = nomeProdjtf.getText();
                nomeCliente = nomeClientejtf.getText();
                //tipo de pagamento
                if (jrbCartaoCredito.isSelected())formaPag="Credito";
                if (jrbCartaoDebito.isSelected())formaPag = "Debito";
                if (jrbBoleto.isSelected())formaPag="Boleto";
                //Armazenando as Entradas
                vendas[indice] = new Vendas(codVenda, quantidade,codProduto,codCliente, valorTotal, peso, formaPag , nomeProd,dataVenda,  nomeCliente);
                indice++;
                //Apagando os Campos
                codVendajtf.setText("");
                codClientejtl.setText("");
                valorTotajtf.setText("");
                dataVendajtf.setText("");
                quatidadejtl.setText("");
                pesojtf.setText("");
                codProdutojtf.setText("");
                nomeProdjtf.setText("");
                nomeClientejtf.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Vendas", JOptionPane.WARNING_MESSAGE);
            }
            }
        });
        jbMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (vendas[0] != null) {
                    for (int i = 0; i < indice; i++) {
                        jtaMostrar.append("\n*****************" + "\n" + vendas[i].mostrarDados());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Nao ha Vendas  cadastradas", "Vendas", JOptionPane.WARNING_MESSAGE);
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
                        for (int i = 0; i < indice; i++) {
                            if (vendas[i] != null && vendas[i].nomeCliente.equalsIgnoreCase(termoPesquisa)) {
                                // Exibe os detalhes do cliente que corresponde ao nome pesquisado
                                jtaMostrar.append(vendas[i].mostrarDados() + "\n"+"**********************"+"\n");
                            }
                        }
                        if (jtaMostrar.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Nenhuma Venda  encontrado com o nome informado.", "", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Digite um nome válido para pesquisar.", "Pesquisa  Vendas", JOptionPane.WARNING_MESSAGE);
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
