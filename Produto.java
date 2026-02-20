public class Produto{
    private int idProduto;
    private String nomeProduto;
    private String descricaoProduto;
    private boolean disponivel;
    private int quantidadeEstoque;
    private int idReceita;

    public Produto(int idProduto, String nomeProduto, String descricaoProduto, boolean disponivel, int quantidadeEstoque, int idReceita){
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.disponivel = disponivel;
        this.quantidadeEstoque = quantidadeEstoque;
        this.idReceita = idReceita;
    }
    public int getIdProduto(){
        return idProduto;
}
    public void setIdProduto(int idProduto){
        this.idProduto = idProduto;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto(){
        return descricaoProduto;
    }
    public void setDescricaoProduto(String descricaoProduto){
        this.descricaoProduto = descricaoProduto;
    }

    public boolean getDisponivel(){
        return disponivel;
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getIdReceita(){
        return idReceita;
    }
    public void getIdReceita(int idReceita){
        this.idReceita = idReceita;

    }


}


