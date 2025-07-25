public class PrincipalConta {
    public static void main(String[] args){
        Conta c1 = new Conta(1002,"Amora");
        Conta c2 = new Conta(1003, "Pink");
        Conta c3 = new Conta(1004, "Pepi");
    
System.out.println("----- Estado inicial das contas -----");
System.out.println(c1.exibir());
System.out.println(c2.exibir());
System.out.println(c3.exibir());
    
System.out.println("----- Realizando depósitos ----");
c1.depositar(100.00);
c2.depositar(340.00);
c3.depositar(1000.00);

System.out.println("---- Alterando o nome dos clientes ----");
c1.setNome("Gato Amora");
c2.setNome("Pink Linda");
c3.setNome("Peperoni");

System.out.println("---- Realizando saques -----");
c1.sacar(70.00);
c2.sacar(85.00);
c3.sacar(500);

System.out.println("---- Estado das contas pós alterações ----");
System.out.println(c1.exibir());
System.out.println(c2.exibir());
System.out.println(c3.exibir());
    
System.out.println("---- Desativando duas contas ----");
c1.desativar();
c3.desativar();

System.out.println("---- Estado final das contas ----");
System.out.println(c1.exibir());
System.out.println(c2.exibir());
System.out.println(c3.exibir());
    }
}
