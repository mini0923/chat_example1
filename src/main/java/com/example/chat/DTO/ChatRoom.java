package com.example.chat.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ChatRoom {

        private String roomId;
        private String name;

        @Builder
        public static ChatRoom create(String name) {
            ChatRoom chatRoom = new ChatRoom();
            chatRoom.roomId = UUID.randomUUID().toString();
            chatRoom.name = name;
            return chatRoom;
        }


}
