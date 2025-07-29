public class ControleRemoto {
    private Televisor televisor;

    
    public ControleRemoto(Televisor televisor) {
        this.televisor = televisor;
    }

    // métodos acossiados ao Televisor
    public void ligar() {
        televisor.ligar();
    }

    public void desligar() {
        televisor.desligar();
    }

    
    public void aumentarVolume(int novoVolume) {
        televisor.aumentarVolume(novoVolume);
    }

    
    public void diminuirVolume(int novoVolume) {
        televisor.diminuirVolume(novoVolume);
    }

    
    public void trocarCanal(double novoCanal) {
        televisor.trocarCanal(novoCanal);
    }

    
    public String statusTelevisor() {
        return televisor.toString();
    }
}
