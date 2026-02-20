import java.util.ArrayList;

public class CadastroPedido {
    private ArrayList<Pedido> pedidos = new ArrayList<>();  

    public void adicionarPedido(Pedido pedido) {  
        pedidos.add(pedido);
    }

    public void listarPedidos() {  
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado.");
            return;
        }
        
        for (int i = 0; i < pedidos.size(); i++) { 
            Pedido p = pedidos.get(i);  
            System.out.println((i + 1) + ". Código: " + p.getCodPedido() + " | Data: " + p.getDataPedido() + " | Funcionário ID: " + p.getIdFuncionario() + " | Cliente ID: " + p.getIdCliente());
        }
    }
    
    public Pedido buscarPedido(int codigo) {
        for (Pedido p : pedidos) {
            if (p.getCodPedido() == codigo) {
                return p;
            }
        }
        return null;
    }
}