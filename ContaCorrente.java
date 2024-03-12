package Banco;

public class ContaCorrente extends Conta{

    public ContaCorrente(String nConta, String cpf, String nomeBanco, double taxa) {
        super(nConta, cpf, nomeBanco, taxa);
    }

    public void debitar(double valor){
        valor += 0.30;
        super.debitar(valor);
    }
    
}
