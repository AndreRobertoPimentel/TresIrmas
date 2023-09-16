package telas;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import classes.Cliente;

public class TelaCliente extends JFrame {

    private JLabel jlNome, jlendereco,jltelefone,jlcpf;//aceita pequeno textos
    private JTextField jtfNome,jtfendereco,jtftelefone,jtfcpf;// pequenos textos
    private JButton jbCadastrar ,jbMostrar;
    private JTextArea jtaMostrar;// usado para grande textos.
    private JScrollPane jspMostrar;//barra de rolagem
    private Cliente[] cliente = new Cliente [40];
    private int indice = 0;



    public TelaCliente(String title) throws HeadlessException {
        super(title);
        // TODO Auto-generated constructor stub

        setSize(305, 400);//tamnho da tela
        setLayout(null);//dasabilita o dimensionamento automatico do java
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha a jane e encerra o programa
        getContentPane().setBackground(Color.BLUE);
        setLocationRelativeTo(this);//centraliza a tela
        iniciarComponente();
        criarEventos();
    }

    private void iniciarComponente() {
        // criando os objeto

        jlNome = new JLabel("Nome");
        jtfNome =new JTextField();
        jlendereco= new JLabel("Endere�o");
        jtfendereco =new JTextField();
        jltelefone= new JLabel("Telefone");
        jtftelefone =new JTextField();
        jlcpf = new JLabel("CPF");
        jtfcpf = new JTextField();
        jtaMostrar = new JTextArea();
        jspMostrar = new JScrollPane(jtaMostrar);
        jbCadastrar = new JButton("Cadastrar");
        jbMostrar = new JButton("Mostrar");

        //adionar a tela
        add(jlNome);
        add(jtfNome);
        add(jlendereco);
        add(jtfendereco);
        add(jltelefone);
        add(jtftelefone);
        add(jlcpf);
        add(jtfcpf);
        add(jspMostrar);
        add(jbCadastrar);
        add(jbMostrar);

        //dimensionamento
        jlNome.setBounds(10, 20, 50, 20);
        jtfNome.setBounds(10, 40, 270, 20);
        jlendereco.setBounds(10, 70, 70, 20);
        jtfendereco.setBounds(10, 90, 185, 20);
        jltelefone.setBounds(200, 70, 80, 20);
        jtftelefone.setBounds(200, 90, 80, 20);
        jlcpf.setBounds(10,120,50,20);
        jtfcpf.setBounds(10,140,110,20);
        jbCadastrar.setBounds(183,120,100,20);
        jspMostrar.setBounds(10,180,270,160);
        jbMostrar.setBounds(183,150,100, 20);
    }

    private void criarEventos() {
        // TODO Auto-generated method stub
        // criar evento do botao cadastrar

        jbCadastrar.addActionListener(new ActionListener() {



            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stubString nome;
                String nome, endereco,telefone,cpf;



                if (!jtfNome.getText().isEmpty()&& !jtfendereco.getText().isEmpty()&& !jtftelefone.getText().isEmpty()&& !jtfcpf.getText().isEmpty()) {
                    nome = jtfNome.getText();
                    endereco =jtfendereco.getText();
                    telefone = jtftelefone.getText();
                    cpf = jtfcpf.getText();
                    //objeto

                    cliente[indice] = new Cliente(nome, endereco, telefone,cpf) ;


                    indice++;


                    //apar campos


                    jtfNome.setText("");
                    jtfendereco.setText("");
                    jtftelefone.setText("");
                    jtfcpf.setText("");


                } else {

                    JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Pesssoas",JOptionPane.WARNING_MESSAGE);
                }




            }
        });//aqui termina um evento

        //evento do botao mostrar

        jbMostrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                jtaMostrar.setText("\t Cadastro"+"\n");
                if (cliente[0] != null) {
                    //JOptionPane.showMessageDialog(null,aluno.mostrarDados());
                    for (int i = 0; i < indice; i++) {
                        jtaMostrar.append("\n*****************"+"\n"+cliente[i].mostrarDados())	;
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "Nao ha Pessoas cadastrado", "Pessoas",JOptionPane.WARNING_MESSAGE);
                }

            }
        });// fim do segundo metodo

    }


}
