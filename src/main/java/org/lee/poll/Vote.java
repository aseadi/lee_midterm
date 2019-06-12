package org.lee.poll;

/**
 * vote 테이블 모델
 * 
 * @author Jacob
 */
public class Vote {

	/**
	 * 문항 번호
	 */
	String pollId;

	/**
	 * 투표자 아이디
	 */
	String userId;

	/**
	 * 투표자 이름
	 */
	String name;

	/**
	 * 선택
	 */
	String choice;

	public String getPollId() {
		return pollId;
	}

	public void setPollId(String pollId) {
		this.pollId = pollId;
	}

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

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	@Override
	public String toString() {
		return "Vote [pollId=" + pollId + ", userId=" + userId + ", name="
				+ name + ", choice=" + choice + "]\n";
	}
}