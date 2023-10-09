package classes;

public class Fornecedor extends LojaPrincipal  {

    public String produtos;


    public Fornecedor(String nome, int cpf_cnpj, String logradouro,
                      int numero, String telefone, String cidade, String estado,
                      String pais, String email, int codigo, String produtos) {
        super(nome, cpf_cnpj, logradouro, numero, telefone, cidade, estado, pais, email, codigo);
        this.produtos = produtos;
    }

    public String mostrarDados() {
        return  "Nome : " + nome+ "\n CPF/CNPJ : "+ cpf_cnpj +
                "\nLogadouro : " + logradouro + "\nNumero : "+ numero+
                "\nTelefone : " + telefone +"\nCidade :" +cidade+
                "\nEstado : " +estado+"\nPais"+pais+"\nProdutos : "+this.produtos+
                "\nEmail : "+ email+"\nCodigo : "+this.codigo;
    }
}