package com.hw.discord.view;

import java.util.List;
import java.util.Scanner;

import com.hw.discord.controller.ChatController;
import com.hw.discord.model.dto.ChatDto;
import com.hw.discord.model.vo.Chat;

public class ChatView {
	private ChatController chatController = new ChatController();
	private Scanner sc = new Scanner(System.in);
	
	public void chatView() {
		while(true) {
			System.out.println("=======================================================");
			System.out.println("\t\t\t채팅방");
			System.out.println("=======================================================");
			findAll();
			System.out.println("-------------------------------------------------------");		
			System.out.println("1. 채팅 쓰기");
			System.out.println("2. 채팅 수정하기");
			System.out.println("3. 채팅 삭제하기");
			System.out.println("4. 돌아가기");
			System.out.println();
			System.out.print("원하시는 메뉴의 숫자를 적어주세요 >");
			String chatMenu = sc.nextLine();
			
			switch(chatMenu) {
			case "1" : createChat(); break;
			case "4" : return;
			}
		}
	}
	
	/*
	 * All chats
	 */
	private void findAll() {
		List<Chat> chats = chatController.findAll();
		int i = 0;
		if(!chats.isEmpty()) {
			for(Chat chat : chats) {
				StringBuilder sb = new StringBuilder();
				sb.append(chat.chatId());
				sb.append("\t|\t");
				sb.append(chat.chatText());
				sb.append("\n");
				sb.append("\t\t\t\t");
				sb.append(chat.createDate());
				System.out.println(sb);
				System.out.println();
				System.out.println("i = " + (i++));
			}
		} else {
			System.out.println("조회할 수 있는 채팅이 없습니다.");
		}
	}
	
	/*
	 * create a new chat
	 */
	private void createChat() {
		System.out.println("채팅 내용을 적어주세요.(30자 이하)");
		String text = sc.nextLine();
		int result = chatController.createChat(new ChatDto(text));
		if(result == 1) {
			System.out.println("채널 생성 성공했습니다.");
		} else {
			System.out.println("채널 생성에 실패했습니다.");
		}
	}

}
