package classes;

public class Produtos {
    public String nomeProd;
    public int codigoProd;
    public String tipoProd;
    public float precoProd;
    public float pesoProd;
    public int avaliacao;
    public  int codigoForn;
    public  String nomeForn;
    public Produtos(String nomeProd, int codigoProd, String tipoProd, float precoProd, float pesoProd, int avaliacao, int codigoForn, String nomeForn) {
        this.nomeProd = nomeProd;
        this.codigoProd = codigoProd;
        this.tipoProd = tipoProd;
        this.precoProd = precoProd;
        this.pesoProd = pesoProd;
        this.avaliacao = avaliacao;
        this.codigoForn = codigoForn;
        this.nomeForn = nomeForn;
    }
    public String mostrarDados() {
        return  "Nome do Produto: " + this.nomeProd + "\n Codigo do Produto : "+ this.codigoProd +
                "\nTipo de Produto : " + this.tipoProd + "\nPreço do Produto : "+" R$ "+ this.precoProd+
                "\nPeso do Produto : " + this.pesoProd + " ml/kg"+"\nAvaliação : "+ this.avaliacao;
    }

}
