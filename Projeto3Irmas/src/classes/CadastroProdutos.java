package classes;

public class CadastroProdutos {

    public String nomeProd;
    public String codigoProd;
    public String tipoProd;
    public String precoProd;
    public String pesoProd;



    public CadastroProdutos(String nomeProd, String codigoProd, String tipoProd, String precoProd, String pesoProd) {
        this.nomeProd = nomeProd;
        this.codigoProd = codigoProd;
        this.tipoProd = tipoProd;
        this.precoProd = precoProd;
        this.pesoProd = pesoProd;

    }

    public String mostrarDados() {
        return  "Nome do Produto: " + this.nomeProd + "\n Codigo do Produto : "+ this.codigoProd +
                "\nTipo de Produto : " + this.tipoProd + "\nPreço do Produto : "+ this.precoProd+
                "\nPeso do Produto : " + this.pesoProd ;
    }

}
