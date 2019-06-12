package org.lee.subscription;

/**
 * Subscription 테이블 모델
 * 
 * @author Jacob
 */
public class Subscription {

	String userId;
	String name;
	String channelId;
	String title;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Subscription [userId=" + userId + ", name=" + name
				+ ", channelId=" + channelId + ", title=" + title + "]\n";
	}

}