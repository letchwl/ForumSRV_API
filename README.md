# ForumSRV API

API RESTful de fÃ³rum desenvolvida com Java e Spring Boot, estruturada com boas prÃ¡ticas como separaÃ§Ã£o em camadas, uso de DTOs e retorno padronizado.

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

```plaintext
com.raullalves.forum
â”œâ”€â”€ controller        # Controladores REST
â”‚   â””â”€â”€ TopicController.java
â”‚
â”œâ”€â”€ dto               # Data Transfer Objects
â”‚   â”œâ”€â”€ CreateTopicDto.java
â”‚   â”œâ”€â”€ UpdateTopicDto.java
â”‚   â””â”€â”€ TopicDto.java
â”‚
â”œâ”€â”€ model             # Entidades JPA
â”‚   â””â”€â”€ Topic.java
â”‚
â”œâ”€â”€ repository        # Interfaces JPA
â”‚   â””â”€â”€ TopicRepository.java
â”‚
â”œâ”€â”€ service           # Regras de negÃ³cio
â”‚   â””â”€â”€ TopicService.java
â”‚
â””â”€â”€ ForumApplication.java
```

---

## Endpoints

### `GET /topic`
Retorna todos os tÃ³picos cadastrados.

**Resposta:**
```json
[
  {
    "id": 1,
    "title": "TÃ­tulo do tÃ³pico",
    "message": "ConteÃºdo do tÃ³pico"
  }
]
```

---

### `POST /topic`
Cria um novo tÃ³pico.

**Request Body:**
```json
{
  "title": "Novo TÃ­tulo",
  "mensage": "Mensagem do tÃ³pico"
}
```

**Response:**
```json
{
  "id": 2,
  "title": "Novo TÃ­tulo",
  "message": "Mensagem do tÃ³pico"
}
```

---

### `PUT /topic/{id}`
Atualiza um tÃ³pico existente.

**Request Body:**
```json
{
  "title": "TÃ­tulo atualizado",
  "message": "Mensagem atualizada"
}
```

**Response:**
```json
{
  "id": 1,
  "title": "TÃ­tulo atualizado",
  "message": "Mensagem atualizada"
}
```

---

### `DELETE /topic/{id}`
Remove um tÃ³pico pelo ID.

**Response:** `204 No Content`

---

## Boas PrÃ¡ticas Aplicadas

- DTOs para transferÃªncia de dados  
- Retorno com `ResponseEntity`  
- SeparaÃ§Ã£o por camadas: Controller, Service, Repository, DTO, Model  
- Uso de anotaÃ§Ãµes Spring como `@RestController`, `@Service`, `@Repository`  
- RequisiÃ§Ãµes com `@RequestBody` e `@PathVariable`

---

## Futuras ImplementaÃ§Ãµes

- IntegraÃ§Ã£o com PostgreSQL completa  
- ValidaÃ§Ãµes com Bean Validation (`@Valid`)  
- Swagger/OpenAPI para documentaÃ§Ã£o automÃ¡tica  
- Spring Security para autenticaÃ§Ã£o e autorizaÃ§Ã£o  
- CriaÃ§Ã£o de usuÃ¡rios e comentÃ¡rios nos tÃ³picos

---

**Desenvolvido por Letch (Raul)** â€” Projeto de estudo com Spring Boot.