public class ClienteVIP extends Cliente{
    private String numCartao;

    public ClienteVIP(String nome, double valorDaCompra, String numCartao){
        super(nome, valorDaCompra);
        this.numCartao = numCartao;
    }

    public double calcularPagamento(){
        return getValorDaCompra() - (getValorDaCompra() * 0.10);

    }
}