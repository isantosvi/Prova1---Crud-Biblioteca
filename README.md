**Projeto Biblioteca - CRUD de Autor e Biblioteca**

Este projeto é uma aplicação Spring Boot para gerenciar autores e bibliotecas, com um relacionamento Many-to-Many entre essas entidades. A aplicação utiliza o banco de dados MariaDB e o JPA (Java Persistence API) para persistência de dados.
Descrição

Este projeto foi desenvolvido utilizando Spring Boot e implementa uma API RESTful para gerenciar autores e bibliotecas, utilizando um banco de dados MariaDB. O relacionamento entre as entidades Autor e Biblioteca é feito de forma Many-to-Many, permitindo associar múltiplos autores a várias bibliotecas.

Estrutura do Projeto
A estrutura do projeto está organizada da seguinte forma:

**model:** Contém as entidades Autor e Biblioteca.

**repository:** Contém os repositórios JPA para interação com o banco de dados.

**service**: Contém a lógica de negócios (não implementada neste exemplo).

**controller:** Define os endpoints da API REST.

**Relacionamento Entre as Entidades**

O relacionamento entre Autor e Biblioteca é um Many-to-Many, o que significa que um autor pode ser associado a várias bibliotecas e uma biblioteca pode ter vários autores. A tabela intermediária biblioteca_autor gerencia esse relacionamento.

**Como Funciona**

**Autor.java:** 
Representa a entidade Autor.

Biblioteca.java: Representa a entidade Biblioteca.

Tabela intermediária: A tabela biblioteca_autor é criada automaticamente pelo Spring Data JPA, contendo as colunas biblioteca_id e autor_id.

Funcionalidades
A API oferece os seguintes endpoints para interagir com os dados:

GET /autores: Lista todos os autores.

GET /autores/{id}: Retorna um autor pelo ID.

POST /autores: Cria um novo autor.

PUT /autores/{id}: Atualiza os dados de um autor existente.

DELETE /autores/{id}: Remove um autor.

GET /bibliotecas: Lista todas as bibliotecas.

GET /bibliotecas/{id}: Retorna uma biblioteca pelo ID.

POST /bibliotecas: Cria uma nova biblioteca.

PUT /bibliotecas/{id}: Atualiza os dados de uma biblioteca existente.

DELETE /bibliotecas/{id}: Remove uma biblioteca.
