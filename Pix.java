public class PIX extends Pagamento{
    private String chave;

    public PIX(String nomeCliente, double valor, String chave){
        super(nomeCliente, valor);
        this.chave = chave;
    }

    public double processarPagamento(){
        return getValor();
    }
}
