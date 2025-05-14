public class Funcionario {
    private int codigo;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int idade;
    private float salario;

    
    public Funcionario(int codigo, String nome, String cpf, String endereco, String telefone, int idade, float salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }

    public float getSalario() {
        return salario;
    }

    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

   
    public float calcularSalarioLiquido() {
        float descontoINSS = salario * 0.11f; 
        return salario - descontoINSS;
    }


    @Override
    public String toString() {
        return "Funcionario{" +
               "codigo=" + codigo +
               ", nome='" + nome + '\'' +
               ", cpf='" + cpf + '\'' +
               ", endereco='" + endereco + '\'' +
               ", telefone='" + telefone + '\'' +
               ", idade=" + idade +
               ", salarioBruto=" + salario +
               ", salarioLiquido=" + calcularSalarioLiquido() +
               '}';
    }

    public void imprimir() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereco: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Idade: " + idade);
        System.out.printf("Salario Bruto: R$%.2f\n", salario);
        System.out.printf("Salario Liquido (com desconto do INSS): R$%.2f\n", calcularSalarioLiquido());
    }
}

