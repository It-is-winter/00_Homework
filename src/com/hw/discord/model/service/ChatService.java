package com.hw.discord.model.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hw.discord.model.dto.ChatDto;
import com.hw.discord.model.vo.Chat;

public class ChatService {
	private List<Chat> chats = new ArrayList();
	int chatId;
	{
//		chats.add(new Chat(++chatId, "첫 채팅", new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date())));
	}
	
	/*
	 * All chats
	 */
	public List<Chat> findAll() {
		if(!chats.isEmpty()) {
			return chats;
		}
		return null;
	}
	
	/*
	 * Create a new chat
	 * Not Empty
	 * The text at most 30
	 */
	public int createChat(ChatDto chat) {
		String chatText = chat.getChatText();
		boolean checkedText = validateText(chatText);
		if(checkedText) {
			chats.add(new Chat(++chatId, chatText, new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date())));
			return 1;
		}
		return 0;
	}
	
	/*
	 * Check that the text is not empty and its length is at most 30
	 */
	public boolean validateText(String text) {
		if((0 < text.length()) && (text.length() <= 30)) {
			return true;
		}
		return false;
	}

}
