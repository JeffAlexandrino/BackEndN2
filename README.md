## Introdução

### Configuração
Para iniciar o ambiente de desenvolvimento, siga as etapas abaixo conforme o sistema operacional:

**Windows:**
- Faça o download do [OpenJdk 21](https://jdk.java.net/21/)
- Instale ou adicione a pasta `/bin` ao PATH do Windows
- Execute o comando `java --version` em um shell/terminal. O resultado deve ser semelhante ou idêntico a:
    > openjdk 21.0.2 2024-01-16     
    > OpenJDK Runtime Environment (build 21.0.2+13-58)      
    > OpenJDK 64-Bit Server VM (build 21.0.2+13-58, mixed mode, sharing)    
- **Opcional:** Instale o Gradle
  
# Funcionamento

Todas as rotas foram definidas na coleção do Postman, disponível em [postman_collection](./postman_collection.json).

## Controladores e Endpoints:

### Controller:

#### [GET] /ajuda
Retorna os dados do aluno e do projeto.

### Book Backlog:

#### [GET] /searchBook  
Realiza busca por livros na API de terceiros.
    
#### [GET] /PessoaFind
Busca autores na API de terceiros.

#### [GET] /getBook     
Recupera dados de um livro com base no ID dele na API de terceiros.

### Book List Controller:

#### [GET] /watchlist
Recupera todos os dados da lista de livros.

#### [GET] /watchlistfilter
Recupera dados da lista de livros filtrados.

#### [GET] /watchlistmovie
Recupera um livro da lista com base no ID.

#### [PUT] /readlist 
Altera todos os valores de um livro da lista com base no ID mais dados novos.

#### [DELETE] /readlist
Deleta um livro da lista se baseando no ID dele.
