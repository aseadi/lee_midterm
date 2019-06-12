package org.lee.post;

/**
 * post 테이블 모델
 * 
 * @author Jacob
 */
public class Post {

	String postId;
	String userId;
	String name;
	String content;
	String sweet;
	String cdate;

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSweet() {
		return sweet;
	}

	public void setSweet(String sweet) {
		this.sweet = sweet;
	}

	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", userId=" + userId + ", name="
				+ name + ", content=" + content + ", sweet=" + sweet
				+ ", cdate=" + cdate + "]\n";
	}
}