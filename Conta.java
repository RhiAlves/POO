public class Conta {
private int numeroConta;
private String nome;
private double saldo;
private boolean ativa;


public Conta(int numeroConta, String nome) {
    this.numeroConta = numeroConta;
    this.nome = nome;
    this.saldo = 0.0; // sempre começa zerado
    this.ativa = true; // sempre começa ativa
}
// getters e setters
public int getNumero_conta(){
    return numeroConta;
}
public void setNumero_conta(int numeroConta){
    this.numeroConta = numeroConta;
}
public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}
public double getSaldo(){
    return saldo;
}
public void setSaldo(double saldo){
    this.saldo = saldo;
}
public boolean getAtiva(){
    return ativa;
}

//metodos

public void depositar(double valor){
    if (valor > 0 && ativa == true){
        saldo = (saldo + valor);
    } else{
        System.out.println("Ative sua conta para começar a depositar");
    }
}

public void sacar(double valor){
    if (valor <= saldo && ativa == true){
        saldo = (saldo - valor);
    };
}

public void desativar(){
    if (ativa == true){
        ativa = false;
        System.out.println("Sua conta foi desativada!");
    }
}

public void ativar(){
    if (ativa == false){
        ativa = true;
        System.out.println("Sua conta foi ativada");
    }
}

public String exibir(){
return "Número da conta:" + getNumero_conta() + "\nNome:" + nome + "\nSaldo:" + getSaldo() + "\nConta ativa?" + getAtiva();

}
}




