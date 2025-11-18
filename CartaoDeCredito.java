public class CartaoDeCredito extends Pagamento{
    private int quantidadeParcelas;

    public CartaoDeCredito(String nomeCliente, double valor, int quantidadeParcelas){
        super(nomeCliente, valor);
        this.quantidadeParcelas = quantidadeParcelas;
    }
    
    public double processarPagamento(){
         double taxa = getValor() * (quantidadeParcelas * 0.02);
        return getValor() + taxa;
    }
    
}

