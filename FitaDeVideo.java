public class FitaDeVideo {
    private String titulo;
    private float precoPorDia;  

    public FitaDeVideo(String titulo, float precoPorDia) {
        this.titulo = titulo;
        this.precoPorDia = precoPorDia;  
    }

    public String getTitulo() {
        return titulo;
    }

    public float getPrecoPorDia() {
        return precoPorDia;
    }

    
    public float getValorAluguel(int numDiasAlugado) {
        return numDiasAlugado * precoPorDia;
    }
//tentativa de metodo toString
    @Override
    public String toString() {
        return "FitaDeVideo{" +
               "titulo='" + titulo + '\'' +
               ", precoPorDia=" + precoPorDia +  
               '}';
    }
    
    public void imprimir(int dias) {
        System.out.println("Aluguel de '" + getTitulo() + "' por " + dias + " dias: R$" + getValorAluguel(dias));
    }
}