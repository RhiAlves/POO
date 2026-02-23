public class Cliente{
    private int idCliente;
    private String nomeCliente;
    private String contato;

    public Cliente(int idCliente, String nomeCliente, String contato){
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.contato = contato;
    }

    public int getIdCliente(){
        return idCliente;
    }
    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public String getContatoCliente(){
        return contato;
    }
    public void setContatoCliente(String contato){
        this.contato = contato;
    }

}