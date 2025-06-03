public class Porta { 
    private String cor;
    private float altura;
    private float largura;
    private boolean estaAberta;

    public Porta(String cor, float altura, float largura, boolean estaAberta) { //Parametros: Valores passados para inicializar um objeto
        this.cor = cor;                 // this. atribui o valor do parâmetro à propriedade "cor" do objeto
        this.altura = altura;
        this.largura = largura;
        this.estaAberta = estaAberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public boolean getEstaAberta() {
        return estaAberta;
    }

    public void setEstaAberta(boolean estaAberta) {
        this.estaAberta = estaAberta;
    }

    public void estadoDaPorta() {
        if (estaAberta) {
            System.out.println("A porta está aberta.");
        } else {
            System.out.println("A porta está fechada.");
        }
    }
      @Override
    public String toString() { //retorna uma representação em string de um objeto
        return "A cor da porta é " + cor + ". Ela possui " + altura + " metros de altura e " + largura + " de largura.";
    }
}
}
