import java.util.ArrayList;

public class CadastroFuncionario {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

public void adicionarFuncionario(Funcionario funcionario){
    funcionarios.add(funcionario);
}

public void listarFuncionarios(){
    for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            System.out.println((i+1) + ". ID: " + f.getIdFuncionario() + " | Nome: " + f.getIdFuncionario() + " | Contato: " + f.getIdFuncionario());
        }
    }
       
   public Funcionario buscarFuncionario(int codigo) { 
    for (Funcionario f : funcionarios) {
        if (f.getIdFuncionario() == codigo) {
            return f;
        }
    }
    return null;
}

}

