package com.example.chat.repository;

import com.example.chat.DTO.ChatRoom;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ChatRoomRepository {

        private Map<String, ChatRoom> chatRoomMap;

        @PostConstruct
        private void init() {
            chatRoomMap = new LinkedHashMap<>();
        }

        public List<ChatRoom> findAllRoom() {
            // 채팅방 생성 순서 최근 순으로 반환
            List <ChatRoom> chatRoom = new ArrayList<>(chatRoomMap.values());
            Collections.reverse(chatRoom);
            return chatRoom;
        }

        public ChatRoom findRoomById(String id){
            return chatRoomMap.get(id);
        }

        public ChatRoom createChatRoom(String name) {
            ChatRoom chatRoom = ChatRoom.create(name);
            chatRoomMap.put(chatRoom.getRoomId(), chatRoom);
            return chatRoom;
        }
}
