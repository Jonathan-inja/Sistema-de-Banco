package Banco;

public abstract class Conta {
    
    private String numConta, CPF, nomeBanco;
    private double saldo, taxa;

    public Conta(String nConta, String cpf, String nomeBanco, double taxa){
        this.numConta = nConta;
        this.CPF = cpf;
        this.nomeBanco = nomeBanco;
        this.taxa = taxa/100;
        this.saldo = 20.00;
    }

    // Get dos atributos
    public double getSaldo(){
        return this.saldo;
    }
    public String getNumConta(){
        return this.numConta;
    }
    public String getCPF(){
        return this.CPF;
    }
    public double getTaxa(){
        return this.taxa;
    }
    public String getNomeBanco(){
        return this.nomeBanco;
    }

    // Metodos para trasações
    public void atualizar(){
        this.saldo -= this.saldo*this.taxa;
    }
    public void creditar(double valor){
        if(valor>=0){
            this.saldo += valor;
        }
    }
    public void debitar(double valor){
        if(this.saldo>valor){
            this.saldo -= valor;
        }
        else{
            System.out.println("\n Saldo insuficiente!");
        }
    }

}
