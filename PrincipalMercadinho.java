public class PrincipalMercadinho{
    public static void main(String[] args){
    Mercadinho mercadinho = new Mercadinho();

    mercadinho.adicionarCliente(new ClienteRegular("Fernanda", 400));
    mercadinho.adicionarCliente(new ClienteRegular("Fernando", 900));
    mercadinho.adicionarCliente(new ClienteVIP("Pink", 200, "4002"));
    mercadinho.adicionarCliente(new ClienteVIP("Lua", 230, "8922"));
    mercadinho.adicionarCliente(new ClienteOuroVIP("Amora", 1800, "5678", "Rua da praça"));
    mercadinho.adicionarCliente(new ClienteOuroVIP("Peperoni", 30, "0078", "Rua dos bichos"));
   
    System.out.println("=== Clientes ===");
    mercadinho.imprimirClientes();

    System.out.println("Total: R$" + mercadinho.calcularTotal());

    }
}