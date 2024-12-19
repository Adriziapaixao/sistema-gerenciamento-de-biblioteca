import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        cadastraLivro(biblioteca, scr);

    }

    public static void cadastraLivro(Biblioteca biblioteca, Scanner scr){

        System.out.println("Informe o título do livro para cadastro: ");
        String tituloDoLivro = scr.nextLine();

        System.out.println("Informe o autor do livro: ");
        String autorDoLivro = scr.nextLine();

        System.out.println("Informe o ISBN do livro: ");
        String isbnDoLivro = scr.nextLine();

        Livro livro = new Livro(tituloDoLivro, autorDoLivro, isbnDoLivro);

        biblioteca.cadastrarLivro(livro);
        System.out.println("Livro cadastrado com sucesso: " + livro.getTitulo());


    }
}
