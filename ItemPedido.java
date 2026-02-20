public class ItemPedido {
    private int idItemPedido;
    private int codPedido;
    private int produtoPedido;
    private float valorUnitario;
    private int quantidade;

    public ItemPedido( int idItemPedido, int codPedido, int produtoPedido, float valorUnitario, int quantidade){
        this.idItemPedido = idItemPedido;
        this.codPedido = codPedido;
        this.produtoPedido = produtoPedido;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }
public int getIdItemPedido(){
        return idItemPedido;
}
    public void setIdItemPedido(int idItemPedido){
        this.idItemPedido = idItemPedido;
    }

    public int getCodPedido(){
        return codPedido;
    }
    public void setcodPedido(int codPedido){
        this.codPedido = codPedido;
    }

    public int getProdutoPedido(){
        return produtoPedido;
    }
    public void setProdutoPedido(int produtoPedido){
        this.produtoPedido = produtoPedido;
    }

    public float getValorUnitario(){
        return valorUnitario;
    }
    public void setValorUnidario(float valorUnitario){
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

}
