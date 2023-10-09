package classes;

public class Produtos {

    public String nomeProd;
    public String codigoProd;
    public String tipoProd;
    public String precoProd;
    public String pesoProd;
    public Integer avaliacao;



    public Produtos(String nomeProd, String codigoProd, String tipoProd, String precoProd, String pesoProd, Integer avaliacao) {
        this.nomeProd = nomeProd;
        this.codigoProd = codigoProd;
        this.tipoProd = tipoProd;
        this.precoProd = precoProd;
        this.pesoProd = pesoProd;
        this.avaliacao =  avaliacao;

    }

    public String mostrarDados() {
        return  "Nome do Produto: " + this.nomeProd + "\n Codigo do Produto : "+ this.codigoProd +
                "\nTipo de Produto : " + this.tipoProd + "\nPreço do Produto : "+ this.precoProd+
                "\nPeso do Produto : " + this.pesoProd +"\nAvaliação : "+ this.avaliacao;
    }

}
