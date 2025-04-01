package com.example.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        return message;  // Retorna el mensaje a todos los clientes suscritos
    }

    @MessageMapping("/entity")
    @SendTo("/topic/entities")
    public Product sendEntity(Product product) {
        return product;
    }
}
