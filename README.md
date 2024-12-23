# sistema-gerenciamento-de-biblioteca

Este é um sistema simples de gerenciamento de biblioteca em Java. O sistema permite o cadastro de livros e usuários, a realização de empréstimos e devoluções de livros, além da consulta de livros disponíveis para empréstimo.

## Funcionalidades

- *Cadastro de livros*: O administrador pode cadastrar livros na biblioteca informando título, autor e ISBN.
- *Cadastro de usuários*: O sistema permite o cadastro de usuários, que podem pegar livros emprestados.
- *Empréstimo de livros*: Os usuários podem pegar até 3 livros emprestados por vez. O livro é marcado como "não disponível" após o empréstimo.
- *Devolução de livros*: O sistema permite a devolução de livros, que retornam ao estado de "disponível".
- *Consulta de livros disponíveis*: O sistema permite consultar quais livros estão disponíveis para empréstimo.
- *Consulta de livros emprestados ao usuário*: É possível visualizar a lista de livros emprestados aos usuários

## Exemplo de Uso

```plaintext
*** Bem-vindo ao Sistema de Gerenciamento de Biblioteca!***
Escolha uma opção:
1. Cadastrar Livro
2. Cadastrar Usuário
3. Realizar Empréstimo
4. Realizar Devolução
5. Exibir livros disponíveis
6. Exibir todos os livros cadastrados
7. Exibir Livros emprestados de um usuário
8. SAIR

1
Informe o título do livro para cadastro: 
Padrões de Projetos
Informe o autor do livro: 
Erich Gamma(Org)
Informe o ISBN do livro: 
123456789
Livro cadastrado com sucesso: 
Pressione 'Enter' para continuar...

*** Bem-vindo ao Sistema de Gerenciamento de Biblioteca!***
Escolha uma opção:
1. Cadastrar Livro
2. Cadastrar Usuário
3. Realizar Empréstimo
4. Realizar Devolução
5. Exibir livros disponíveis
6. Exibir todos os livros cadastrados
7. Exibir Livros emprestados de um usuário
8. SAIR

5
Livros disponíveis: 
Título: Padrões de Projetos
Autor: Erich Gamma(Org)
ISBN: 123456789
Disponível: Sim
true
Pressione 'Enter' para continuar...