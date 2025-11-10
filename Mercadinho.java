public class Mercadinho {
    private Cliente[] clientes = new Cliente[50];
    private int posicao = 0;

    public void adicionarCliente(Cliente c) { //metododo recebe um cliente c como parametro
        if(posicao < clientes.length) { //verifica se a posição é menor que o tamanho do vettor
            clientes[posicao] = c; //adiciona c no vetor clientes na posção livre
            posicao++; //incrementa o contador e pepara a próxima posição
        }
    }

    public double calcularTotal() {
        double total = 0;
        for(int i = 0; i < posicao; i++) {
            total += clientes[i].calcularPagamento();
        }
        return total;
    }

    public void imprimirClientes() {
        for(int i = 0; i < posicao; i++) {
            Cliente c = clientes[i];
            System.out.println(c.getNome());
        }
    }
}