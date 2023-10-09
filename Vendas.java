package classes;

public class Vendas extends Produtos{
    protected int codigo;

    public Vendas(String nomeProd, String codigoProd,
                  String tipoProd, String precoProd, String pesoProd,
                  Integer avaliacao, int codigo) {
        super(nomeProd, codigoProd, tipoProd, precoProd, pesoProd, avaliacao);
        this.codigo = codigo;
    }
}
