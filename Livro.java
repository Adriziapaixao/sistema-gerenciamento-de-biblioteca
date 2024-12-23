public class Livro {

    public final String titulo;
    public final String autor;
    public final String isbn;
    public boolean disponivel;

    public Livro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean detalhes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
        return true;
    }

    public void emprestar(){
        this.disponivel = false;
    }

    public void devolver(){
        this.disponivel = true;

    }

    public boolean isbnDisponivel() {
        return true;
    }

    public boolean isDisponivel() {
        return true;
    }
}

