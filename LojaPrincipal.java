package classes;

public class LojaPrincipal {

    protected String nome;
    protected int cpf_cnpj;
    protected String logradouro;
    protected int numero;
    protected String telefone;
    protected String cidade;
    protected String estado;
    protected String pais;
    protected String email;
    protected int codigo;


    public LojaPrincipal(String nome, int cpf_cnpj,
                         String logradouro, int numero, String telefone,
                         String cidade, String estado, String pais, String email,
                         int codigo) {
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.logradouro = logradouro;
        this.numero = numero;
        this.telefone = telefone;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.email = email;
        this.codigo = codigo;

    }

}
