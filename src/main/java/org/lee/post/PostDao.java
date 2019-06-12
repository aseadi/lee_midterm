package org.lee.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PostDao {

	static final String ADD_POST = "INSERT post(userId,name,content) VALUES(?,?,?)";

	static final String LIST_POSTS = "SELECT postId,userId,name,content,sweet,cdate FROM post ORDER BY postId desc LIMIT ?,?";

	static final String LIKE_POST = "UPDATE post SET sweet = sweet+1 WHERE postId=?";

	static final String GET_POST = "SELECT postId, userId, name, content, sweet, cdate FROM post WHERE postId=?";

	@Autowired
	JdbcTemplate jdbcTemplate;

	RowMapper<Post> postRowMapper = new BeanPropertyRowMapper<>(Post.class);

	/**
	 * post 테이블에 저장
	 */
	public int addPost(Post post) {
		return jdbcTemplate.update(ADD_POST, post.getUserId(), post.getName(),
				post.getContent());
	}

	/**
	 * post 테이블에서 list
	 */
	public List<Post> listPosts(int offset, int count) {
		return jdbcTemplate.query(LIST_POSTS, postRowMapper, offset, count);
	}

	/**
	 * post.sweet + 1
	 */
	public int likePost(String postId) {
		return jdbcTemplate.update(LIKE_POST, postId);
	}

	/**
	 * post 테이블에서 select
	 */
	public Post getPost(String postId) {
		return jdbcTemplate.queryForObject(GET_POST, postRowMapper, postId);
	}
}