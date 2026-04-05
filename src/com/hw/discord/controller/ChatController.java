package com.hw.discord.controller;

import java.util.List;

import com.hw.discord.model.dto.ChatDto;
import com.hw.discord.model.service.ChatService;
import com.hw.discord.model.vo.Chat;

public class ChatController {
	private ChatService chatService = new ChatService();
	
	/*
	 * All chats
	 */
	public List<Chat> findAll() {
		return chatService.findAll();
	}
	
	/*
	 * Create a new chat
	 */
	public int createChat(ChatDto chat) {
		return chatService.createChat(chat);
	}

}
