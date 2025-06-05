public class PrincipalHelicoptero {
    public static void main(String[] args) {
        Helicoptero h1 = new Helicoptero(5);
        Helicoptero h2 = new Helicoptero(3);

        //estado atual do Helicóptero
        System.out.println(h1.toString());
        System.out.println(h2.toString());
        
        //adicionando pessoas 
        h1.adicionarPessoa();
        h1.adicionarPessoa();
        h1.adicionarPessoa();
        h1.adicionarPessoa();
        h1.adicionarPessoa();

        h2.adicionarPessoa();
        h2.adicionarPessoa();
        h2.adicionarPessoa();
        
        //ligar helicópteros
        h1.ligar();  
        h2.ligar();  

        //Decolar helicópteros
        h1.decolarHelicoptero(600);  
        h2.decolarHelicoptero(550);
        
        //estado dos helicópteros
        System.out.println(h1.toString());
        System.out.println(h2.toString());  
        
        //Aterrissar helicópteros
        h1.aterrissarHelicoptero();
        h2.aterrissarHelicoptero();
        
        //desligar helicópteros
        h1.desligarHelicoptero();
        h2.desligarHelicoptero();

        //remove pessoas
        h1.sairPessoa();
        h1.sairPessoa();
        h1.sairPessoa();
        h1.sairPessoa();
        h1.sairPessoa();
        h2.sairPessoa();
        h2.sairPessoa();
        h2.sairPessoa();

        //estado atual do helicóptero
        System.out.println(h1.toString());
        System.out.println(h2.toString());
    }
}
