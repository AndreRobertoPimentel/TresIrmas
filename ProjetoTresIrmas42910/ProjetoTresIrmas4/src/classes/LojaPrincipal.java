package classes;

public class LojaPrincipal {
    public String nome;
    protected String cpf_cnpj;
    protected String logradouro;
    protected int numero;
    protected int telefone;
    protected String cidade;
    protected String estado;
    protected String pais;
    protected String email;
    protected int codigo;
    public LojaPrincipal(String nome, String cpf_cnpj,
                         String logradouro, int numero, int telefone,
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
