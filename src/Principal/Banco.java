package Principal;

import java.util.Random;
import java.util.Scanner;

public class Banco {

    public int accountNumber;
    private String user;
    protected String accontType;
    private double balance;
    private boolean status;

    Scanner sc = new Scanner(System.in);
    Random generator = new Random();


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccontType() {
        return accontType;
    }

    public void setAccontType(String accontType) {
        this.accontType = accontType;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void openAccounte() {
        String tipo;
        System.out.println("Digite seu nome: ");
        sc.nextLine();
        String user = sc.next();
        this.setUser(user);

        System.out.println("Tipo de conta:");
        System.out.println("Escolha entre CC(Conta corrente) ou CP(Conta Poupança)");
        System.out.println("\n-Nossos clientes da categoria CC(Conta Corente) tem um incentivo monetario de 50R$. " +
                "\nO pagamento da mensalidade fica no valor de 12R$ \n\n-Clientes da categoria CP(Conta Poupança) tem um incentivo " +
                "monetario de 150R$. \nPagamento da mensalidade fica no valor de 20R$");
        int op = 0;
        while (op != 1) {

            tipo = sc.next();

            if (tipo.equals("CC")) {
                this.setAccontType(tipo);
                this.setStatus(true);
                this.setBalance(50);
                op = op + 1;
            } else if (tipo.equals("CP")) {
                this.setAccontType(tipo);
                this.setBalance(150);
                this.setStatus(true);
                op = op + 1;

            } else {
                System.out.println("Opção inexistente");
                System.out.println("Escolha entre CC(Conta corrente) ou CP(Conta Poupança)");
            }
        }

        setAccountNumber(generator.nextInt(100));
        System.out.println("Bem-vindo ao Banco: " + getUser());
        System.out.println("Tipo de Conta: " + getAccontType());
        System.out.println("Status da Conta: " + getStatus());
        System.out.println("Numero da sua conta: " + getAccountNumber());
        System.out.println("Saldo atual " + getBalance());
    }

    public void contClose() {
        if (this.getBalance() > 0) {
            System.out.println("Conta não pode ser fechada pois possui saldo ativo");
        } else if (this.getBalance() < 0) {
            System.out.println("Conta não pode ser fechada pois existem debitos");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }


    public void deposit() {
        double b;
        if (this.getStatus()) {
            System.out.println("Insira o valor a ser depositado");
            b = sc.nextDouble();
            this.setBalance(this.getBalance() + b);
            System.out.println("Tranzação efetuada com sucesso!" + getUser());

            System.out.println("Saldo atual:" + getBalance());
        } else {
            System.out.println("Conta inexistente para tranferência");
        }
    }

    public void withdraw() {
        double b = 0;
        if (getStatus() == true) {
            System.out.println("Digite o valor a ser sacado");
            b = sc.nextDouble();
            if (this.getBalance() >= b) {
                System.out.println("Transação efetuada com sucesso");
                this.setBalance(getBalance() - b);
                System.out.println("Saque realizado na conta de " + getUser() + " com sucesso!");
                System.out.println("Saldo atual:" + getBalance());
            } else {
                System.out.println("Erro! Saldo insuficiente");
            }
        } else {
            System.out.println("Erro! Conta inexistente");
        }
    }

    protected void payMonthly() {
        int v = 0;
        if (this.getAccontType() == "CC") {
            v = 12;
        } else if (this.getAccontType() == "CP") {
            v = 20;
        }
        if (this.getStatus() == true) {
            this.setBalance(this.getBalance() - v);
            System.out.println("Mesalidade paga com sucesso! " + this.getUser());
            System.out.println("Saldo atual:" + getBalance());
        } else {
            System.out.println("Impossivel pagar uma conta inexistente!");
        }
    }

    public void extract() {
        setBalance(getBalance());
        System.out.println("Olá " + this.getUser());
        System.out.println("Numero da Conta:" + this.getAccountNumber());
        System.out.println("Tipo da conta" + this.getAccontType());
        System.out.println("Seu saldo atual é " + this.getBalance());

    }

}