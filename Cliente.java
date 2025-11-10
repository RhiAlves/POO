public abstract class Cliente {
    private String nome;
    private double valorDaCompra;

    public Cliente(String nome, double valorDaCompra) {
        this.nome = nome;
        this.valorDaCompra = valorDaCompra;
    }
    
    public abstract double calcularPagamento();

    public String getNome() {
        return nome;
    }
    
    public double getValorDaCompra() {
        return valorDaCompra;
    }


}