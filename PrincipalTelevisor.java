public class PrincipalTelevisor {
    public static void main(String[] args) {
        Televisor t1 = new Televisor(67.9,32);
        Televisor t2 = new Televisor(45.8,89);
        Televisor t3 = new Televisor(87.4,29);
        ControleRemoto c1 = new ControleRemoto(t1);
        ControleRemoto c2 = new ControleRemoto(t2);
        ControleRemoto c3 = new ControleRemoto(t3);
    
    System.out.println("---- Estado inicial dos televisores ----");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    
    System.out.println("---- Ligando os televisores ----");
    t1.ligar();
    System.out.println(t1);
    t2.ligar();
    System.out.println(t2);
    t3.ligar();
    System.out.println(t3);

    System.out.println("---- Aumentando o volume do t3 e diminuindo o volume do t2 ----");
    t2.diminuirVolume(40);
    System.out.println(t2);
    t3.aumentarVolume(60);
    System.out.println(t3);
    
    System.out.println("---- Mudando de canal usando o ControleRemoto ----");
    c1.trocarCanal(12.8);
    System.out.println(t1);
    c2.trocarCanal(56);
    System.out.println(t2);
    c3.trocarCanal(46.9);
    System.out.println(t3);

    System.out.println("---- Desligando os televisores usando o ControleRemoto ----");
    c1.desligar();
    System.out.println(t1);
    c2.desligar();
    System.out.println(t2);
    c3.desligar();
    System.out.println(t3);

}
}
