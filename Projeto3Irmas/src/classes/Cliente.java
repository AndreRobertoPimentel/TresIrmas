package classes;

public class Cliente {

    public String nome;
    public String endereco;
    public String telefone;
    public String cpf;


    public Cliente(String nome, String endereco, String telefone, String cpf) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String mostrarDados() {
        return  "Nome: " + this.nome + "\n Endereço : "+ this.endereco+ "\n telefone: " + this.telefone + "\n cep :";
    }
}
