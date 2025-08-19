package BibliotecaTerminal;
import java.util.Scanner;

public class Pessoa {

    private int id;
    private String nome;

    public Pessoa (int id, String nome) {

        this.id = id;
        this.nome= nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void cadastroUsuario (Scanner in) {

        System.out.println("====== CADASTRAR USUARIO ======");
        System.out.println("Digite o id: ");
        int id = in.nextInt();
        in.nextLine();

        System.out.println("Digite o nome: ");
        String titulo = in.nextLine();

        Pessoa novaPessoa = new Pessoa(id, titulo);
    }


} 
