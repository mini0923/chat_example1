package com.example.chat_example.chat.controller;

import com.example.chat_example.chat.dto.ChatRoom;
import com.example.chat_example.chat.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/chat")
public class ChatController {

        private final ChatService chatService;

        @PostMapping
        public ChatRoom createRoom(@RequestParam String name) {
            return chatService.createRoom(name);
        }

        @GetMapping
        public List<ChatRoom> getAll() {
            return chatService.findAll();
        }


}
