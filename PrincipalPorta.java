public class PrincipalPorta {
    public static void main(String[] args) {
        Porta p = new Porta("rosa", 2.00f, 1.30f, true);
        
        p.estadoDaPorta();
        p.setEstaAberta(false);
        p.estadoDaPorta();
        
        System.out.println("Cor da porta: " + p.getCor());
        p.setCor("azul");
        System.out.println("Nova cor da porta: " + p.getCor());
    }
}