package BibliotecaTerminal;
import java.util.Scanner;

public class Pessoa {

    private String nome;

    public Pessoa (String nome) {

        this.nome= nome;
    }

    public String getNome() {
        return nome;
    }

    public void cadastroUsuario (Scanner in) {

        System.out.println("====== CADASTRAR USUARIO ======");

        System.out.println("Digite o nome: ");
        String nome = in.nextLine();

        Pessoa novaUsuario = new Pessoa(nome);
    }


} 
