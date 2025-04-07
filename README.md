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

## Estrutura do Projeto

com.raullalves.forum  
├── controller                   # Controladores REST  
│   └── TopicController.java  
│  
├── dto                          # Data Transfer Objects  
│   ├── create                   # DTOs para criação  
│   │   └── CreateTopicDto.java  
│   │  
│   ├── read                     # DTOs para leitura  
│   │   ├── ReplyDto.java  
│   │   ├── TopicDto.java  
│   │   └── UserDto.java  
│   │  
│   └── update                   # DTOs para atualização  
│       └── UpdateTopicDto.java  
│  
├── model                        # Entidades JPA  
│   ├── Reply.java  
│   ├── Topic.java  
│   └── User.java  
│  
├── repository                   # Interfaces de persistência JPA  
│   ├── ReplyRepository.java  
│   ├── TopicRepository.java  
│   └── UserRepository.java  
│  
├── ForumApplication.java       # Classe principal da aplicação  
│  
└── resources  
    ├── application.properties   # Configurações do banco  
    └── static / templates       # (se necessário para futuramente usar Thymeleaf)  

---

## Como Rodar Localmente

1. Clone o projeto:  
   `git clone https://github.com/seu-usuario/forum-srv-api.git`

2. Entre na pasta:  
   `cd forum-srv-api`

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