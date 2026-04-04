package com.hw.discord.model.dto;

//import java.util.ArrayList;
//import java.util.List;
//
//import com.hw.discord.model.vo.ChattingChannel;

public class ChattingChannelDto {
	private Integer channelId;
	private String channelName;
	private boolean open;
//	private List<ChattingChannel> channels = new ArrayList();
//	{
//		channels.add(new ChattingChannel(++channelId, "일반", true));
//	}
	public ChattingChannelDto() {}
	public ChattingChannelDto(String channelName, boolean open) {
		this.channelName = channelName;
		this.open = open;
	}
	public ChattingChannelDto(Integer channelId, String channelName, boolean open/*, List<ChattingChannel> channels*/) {
		this.channelId = channelId;
		this.channelName = channelName;
		this.open = open;
//		this.channels = channels;
	}
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
//	public List<ChattingChannel> getChannels() {
//		return channels;
//	}
//	public void setChannels(List<ChattingChannel> channels) {
//		this.channels = channels;
//	}

}
