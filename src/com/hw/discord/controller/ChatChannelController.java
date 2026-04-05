package com.hw.discord.controller;

import java.util.List;


import com.hw.discord.model.dto.ChatChannelDto;
import com.hw.discord.model.service.ChatChannelService;
import com.hw.discord.model.vo.ChatChannel;

/*
 * view에서 사용자의 요청을 받아서 service로 전달
 * service의 응답을 사용자에게 전달
 */
public class ChatChannelController {
	private ChatChannelService channelService = new ChatChannelService();
	
	/*
	 * 전체 채널 조회
	 */
	public List<ChatChannel> findAll() {
		return channelService.findAll();
	}
	
	/*
	 * 채널 생성
	 */
	public int createChannel(ChatChannelDto channel) {
		return channelService.createChannel(channel);
	}
	
	/*
	 * 채널 수정
	 */
	public int updateChannel(int channelId, ChatChannelDto channel) {
		return channelService.updateChannel(channelId, channel);
	}
	
	/*
	 * channelId에 대한 ChattingChannel을 찾아주는 메소드
	 */
	public ChatChannel findById(int channelId) {
		return channelService.findById(channelId);
	}
	
	/*
	 * 채널 삭제
	 */
	public String deleteChannel(int channelId) {
		return channelService.deleteChannel(channelId);
	}

}
