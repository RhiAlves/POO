public class CadastroPagamento {
    private Pagamento[] pagamentos = new Pagamento[80];
    private int posicao = 0;

    public void adicionarPagamento(Pagamento pagamento){
        if(posicao < pagamentos.length){
            pagamentos[posicao] = pagamento;
            posicao++;
        }
    }

 public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < posicao; i++) {
            total += pagamentos[i].processarPagamento();
        }
        return total;
    }

public void imprimirPagamentos(){
    for(int i = 0; i < posicao; i++){
        Pagamento pagamento = pagamentos[i];
        System.out.println(pagamento.getNomeCliente());
    }
} 

}
