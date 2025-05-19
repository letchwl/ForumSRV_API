# ForumSRV API

API RESTful de fórum desenvolvida com Java e Spring Boot. Estruturada com boas práticas como separação por camadas, uso de DTOs por contexto (Create, Read, Update), entidades claras e persistência com PostgreSQL.

---

## Tecnologias Utilizadas

- Java 17  
- Spring Boot
- Spring Web  
- Spring Data JPA
- PostgreSQL  
- Maven  

---

## Como Rodar Localmente

1. Clone o projeto:  
   `git clone https://github.com/letchwl/ForumSRV_API.git`

2. Entre na pasta:  
   `cd ForumSRV_API`

3. Configure o PostgreSQL e edite o `application.properties`:  
   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/forumdb  
   spring.datasource.username=seu-usuario  
   spring.datasource.password=sua-senha  
   spring.jpa.hibernate.ddl-auto=update
   ```

4. Rode o projeto com Maven ou direto pela sua IDE.

---

## Endpoints

### Criar tópico  
`POST /topics`  
```json
{
  "title": "Título",
  "message": "Conteúdo do tópico",
  "userId": 1
}
```

### Listar tópicos  
`GET /topics`  
```json
[
  {
    "id": 1,
    "title": "Exemplo",
    "message": "Mensagem",
    "author": {
      "id": 1,
      "name": "Letch"
    },
    "replies": [
      {
        "id": 1,
        "message": "Resposta",
        "author": "Outro usuário"
      }
    ]
  }
]
```

### Atualizar tópico  
`PUT /topics/{id}`  
```json
{
  "title": "Novo título",
  "message": "Nova mensagem"
}
```

### Deletar tópico  
`DELETE /topics/{id}`

---

## Observações

- A aplicação não possui autenticação ainda (Spring Security).  
- Ideal para aprendizado em APIs REST, Java, JPA e boas práticas de design em backend.

---

## Autor

Desenvolvido por Raul (Letch) — 2025.
