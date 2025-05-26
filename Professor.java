public class Professor {
    private int matricula;
    private String nome;
    private String departamento;


public Professor(int matricula, String nome, String departamento) {
    this.matricula = matricula;
    this.nome = nome;
    this.departamento = departamento;
}

public int getMatricula(){
    return matricula;
}
public int setMatricula(){
    return matricula;
}

public String getNome(){
    return nome;
}
public String setNome(){
    return nome;
}

public String departamento(){
    return departamento;
}
public void imprimir() {
System.out.println("O(A) professor(a) " + getNome() + ", possui a matricula " + getMatricula() + " e trabalha no departamento de " + departamento );
}
}