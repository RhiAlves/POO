public class Televisor {
private double canal;
private int volume;
private boolean ligado;

public Televisor( double  canal, int volume){
    this.canal = canal;
    this.volume = volume;
    this.ligado = false;
}

// getters e setters
public double  getCanal(){
    return canal;
}
public void setCanal(double canal){
    this.canal = canal;
}
public int getVolume(){
    return volume;
}
public void setVolume(int volume) {
        this.volume = volume;
}
public boolean getLigado() {
        return ligado;
}
public void setLigado(boolean ligado){
    this.ligado = ligado;
}

// metodos
public void ligar(){
    if (ligado == false){
        ligado = true;
    }
}
public void desligar(){
    if (ligado){
        ligado = false;
    }
}
public void aumentarVolume(int incremento){
    if (ligado == true){
        volume += incremento;
    }
}
public void diminuirVolume(int incremento){
    if (ligado == true){
        volume -= incremento;
    }
}
public void trocarCanal(double novoCanal){
    if (ligado == true){
        canal = novoCanal;
    }
}

@Override
    public String toString(){ 
        return "Canal:" + getCanal() + "\nVolume:" + getVolume() + "\nEsta ligado?" + getLigado();

}
}
