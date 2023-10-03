package classes;

public class Fornecedor extends LojaPrincipal  {

   private String produtos;


    public Fornecedor(String nome, String cpf_cnpj, String logradouro, String numero, String telefone) {
        super(nome, cpf_cnpj, logradouro, numero, telefone, cidade, estado, pais);
        this.produtos = produtos;
    }

    public String mostrarDados() {
        return  "Nome : " + nome+ "\n CPF/CNPJ : "+ cpf_cnpj +
                "\nLogadouro : " + logradouro + "\nNumero : "+ numero+
                "\nTelefone : " + telefone +"\nCidade :" +cidade+"\nEstado : " +estado+"\nPais"+pais+"\nProdutos : "+this.produtos;
    }
}
