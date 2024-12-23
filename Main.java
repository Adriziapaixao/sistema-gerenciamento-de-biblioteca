import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            System.out.println("*** Bem-vindo ao Sistema de Gerenciamento de Biblioteca!***");
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Cadastrar Usuário");
            System.out.println("3. Realizar Empréstimo");
            System.out.println("4. Realizar Devolução ");
            System.out.println("5. Exibir livros disponíveis");
            System.out.println("6. Exibir todos os livros cadastrados");
            System.out.println("7. Exibir Livros emprestados de um usuário");
            System.out.println("8. SAIR");

            int opcao = scr.nextInt();
            scr.nextLine();


            switch (opcao) {

                case 1:

                    System.out.println("Informe o título do livro para cadastro: ");
                    String tituloDoLivro = scr.nextLine();
                    System.out.println("Informe o autor do livro: ");
                    String autorDoLivro = scr.nextLine();
                    System.out.println("Informe o ISBN do livro: ");
                    String isbnDoLivro = scr.nextLine();
                    biblioteca.cadastrarLivro(new Livro(tituloDoLivro, autorDoLivro, isbnDoLivro));
                    System.out.println("Livro cadastrado com sucesso: ");
                    break;
                case 2:
                    System.out.println("Informe o nome do usuário para cadastro: ");
                    String nomeDoUsuario = scr.nextLine();
                    System.out.println("Informe um ID para o usuário: ");
                    int idUsuario = scr.nextInt();
                    scr.nextLine();
                    biblioteca.cadastrarUsuario(new Usuario(nomeDoUsuario, idUsuario));
                    System.out.println("Usuário cadastrado com sucesso: ");
                    break;
                case 3:
                    System.out.println("Digite o ISBN do livro: ");
                    String isbnDoLivroParaEmprestimo = scr.nextLine();
                    System.out.println("Informe o ID do usuário: ");
                    int idUsuarioParaEmprestimo = scr.nextInt();
                    scr.nextLine();
                    Livro livroEmprestimo = biblioteca.buscarLivroPorIsbn(isbnDoLivroParaEmprestimo);
                    Usuario usuarioEmprestimo = biblioteca.buscarUsuarioPorId(idUsuarioParaEmprestimo);

                    if (livroEmprestimo == null) {
                        System.out.println("Livro não encontrado.");
                    } else if (usuarioEmprestimo == null) {
                        System.out.println("Usuário não encontrado.");
                    } else if (!livroEmprestimo.isbnDisponivel()) {
                        System.out.println("O livro não está disponível para empréstimo.");
                    } else if (!usuarioEmprestimo.podeEmprestar()) {
                        System.out.println("O usuário já atingiu o limite de emprestimos (máximo de 3 livros).");
                    } else {
                        livroEmprestimo.emprestar();
                        usuarioEmprestimo.adicionarLivro(livroEmprestimo);
                        System.out.println("Empréstimo realizado com sucesso!");

                    }
                    break;
                case 4:
                    System.out.println("Digite o ISBN do livro: ");
                    String isbnDevolucao = scr.nextLine();
                    System.out.println("Digite um ID para o usuário: ");
                    int idUsuarioDevolucao = scr.nextInt();
                    scr.nextLine();
                    Livro livroDevolucao = biblioteca.buscarLivroPorIsbn(isbnDevolucao);
                    Usuario usuarioDevolucao = biblioteca.buscarUsuarioPorId(idUsuarioDevolucao);

                    if (livroDevolucao == null || usuarioDevolucao == null) {
                        System.out.println("Livro ou usuário não encontrado.");
                    } else {
                        livroDevolucao.devolver();
                        usuarioDevolucao.removerLivro(livroDevolucao);
                        System.out.println("Devolução realizado com sucesso!");
                    }
                    break;
                case 5:
                    System.out.println("Livros disponíveis: ");
                    ArrayList<Livro> livrosDisponiveis = biblioteca.getLivrosDisponiveis();
                    if (livrosDisponiveis.isEmpty()) {
                        System.out.println("Não há livros disponíveis no momento.");
                    } else {
                        for (Livro livro : livrosDisponiveis) {
                            System.out.println(livro.detalhes());
                        }
                    }
                    break;
                case 6:
                    System.out.println("Todos os livros cadastrados no sistema: ");
                    for (Livro livro : biblioteca.getLivrosCadastrados()) {
                        System.out.println(livro.detalhes());
                    }
                    break;
                case 7:
                    System.out.println("Digite o ID do usuário: ");
                    int idUsuarioDoLivro = scr.nextInt();
                    scr.nextLine();
                    exibirLivrosEmprestados(biblioteca, idUsuarioDoLivro);
                    break;
                case 8:
                    System.out.println("Encerrando o sistema. Até logo!");
                    scr.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
            System.out.println("Pressione 'Enter' para continuar...");
            scr.nextLine();
            System.out.println();
        }

    }

    private static void exibirLivrosEmprestados(Biblioteca biblioteca, int idUsuarioDoLivro) {
        Usuario usuario = biblioteca.buscarUsuarioPorId(idUsuarioDoLivro);

        if (usuario == null) {
            System.out.println("Usuario não encontrado.");
        } else {
            System.out.println("Livro emprestado por " + usuario.getNome() + ":");
            if (usuario.getLivrosEmprestados().isEmpty()) {
                System.out.println("Nenhum livro emprestado.");
            } else {
                for (Livro livro : usuario.getLivrosEmprestados()) {
                    System.out.println(livro.detalhes());
                }
            }
        }
    }
}