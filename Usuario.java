public class Usuario {

    public String nome;
    public int id;
    public ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, int id, ArrayList<Livro> livrosEmprestados) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }
    public void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Livros emprestados: " + livrosEmprestados);
        if (livrosEmprestados.isEmpty()) {
            System.out.println("Nenhum livro emprestado.");
        } else {
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
}
}
