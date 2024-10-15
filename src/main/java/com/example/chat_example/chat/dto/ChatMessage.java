package com.example.chat_example.chat.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {

    public enum MessageType {
        ENTER, TALK     // ENTER : 입장, TALK : 대화
    }

    private MessageType messageType;
    private String roomId;  // 참여한 방 
    private String sender;  // 보내는 사람
    private String message; // 메시지

}
