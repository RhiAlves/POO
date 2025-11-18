public class Boleto extends Pagamento {
    private String linhaDigitavel;

    public Boleto(String nomeCliente, double valor, String linhaDigitavel){
        super(nomeCliente, valor);
        this.linhaDigitavel = linhaDigitavel;
    }
    
public double processarPagamento(){
    return getValor() + (getValor() * 0.015 );
}

}
