package BibliotecaTerminal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        ArrayList<Pessoa> logins = new ArrayList<>();
        boolean init = true;
        Scanner in = new Scanner(System.in);
        int escolha = 0;

        while (init) {

            // Menu Inicial

            System.out.println("======= Bem Vindo =======");
            System.out.println("Escolha uma das opçoes");
            System.out.println("(Digite somente o numero da opção)");
            System.out.println("1- Usuario\n2- Funcionario");
            escolha = in.nextInt();
            int tentativas = 0;


            // Limite de tentativas

            if (tentativas > 3) {

                System.out.println("Numero Maximo de tentaivas");
                System.out.println("Encerrando......");

                System.exit(0);
            }


            // Verificação de contas

            if (escolha == 1) {

                System.out.println("1- Ja sou cadastrado");
                System.out.println("2- Novo cadastro ");

                
                break;

            } else if (escolha == 2) {


                break;

            } else {

                break;

            }
        }


        // Menu Principal

        switch (escolha) {

            case 1 : {

                while (init) {

                    System.out.println("======= Menu Usuario =======");
                }
            }

            case 2 : {

                System.out.println("======= Menu Funcionario =======");

            }
        }
    }
}
