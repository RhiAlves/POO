import java.util.ArrayList;

public class CadastroProdutos {
    private ArrayList<Produto> produtos = new ArrayList<>();

public void adicionarProduto(Produto produto){
    produtos.add(produto);
}

public void listarProdutos(){
    for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            System.out.println((i+1) + ". ID: " + p.getIdProduto() + " | Nome: " + p.getNomeProduto() + " | Descrição: " + p.getDescricaoProduto() + "| O produto está disponivel:" + p.getDisponivel() + "| Quantidade no estoque:" + p.getQuantidadeEstoque() + "| Id receita:" + p.getIdReceita());
        }
    }
            
    public Produto buscarProduto(int id) {
    for (Produto pr : produtos) {  
        if (pr.getIdProduto() == id) {
            return pr;
        }
    }
    return null;
}

}