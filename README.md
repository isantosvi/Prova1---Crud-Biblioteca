**
Projeto Biblioteca - CRUD de Autor e Biblioteca**
Este projeto é uma aplicação Spring Boot para gerenciar autores e bibliotecas, com um relacionamento Many-to-Many entre essas entidades. A aplicação utiliza o banco de dados MariaDB e o JPA (Java Persistence API) para persistência de dados.

**Funcionalidades**
**CRUD completo para Autor:**

Criar um autor
Consultar todos os autores
Consultar autor por ID
Atualizar autor existente
Deletar autor
CRUD completo para Biblioteca:
Criar uma biblioteca
Consultar todas as bibliotecas
Consultar biblioteca por ID
Atualizar biblioteca existente
Deletar biblioteca

**Relacionamento entre Autor e Biblioteca utilizando Many-to-Many.**

**Como Executar o Projeto**
**Passo 1:** Configuração do Banco de Dados MariaDB
Certifique-se de ter o MariaDB instalado e em execução. Você pode criar um banco de dados chamado biblioteca para testar a aplicação.

**Passo 2:** Configuração do Banco de Dados no application.properties
No arquivo **src/main/resources/application.properties**, adicione as configurações de conexão com o seu banco de dados MariaDB.

spring.application.name=biblioteca
spring.datasource.url=jdbc:mariadb://localhost:3306/biblioteca_db
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.datasource.username=12120299
spring.datasource.password=586933Iago  
spring.jpa.database-platform=org.hibernate.dialect.MariaDBDialect
spring.jpa.hibernate.ddl-auto=update
spring.datasource.hikari.maximum-pool-size=10

**Endpoints
A aplicação expõe os seguintes endpoints para o CRUD de Autor e Biblioteca:**

Autor
**GET /autores:** Retorna todos os autores cadastrados.
**GET /autores/{id}:** Retorna um autor pelo ID.
**POST /autores:** Cria um novo autor.
**PUT /autores/{id}:** Atualiza os dados de um autor existente.
**DELETE /autores/{id}:** Deleta um autor pelo ID.

**Biblioteca**
**GET /bibliotecas:** Retorna todas as bibliotecas cadastradas.
**GET /bibliotecas/{id}:** Retorna uma biblioteca pelo ID.
**POST /bibliotecas:** Cria uma nova biblioteca.
**PUT /bibliotecas/{id}:** Atualiza os dados de uma biblioteca existente.
**DELETE /bibliotecas/{id}:** Deleta uma biblioteca pelo ID.

Tecnologias Usadas
**Spring Boot:** Framework para criar aplicações Java baseadas em microserviços.
**Spring Data JPA:** Para persistência de dados e comunicação com o banco de dados MariaDB.
**MariaDB:** Banco de dados relacional usado para persistir os dados da aplicação.
**Lombok:** Biblioteca para simplificar a escrita de código Java, eliminando boilerplate (como getters, setters, etc).
**Postman:** Uma ferramenta popular para testar APIs RESTful.

O projeto segue as boas práticas do Spring Boot, com uma arquitetura simples e eficiente para uma API RESTful que gerencia autores e bibliotecas. A estrutura está organizada da seguinte forma:

**model:** Contém as entidades Autor e Biblioteca.
**repository:** Contém os repositórios JPA para interação com o banco de dados.
**service:** Contém a lógica de negócios (não implementada neste exemplo).
**controller:** Define os endpoints da API.
O relacionamento entre Autor e Biblioteca é Many-to-Many, permitindo que um autor esteja associado a várias bibliotecas e vice-versa. A tabela intermediária biblioteca_autor gerencia esse relacionamento. A relação é mapeada com a anotação @ManyToMany e a tabela é configurada com @JoinTable. O Spring Data JPA gerencia a criação e manipulação da tabela intermediária, que contém as colunas biblioteca_id e autor_id.
