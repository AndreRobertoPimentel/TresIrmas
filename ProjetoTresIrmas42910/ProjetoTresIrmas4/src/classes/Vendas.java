package classes;

import javax.xml.crypto.Data;

public class Vendas{
    protected int codVenda,quantidade,codProduto,codCliente;
    protected float valorTotal,peso;
    protected String formaPag,nomeProd , dataVenda;
    public String nomeCliente;

    public Vendas(int codVenda, int quantidade, int codProduto, int codCliente, float valorTotal, float peso, String formaPag, String nomeProd, String dataVenda, String nomeCliente) {
        this.codVenda = codVenda;
        this.quantidade = quantidade;
        this.codProduto = codProduto;
        this.codCliente = codCliente;
        this.valorTotal = valorTotal;
        this.peso = peso;
        this.formaPag = formaPag;
        this.nomeProd = nomeProd;
        this.dataVenda = dataVenda;
        this.nomeCliente = nomeCliente;
    }

    public String mostrarDados() {

        return "Codigo Venda: " + this.codVenda + "\nData Venda: " + this.dataVenda + "\nCodigo Cliente: "+this.codCliente+
                "\nNome Cliente: " + this.nomeCliente+"\nCodigo Produto: " + this.codProduto + "\nNome Produto: " + this.nomeProd +
                "\nQuantidade: " + this.quantidade + "\nPeso: " + this.peso +" kg/ml"+"\nValor total: " +" R$ "+ this.valorTotal +
                "\nForma de Pagamento: " + this.formaPag ;

    }
}
