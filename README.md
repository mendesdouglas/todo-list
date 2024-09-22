# todo-list Application

Este é um projeto Spring Boot para gerenciamento de tarefas (Todo List). O banco de dados MySQL está configurado para rodar em um container Docker usando `docker-compose`.

## Pré-requisitos

Antes de iniciar o projeto, verifique se você possui os seguintes softwares instalados:

- [Java 17 ou superior](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/get-started)
- [Docker Compose](https://docs.docker.com/compose/)

## Configuração do Banco de Dados

O banco de dados MySQL é configurado através do arquivo `docker-compose.yml` e `application.yml`.

### docker-compose.yml

Certifique-se de que o arquivo `docker-compose.yml` está configurado corretamente:

```yaml
version: '3.8'
services:
  mysql:
    image: mysql:8.0
    restart: always
    environment:
      MYSQL_DATABASE: todo_list_db
      MYSQL_USER: user
      MYSQL_PASSWORD: password
      MYSQL_ROOT_PASSWORD: root_password
    ports:
      - "3306:3306"
    volumes:
      - mysql_data:/var/lib/mysql

volumes:
  mysql_data:


```application.yml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/todo_list_db
    username: user
    password: password
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true


## Iniciando o Projeto
1- Clone o repositório:
```git clone <URL do repositório>
   cd <nome do repositório>

## Inicie o Docker Compose:

Na raiz do projeto, execute o seguinte comando para iniciar o banco de dados:
```docker-compose up -d


```mvn spring-boot:run


irá iniciar http://localhost:8080.


## Uso da API

### Endpoints Disponíveis

- **GET /todos**: Listar todas as tarefas.
- **POST /todos**: Criar uma nova tarefa.
- **GET /todos/{id}**: Obter uma tarefa específica pelo ID.
- **PUT /todos/{id}**: Atualizar uma tarefa pelo ID.
- **DELETE /todos/{id}**: Remover uma tarefa pelo ID.

## Contribuição

Se você quiser contribuir para este projeto, sinta-se à vontade para enviar um pull request ou abrir uma issue.

## Licença
Este projeto é licenciado sob a [MIT License](LICENSE).