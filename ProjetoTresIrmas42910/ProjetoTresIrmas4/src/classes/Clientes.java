package classes;
public class Clientes extends LojaPrincipal{
    public String senha;
    public Clientes(String nome, String cpf_cnpj, String logradouro, int numero,
                    int telefone, String cidade, String estado, String pais,
                    String email, int codigo) {
        super(nome, cpf_cnpj, logradouro, numero, telefone, cidade, estado, pais, email, codigo);
        this.senha = senha;
    }
    public String mostrarDados() {
        return  "Nome: " + this.nome + "\n Endereço : "+ this.logradouro+"\n Numero : "+this.numero+
                "\n Cidade :"+this.cidade+"\nEstado : "+this.estado+"\nPais : "+this.pais+
                "\n CNPJ/CPF : "+this.cpf_cnpj+ "\n e-mail : "+this.email+
                "\n telefone: " + this.telefone+"\n Codigo Cliente : "+this.codigo;
    }
}