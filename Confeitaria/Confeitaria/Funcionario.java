public class Funcionario{
    private int idFuncionario;
    private String nome;
    private String contato;
    private String funcao;

public Funcionario(int idFuncionario, String nome, String contato, String funcao){
    this.idFuncionario = idFuncionario;
    this.nome = nome;
    this.contato = contato;
    this.funcao = funcao;
    }

    public int getIdFuncionario(){
        return idFuncionario;
}
    public void setIdFuncionario(int idFuncionario){
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario(){
        return nome;
    }
    public void setNomeFuncionario(String nome){
        this.nome = nome;
    }

    public String getContatoFuncionario(){
        return contato;
    }
    public void setContatoFuncionario(String contato){
        this.contato = contato;
    }

    public String getFuncao(){
        return funcao;
    }
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }

}