public class Helicoptero{
    private boolean estaLigado;
    private float altitude;
    private int capacidadeHelicoptero;
    private int pessoasPresentes;

public Helicoptero( int capacidadeHelicoptero){
    this.capacidadeHelicoptero = capacidadeHelicoptero;
}

//getters e setters
public boolean getEstaLigado(){
    return estaLigado;
}
public void setEstaLigado(boolean estaLigado){
    this.estaLigado = estaLigado;
}
public float getAltitude(){
    return altitude;
}
public void setAltitude(float altitude){
    this.altitude = altitude;
}
public int capacidadeHelicoptero(){
    return capacidadeHelicoptero;
}
public void setCapacidadeHelicoptero(int capacidadeHelicoptero){
    this.capacidadeHelicoptero = capacidadeHelicoptero;
}
public int getPessoasPresentes(){
    return pessoasPresentes;
}
public void setPessoasPresentes(int pessoasPresentes){
    this.pessoasPresentes = pessoasPresentes;
}

//metodos
public void adicionarPessoa(){
    if (pessoasPresentes < capacidadeHelicoptero){
        pessoasPresentes = pessoasPresentes + 1; 
    }else {System.out.println("Não é possível adicionar mais pessoas");}
}

public void sairPessoa(){
    if (pessoasPresentes > 0) {
        pessoasPresentes = pessoasPresentes - 1;
    }
}
public void ligar(){
    if (estaLigado == false){
        estaLigado = true;
    } else {
            System.out.println("O helicoptero já está ligado!");
            }
    
    }
public void decolarHelicoptero(double altura) {
    if (altitude <= 0 && estaLigado == true) {
        altitude = (altitude + altura);  
        }
    }
public void aterrissarHelicoptero() {
    if (estaLigado == false && altitude >= 1) {
        altitude = 0; 
    }
    }
public void desligarHelicoptero() {
        if (estaLigado == true && altitude == 0) {
            estaLigado = false;
    }
    }
    @Override
    public String toString(){
    return "O helicoptero possui a capacipade para " + capacidadeHelicoptero + " pessoas, porem, atualmente ha " + getPessoasPresentes() + " pessoas presentes." +"\n Ele está ligado?" + estaLigado + "\n Qual a sua altitude? " + altitude +" metros.";
}

}
