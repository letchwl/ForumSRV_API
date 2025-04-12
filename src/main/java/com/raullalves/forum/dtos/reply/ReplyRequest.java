package com.raullalves.forum.dtos.reply;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ReplyRequest(
        @NotBlank(message = "Conteúdo não pode estar vazio")
        String content,

        @NotNull(message = "O tópico é obrigatório")
        Long topicId,

        @NotNull(message = "O autor é obrigatório")
        Long userId) {
}
