import java.util.ArrayList;

public class Biblioteca {

    private final ArrayList<Livro> livros;
    private final ArrayList<Usuario> usuarios;

    public Biblioteca(){
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso: " + usuario.getNome());
    }

    public void realizarEmprestimo(String isbn, int idUsuario) {
        Livro livroEncontrado = null;
        for (Livro livro : livros) {
            if (livro.isbnDisponivel(isbn)) {
                livroEncontrado = livro;
                break;
            }
        }

        if (livroEncontrado == null) {
            System.out.println("Livro com ISBN " + isbn + " não disponível para empréstimo");
            return;
        }

        Usuario usuarioEncontrado = null;
        for (Usuario usuario : usuarios) {
            if (usuario.isId(idUsuario)) {
                usuarioEncontrado = usuario;
                break;
            }
        }
    }

}

