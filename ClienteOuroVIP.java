public class ClienteOuroVIP extends ClienteVIP{
    private String endereco;

    public ClienteOuroVIP(String nome, double valorDaCompra, String numCartao, String endereco) {
        super(nome, valorDaCompra, numCartao);
        this.endereco = endereco;
    }
    public double calcularPagamento(){
        return getValorDaCompra() - (getValorDaCompra() * 0.15);
    }
}