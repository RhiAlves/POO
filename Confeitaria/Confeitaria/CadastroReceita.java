import java.util.ArrayList;

public class CadastroReceita {
    private ArrayList<Receita> receitas = new ArrayList<>();

    public void adicionarReceita(Receita receita) {  
        receitas.add(receita);
    }

    public void listarReceitas() {  
        if (receitas.isEmpty()) {
            System.out.println("Nenhuma receita cadastrada.");
            return;
        }
        
        for (int i = 0; i < receitas.size(); i++) { 
            Receita r = receitas.get(i);  
            System.out.println((i + 1) + ". ID: " + r.getIdReceita() + " | Ingredientes: " + r.getIngredientes() + " | Preparo: " + r.getPreparo() + " | Rendimento: " + r.getRendimento());
        }
    }

     public Receita buscarReceita(int id) {
        for (Receita r : receitas) {
            if (r.getIdReceita() == id) {
                return r;
            }
        }
        return null;
    }
    
}