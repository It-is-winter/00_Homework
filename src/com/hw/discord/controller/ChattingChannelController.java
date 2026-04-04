package com.hw.discord.controller;

import java.util.List;

import com.hw.discord.model.dto.ChattingChannelDto;
import com.hw.discord.model.service.ChattingChannelService;
import com.hw.discord.model.vo.ChattingChannel;

/*
 * view에서 사용자의 요청을 받아서 service로 전달
 * service의 응답을 사용자에게 전달
 */
public class ChattingChannelController {
	private ChattingChannelService channelService = new ChattingChannelService();
	
	/*
	 * 전체 채널 조회
	 */
	public List<ChattingChannel> findAll() {
		return channelService.findAll();
	}
	
	/*
	 * 채널 생성
	 */
	public int createChannel(ChattingChannelDto channel) {
		return channelService.createChannel(channel);
	}
	
	/*
	 * 채널 수정
	 */
	public int updateChannel(int channelId, ChattingChannelDto channel) {
//		System.out.println("controller: " + channelId);
//		System.out.println("service: " + channel.getChannelName());
//		System.out.println("controller: " + channel.isOpen());
		return channelService.updateChannel(channelId, channel);
	}
	
	/*
	 * channelId에 대한 ChattingChannel을 찾아주는 메소드
	 */
	public ChattingChannel findById(int channelId) {
		return channelService.findById(channelId);
	}
	
	/*
	 * 채널 삭제
	 */
	public void deleteChannel(int channelId) {
		channelService.deleteChannel(channelId);
	}

}
