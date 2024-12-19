import java.util.ArrayList;

public class Usuario {

    public final String nome;
    public final int id;
    public final ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, int id, ArrayList<Livro> livrosEmprestados) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public boolean isId(int id) {
        return this.id == id;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);

        if (livrosEmprestados.isEmpty()) {
            System.out.println("Nenhum livro emprestado.");
        } else {
            System.out.println("Livros emprestados: ");
            for (Livro livro : livrosEmprestados) {
                System.out.println("* " + livro.getTitulo());
            }
        }
    }
    public void adicionarLivro(Livro livro) {
        if (livro.emprestar()) {
            livrosEmprestados.add(livro);
            System.out.println("Sucesso! Livro adicionado à lista de livros emprestados");
        } else {
            System.out.println("Não foi possível adicionar o livro.");
        }
    }
    public void removerLivro(Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            livro.devolver();
            System.out.println("Livro removido da lista de empréstimos.");
        } else {
            System.out.println("O livro não está na lista de empréstimos.");
        }
    }



}

