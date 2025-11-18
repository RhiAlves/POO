public class PrincipalPagamento {
    public static void main(String[] args){
        CadastroPagamento cad = new CadastroPagamento();

        cad.adicionarPagamento(new PIX("Amora", 250.00, "amorinhas@email.com"));
        cad.adicionarPagamento(new Boleto("Lulu", 123.46, "129900003998"));
        cad.adicionarPagamento(new CartaoDeCredito("Peperoni", 420.00, 4));
        cad.adicionarPagamento(new PIX("Pato",32.80, "11987654321"));
        cad.adicionarPagamento(new CartaoDeCredito("Pink", 1230.00, 2));
    cad.adicionarPagamento(new Boleto("Lua", 275.30,"3456677788000"));
    
    System.out.println("=== Clentes Cadastrados ===");
    cad.imprimirPagamentos();

    System.out.println("Totals: R$" + cad.calcularTotal());

    }
}
