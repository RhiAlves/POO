public class Quadrado{
    //atributos
    private float lado;
    //constutor
    public Quadrado(float lado) {
        this.lado = lado;
    }
    //metodos
    public float calcularArea() {
        return lado * lado;
    }
    
    public float calcularPerimetro() {
        return 4 * lado;
    }

    public void imprimir(){
        System.out.printf("Lado: %.2f, Área: %.2f, Perimetro: %.2f \n", lado, calcularArea(), calcularPerimetro());
    }
}