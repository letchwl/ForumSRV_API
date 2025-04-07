# ForumSRV API

API RESTful de fórum desenvolvida com Java e Spring Boot, estruturada com boas práticas como separação em camadas, uso de DTOs e retorno padronizado.

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
├── controller            # Controladores REST  
│   └── TopicController.java  
│  
├── dto                   # Data Transfer Objects  
│   ├── CreateTopicDto.java  
│   ├── UpdateTopicDto.java  
│   └── TopicDto.java  
│  
├── model                 # Entidades JPA  
│   └── Topic.java  
│  
├── repository            # Interfaces JPA  
│   └── TopicRepository.java  
│  
└── service               # Lógica de negócio  
    └── TopicService.java  

---

## Como Rodar o Projeto Localmente

1. Clone o repositório:  
   `git clone https://github.com/seu-usuario/forum-srv-api.git`

2. Navegue até o diretório do projeto:  
   `cd forum-srv-api`

3. Configure o banco de dados PostgreSQL e atualize o `application.properties`:  
   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/forumdb  
   spring.datasource.username=seu-usuario  
   spring.datasource.password=sua-senha  
   ```

4. Rode o projeto com o Maven ou diretamente pela sua IDE.

---

## Endpoints

### Criar tópico  
`POST /topics`  
Corpo:  
```json
{
  "title": "Título do tópico",
  "message": "Mensagem do tópico"
}
```

### Listar tópicos  
`GET /topics`  
Resposta:  
```json
[
  {
    "id": 1,
    "title": "Título",
    "message": "Mensagem"
  }
]
```

### Atualizar tópico  
`PUT /topics/{id}`  
Corpo:  
```json
{
  "title": "Novo título",
  "message": "Nova mensagem"
}
```

### Deletar tópico  
`DELETE /topics/{id}`

---

## Contato

Projeto criado por Raul (Letch) para fins de aprendizado.