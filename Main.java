package Banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<>();

        int opc;

        do {
            System.out.println("\n 1 - Cadastrar Conta corrente"+
                               "\n 2 - Cadastrar Poupança"+
                               "\n 3 - Atualizar conta corrente"+
                               "\n 4 - Atualizar poupança"+
                               "\n 5 - Saque conta corrente"+
                               "\n 6 - Saque poupança"+
                               "\n 7 - Verificar saldo de conta corrente"+
                               "\n 8 - Verificar saldo de poupança"+
                               "\n 0 - Sair.");

            System.out.print("Opção: ");
            opc = sc.nextInt();

            switch (opc) {
                
                // Cadastrar Conta corrente
                case 1:
                    cadastrarContaCorrente(contas);
                    break;
            
                // Cadastrar Poupança
                case 2:
                    cadastrarContaPoupanca(contas);
                    break;

                // Atualizar conta corrente
                case 3:
                    atualizarContaCorrente(contas);
                    break;

                // Atualizar poupança
                case 4:
                    atualizarConraPoupanca(contas);
                    break;

                // Saque conta corrente
                case 5:
                    saqueContaCorrente(contas);
                    break;

                // Saque poupança
                case 6:
                    saqueContaPoupanca(contas);
                    break;

                // Verificar saldo de conta corrente
                case 7:
                    saldoContaCorrente(contas);
                    break;

                // Verificar saldo de poupança
                case 8:
                    saldoContaPoupanca(contas);
                    break;

                // Erro
                default:
                    System.out.println("\n Opção incorreta. Escolha novamente!");
                    break;
            }
        } while (opc!=0);

    }

    // Cadastrar Conta corrente
    public static void cadastrarContaCorrente(ArrayList<Conta> contas){
        Scanner sc = new Scanner(System.in);

        // Solicitando dados
        System.out.print("\nDigite o numero da Conta: ");
        String numConta = sc.next();
        System.out.print("Digite o numero do CPF: ");
        String cpf = sc.next();
        System.out.print("Digite o nome do Banco: ");
        String nomeBanco = sc.next();
        System.out.print("Digite o valor da taxa: ");
        double taxa = sc.nextDouble();

        // Cadastrando conta Corrente
        ContaCorrente contaCorrente = new ContaCorrente(numConta, cpf, nomeBanco, taxa);

        // Adicionando a conta na Lista de contas
        contas.add(contaCorrente);
    }

    // Cadastrar Poupança
    public static void cadastrarContaPoupanca(ArrayList<Conta> contas){
        Scanner sc = new Scanner(System.in);

        // Solicitando dados
        System.out.print("\nDigite o numero da Conta: ");
        String numConta = sc.next();
        System.out.print("Digite o numero do CPF: ");
        String cpf = sc.next();
        System.out.print("Digite o nome do Banco: ");
        String nomeBanco = sc.next();
        System.out.print("Digite o valor da taxa: ");
        double taxa = sc.nextDouble();

        // Cadastrando conta poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca(numConta, cpf, nomeBanco, taxa);

        // Adicionando a conta na Lista de contas
        contas.add(contaPoupanca);
    }

    // Atualizar conta corrente
    public static void atualizarContaCorrente(ArrayList<Conta> contas){
        Scanner sc = new Scanner(System.in);

        // Solicitando o numero da conta 
        System.out.print("\n Digite o numero da Conta: ");
        String numConta = sc.next();

        // Buscando Conta na lista de Contas
        for (Conta conta : contas) {

            //Verificando se a conta é Conta Corrente e o número digite é o mesmo da conta
            if(conta instanceof ContaCorrente && conta.getNumConta().equals(numConta)){
                System.out.println("\n Saldo: " + conta.getSaldo());
                conta.atualizar();
                System.out.println(" Saldo atualizado: " + conta.getSaldo());
            }
        }
        
    }

    // Atualizar poupança
    public static void atualizarConraPoupanca(ArrayList<Conta> contas){
        Scanner sc = new Scanner(System.in);

        // Solicitando o numero da conta 
        System.out.print("\n Digite o numero da Conta: ");
        String numConta = sc.next();

        // Buscando Conta na lista de Contas
        for (Conta conta : contas) {

            //Verificando se a conta é Conta Poupança e o número digite é o mesmo da conta
            if(conta instanceof ContaPoupanca && conta.getNumConta().equals(numConta)){
                System.out.println("\n Saldo " + conta.getSaldo());
                conta.atualizar();
                System.out.println(" Saldo atual: " + conta.getSaldo());
            }
        }
    }

    // Saque conta corrente
    public static void saqueContaCorrente(ArrayList<Conta> contas){
        Scanner sc = new Scanner(System.in);

        // Solicitando o numero da conta 
        System.out.print("\n Digite o numero da Conta: ");
        String numConta = sc.next();

        // Buscando Conta na lista de Contas
        for (Conta conta : contas) {

            //Verificando se a conta é Conta Corrente e o número digite é o mesmo da conta
            if(conta instanceof ContaCorrente && conta.getNumConta().equals(numConta)){
                System.out.println("\n Saldo: " + conta.getSaldo());
                System.out.print(" Digite o valor a ser sacado: ");
                double valor = sc.nextDouble();
                conta.debitar(valor);
                System.out.println(" Saldo atual: " + conta.getSaldo());
            }
        }
    }

    // Saque poupança
    public static void saqueContaPoupanca(ArrayList<Conta> contas){
        Scanner sc = new Scanner(System.in);

        // Solicitando o numero da conta 
        System.out.print("\n Digite o numero da Conta: ");
        String numConta = sc.next();

        // Buscando Conta na lista de Contas
        for (Conta conta : contas) {

            //Verificando se a conta é Conta Poupança e o número digite é o mesmo da conta
            if(conta instanceof ContaPoupanca && conta.getNumConta().equals(numConta)){
                System.out.println("\n Saldo: " + conta.getSaldo());
                System.out.print(" Digite o valor a ser sacado: ");
                double valor = sc.nextDouble();
                conta.debitar(valor);
                System.out.println(" Saldo atual: " + conta.getSaldo());
            }
        }
    }

    // Verificar saldo de conta corrente
    public static void saldoContaCorrente(ArrayList<Conta> contas){
        Scanner sc = new Scanner(System.in);

        // Solicitando o numero da conta 
        System.out.print("\n Digite o numero da Conta: ");
        String numConta = sc.next();

        // Buscando Conta na lista de Contas
        for (Conta conta : contas) {

            //Verificando se a conta é Conta Corrente e o número digite é o mesmo da conta
            if(conta instanceof ContaCorrente && conta.getNumConta().equals(numConta)){
                System.out.println("\n Saldo: " + conta.getSaldo());
            }
        }        
    }

    // Verificar saldo de poupança
    public static void saldoContaPoupanca(ArrayList<Conta> contas){
        Scanner sc = new Scanner(System.in);

       // Solicitando o numero da conta 
        System.out.print("\n Digite o numero da Conta: ");
        String numConta = sc.next();

        // Buscando Conta na lista de Contas
        for (Conta conta : contas) {

            //Verificando se a conta é Conta Poupança e o número digite é o mesmo da conta
            if(conta instanceof ContaPoupanca && conta.getNumConta().equals(numConta)){
                System.out.println("\n Saldo: " + conta.getSaldo());
            }
        } 
    }

}
