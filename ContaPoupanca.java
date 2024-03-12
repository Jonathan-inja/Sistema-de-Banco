package Banco;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String nConta, String cpf, String nomeBanco, double taxa) {
        super(nConta, cpf, nomeBanco, taxa);
    }
    
    public void atualizar(){
        double valor = super.getSaldo()*super.getTaxa();
        super.creditar(valor);
    }

}
