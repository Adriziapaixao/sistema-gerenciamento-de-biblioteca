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

    public String getTitulo() {
        return titulo;
    }

    public void exibirDetalhes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }

    public boolean emprestar(){
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado com sucesso");
            return true;
        } else {
            System.out.println("O livro não está disponível");
            return false;
        }
    }

    public void devolver(){
        if (!disponivel){
            disponivel = true;
            System.out.println("Obrigado: Livro devolvido.");
        } else {
            System.out.println("Livro já disponível no sistema.");
        }

    }

    public boolean isbnDisponivel(String isbn) {
        return this.isbn.equals(isbn) && disponivel;
    }

}

