import java.util.ArrayList;

public class Usuario {

    public final String nome;
    public final int id;
    public final ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public boolean podeEmprestar() {
        return livrosEmprestados.size() <3;
    }

    public void adicionarLivro(Livro livro) {
            livrosEmprestados.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

}


