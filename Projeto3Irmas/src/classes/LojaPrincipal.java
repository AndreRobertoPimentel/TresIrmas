package classes;

public class LojaPrincipal {

    protected String nome;
    protected String cpf_cnpj;
    protected String logradouro;
    protected String numero;
    protected String telefone;
    protected String cidade;
    protected String estado;
    protected String pais;


    public LojaPrincipal(String nome, String cpf_cnpj, String logradouro, String numero, String telefone, String cidade, String estado, String pais) {
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.logradouro = logradouro;
        this.numero = numero;
        this.telefone = telefone;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

}
