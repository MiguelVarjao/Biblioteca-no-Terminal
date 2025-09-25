package BibliotecaTerminal;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<>();


    public void cadastrarLivro (Scanner in) {

        System.out.println("====== CADASTRAR LIVRO ======");
        System.out.println("Digite o id: ");
        int id = in.nextInt();
        in.nextLine();

        System.out.println("Digite o titulo: ");
        String titulo = in.nextLine();

        System.out.println("Digite o autor: ");
        String autor = in.nextLine();

        Livro novoLivro = new Livro(id, titulo, autor);
        livros.add(novoLivro);
    }

    public void removerLivro (Scanner in) {

        System.out.println("====== REMOVER LIVRO ======");
        System.out.println("Escolha uma opção");
        System.out.println("1- ID");
        System.out.println("2- Nome");
        int opcao = in.nextInt();
        in.nextLine();

        Livro livroParaRemover = null;

        switch (opcao) {

            case 1:

                System.out.println("Digite o ID: ");
                int idRemover = in.nextInt();
                in.nextLine();

                for (Livro l : livros) {

                    if (l.getId() == idRemover) {

                        livroParaRemover = l;
                        break;
                    }
                }

            case 2:

                System.out.println("Digite o título do livro: ");
                String nomeRemover = in.nextLine();

                for (Livro l : livros) {
                    if (l.getTitulo().equalsIgnoreCase(nomeRemover)) {
                        livroParaRemover = l;
                        break;
                    }
                }
                break;

            default:

                System.out.println("Opção inválida.");
                return;
        }

        if (livroParaRemover == null) {

            System.out.println("Livro não encontrado!!");
        }else {

            System.out.println("Livro encontrado:");
            System.out.println(livroParaRemover);
            System.out.println("Deseja realmente remover? (s/n)");
            String confirmar = in.nextLine();
            if (confirmar.equalsIgnoreCase("s")) {
                livros.remove(livroParaRemover);
                System.out.println("Livro removido com sucesso.");
            } else {
                System.out.println("Remoção cancelada.");
            }
        }
    }

    public void todosLivros (Biblioteca biblioteca) {

        System.out.println(biblioteca.livros);
    }


    public void operacoesUsuario (Scanner in, Biblioteca biblioteca) {

        System.out.println("Escolha oque fazer: ");
        System.out.println("1- Escolher livro");
        System.out.println("2- Devolver livro");
        int escolha = in.nextInt();

        in.nextLine();

        switch (escolha) {

            case 1 : {

                boolean encontrou = false;


                System.out.println("Digite o livro que quer pegar: ");
                String livroEscolhido = in.nextLine();


                for (Livro l : livros) {
                    if (livroEscolhido.equalsIgnoreCase(livroEscolhido)) {
                        if (l.isDisponibilidade()) {

                            l.emprestar();
                            System.out.println("Voçê pegou o Livro: " + l);

                        } else {

                            System.out.println("O livro escolhido não está disponivel!");
                        }
                    }
                }


                if (!encontrou) {
                    System.out.println("Nenhum livro disponível no momento.");
                }
            }

            case 2 : {

                System.out.println("Digite o Livro que vai devolver: ");
                String livroEscolhido = in.nextLine();

                for (Livro l : livros) {
                    if (livroEscolhido.equalsIgnoreCase(livroEscolhido)) {
                        if (l.isDisponibilidade()) {

                            l.devolver();
                            System.out.println("Voçê devolveu o livro: " + l);
                        }
                    }
                }
            }


        }



    }

}
