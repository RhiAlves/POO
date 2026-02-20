import java.util.ArrayList;


public class CadastroCliente {
    private ArrayList<Cliente> clientes = new ArrayList<>();

public void adicionarCliente(Cliente cliente){
    clientes.add(cliente);
}

public void listarCliente(){
    for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            System.out.println((i+1) + ". ID: " + c.getIdCliente() + " | Nome: " + c.getIdCliente() + " | Contato: " + c.getIdCliente());
        }
    }

     public Cliente buscarCliente(int id) {
        for (Cliente c : clientes) {
            if (c.getIdCliente() == id) {
                return c;
            }
        }
        return null;
    }
                
}

