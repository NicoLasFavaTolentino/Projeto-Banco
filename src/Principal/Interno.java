package Principal;

public class Interno extends Banco {

    public void options() {
        int num;
        int op = 0;
        do {
            System.out.println("\nBEM VINDO AO BANCO! \n___________________ " +
                    "\n _________________  \n  ______________ \n   ___________\n");
            System.out.println("|Selecione a opção desejada:| " + "\n 1-(Abertura de conta) \n 2-(Depósito) \n "
                    + "3-(Saque) \n 4-(Pagamento da mensalidade) \n 5-(Extrato) \n 6-(Fechar Conta) \n 7-(Saír) ");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    while (op != 1 || op != 2) {
                        System.out.println("Bem vindo ao Banco. Você gostaria de criar uma nova conta?");
                        System.out.println("Digite (1 - SIM) ou  (2 - VOLTAR)");
                        op = sc.nextInt();

                        if (op == 1) {
                            openAccounte();
                            break;
                        } else if (op == 2) {
                            break;
                        } else {
                            System.out.println("Opção invalida! Tente novamente");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Bem vindo ao Banco. Você gostaria de fazer um novo deposito?");
                    while (op != 1 || op != 2) {
                        System.out.println("Digite (1 - SIM) ou  (2 - VOLTAR)");
                        op = sc.nextInt();

                        if (op == 1) {
                            deposit();
                            break;
                        } else if (op == 2) {
                            break;
                        } else {
                            System.out.println("Opção invalida! Tente novamente");
                        }
                    }
                    break;
                case 3:
                    while (op != 1 || op != 2) {
                        System.out.println("Olá " + getUser() + "Bem vindo ao Banco. Você gostaria de fazer um novo saque?");
                        System.out.println("Digite (1 - SIM) ou  (2 - VOLTAR)");
                        op = sc.nextInt();

                        if (op == 1) {
                            withdraw();
                            break;
                        } else if (op == 2) {
                            break;
                        } else {
                            System.out.println("Opção invalida! Tente novamente");
                        }

                    }

                    break;
                case 4:
                    while (op != 1 || op != 2) {
                        System.out.println("Bem vindo ao Banco. Você gostaria de realizar o pagamento da mensalidade?");
                        System.out.println("Digite (1 - SIM) ou  (2 - VOLTAR)");
                        op = sc.nextInt();

                        if (op == 1) {
                            payMonthly();
                            break;
                        } else if (op == 2) {
                            break;
                        } else {
                            System.out.println("Opção invalida! Tente novamente");
                        }
                    }
                    break;
                case 5:
                    while (op != 1 || op != 2) {
                        System.out.println("Bem vindo ao Banco. Você gostaria de consultar seu extrato?");
                        System.out.println("Digite (1 - SIM) ou  (2 - VOLTAR)");
                        op = sc.nextInt();

                        if (op == 1) {
                            extract();
                            break;
                        } else if (op == 2) {
                            break;
                        } else {
                            System.out.println("Opção invalida! Tente novamente");
                        }

                    }

                    break;
                case  6:
                    while (op != 1 || op != 2) {
                        System.out.println("Bem vindo ao Banco. Você gostaria de encerrar sua conta?");
                        System.out.println("Digite (1 - SIM) ou  (2 - VOLTAR)");
                        op = sc.nextInt();

                        if (op == 1) {
                            contClose();
                            break;
                        } else if (op == 2) {
                            break;
                        } else {
                            System.out.println("Opção invalida! Tente novamente");
                        }

                    }
                default:
                    if (num == 7) {
                        System.out.println("Secção encerrada!");
                        break;
                    }

                    if (num == 0 || num >= 8) {
                        System.out.println("Comando invalido! Digite uma das opções mostradas novamente");
                    }
            }
        } while (num != 7);

    }

}