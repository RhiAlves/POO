public class Pedido{
    private int codPedido;
    private int idItemPedido;
    private String dataPedido;
    private int idFuncionario;
    private int idCliente;

    public Pedido( int codPedido, int idItemPedido, String dataPedido, int idFuncionario, int idCliente){
        this.codPedido = codPedido;
        this.idItemPedido = idItemPedido;
        this.dataPedido = dataPedido;
        this.idFuncionario = idFuncionario;
        this.idCliente = idCliente;
    }


public int getCodPedido(){
        return codPedido;
}
    public void setCodPedido(int codPedido){
        this.codPedido = codPedido;
    }

    public int getIdItemPedido(){
        return getIdItemPedido();
    }
    public void setIdItemPedido(int idItemPedido){
        this.idItemPedido = idItemPedido;
    }

    public String getDataPedido(){
        return (dataPedido);
    }
    public void setDataPedido(String dataPedido){
        this.dataPedido = dataPedido;
    }

    public int getIdFuncionario(){
        return idFuncionario;
    }
    public void setDisponivel(int idFuncionario){
        this.idFuncionario = idFuncionario;
    }

    public int getIdCliente(){
        return idCliente;
    }
    public void getIdCliente(int idCliente){
        this.idCliente = idCliente;

    }
}

