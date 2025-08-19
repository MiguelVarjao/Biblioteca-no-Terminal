package BibliotecaTerminal;

public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private boolean disponibilidade;

    public Livro (int id, String titulo, String autor){

        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidade = true;

    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {

        return "\nID: " + id + "\nLivro: " + titulo + "\nAutor: " + autor + "\nDisponibilidade: " + disponibilidade + "\n-------------------------";
    }


}
