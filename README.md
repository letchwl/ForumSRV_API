
# ForumSRV (Service) API

A **ForumSRV** é uma API REST desenvolvida em Java com Spring Boot, voltada para a criação e gerenciamento de tópicos e respostas em um sistema de fórum. Este projeto é ideal para aprender e aplicar conceitos fundamentais de desenvolvimento backend com foco em APIs modernas e escaláveis.

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
  - Spring Web
  - Spring Data JPA
  - Spring Security *(em breve)*
- PostgreSQL
- Maven
- Postman *(para testes de requisições)*

## 🧠 Conceitos Praticados

- Arquitetura RESTful
- Camadas Controller, Service e Repository
- Uso de DTOs (Data Transfer Objects)
- Mapeamento objeto-relacional com JPA/Hibernate
- Validação de dados
- Estruturação de projeto limpa e escalável
- Criação de endpoints GET e POST
- Tratamento de erros e responses HTTP

## 🗃️ Estrutura de Pacotes

```
com.raullalves.forum
├── controller
├── dto
├── model
├── repository
```

## 📌 Funcionalidades

- 🔎 **Listar tópicos** – Endpoint GET para retornar todos os tópicos registrados.
- 📝 **Criar tópico** – Endpoint POST com envio de título e mensagem.
- 💬 **(em breve)** Criar e listar respostas.
- 🔐 **(em breve)** Sistema de autenticação com Spring Security e JWT.

## 🔧 Requisitos para rodar

- Java 17+
- PostgreSQL rodando com banco configurado
- Maven

## ▶️ Como rodar o projeto

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/forum-srv-api.git
```

2. Configure o `application.properties` com seus dados do banco:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/forumdb
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

3. Rode o projeto:
```bash
./mvnw spring-boot:run
```

4. Teste os endpoints no Postman:
- `GET http://localhost:8080/topic`
- `POST http://localhost:8080/topic`

## ✍️ Autor

Desenvolvido por **Raul Alves (Letch)** – estudante de backend, apaixonado por Java e arquitetura de sistemas escaláveis.
