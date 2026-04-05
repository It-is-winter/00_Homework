package com.hw.discord.model.dto;

public class ChatDto {
	private Integer chatId;
	private String chatText;
	private String createDate;
	public ChatDto() {}
	public ChatDto(String chatText) {
		this.chatText = chatText;
	}
	public ChatDto(Integer chatId, String chatText, String createDate) {
		this.chatId = chatId;
		this.chatText = chatText;
		this.createDate = createDate;
	}
	public Integer getChatId() {
		return chatId;
	}
	public void setChatId(Integer chatId) {
		this.chatId = chatId;
	}
	public String getChatText() {
		return chatText;
	}
	public void setChattingText(String chatText) {
		this.chatText = chatText;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

}
