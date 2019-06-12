package org.lee.subscription;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class SubscriptionDao {

	static final String ADD_SUBSCRIPTION = "INSERT subscription(userId,name,channelId,title) VALUES(?,?,?,?)";

	static final String DELETE_SUBSCRIPTION = "DELETE FROM subscription WHERE (userId, channelId)=(?,?)";

	static final String LIST_SUBSCRIPTIONS = "SELECT channelId,title FROM subscription WHERE userId=?";

	@Autowired
	JdbcTemplate jdbcTemplate;

	RowMapper<Subscription> subscriptionRowMapper = new BeanPropertyRowMapper<>(
			Subscription.class);

	/**
	 * subscription 테이블에 저장
	 */
	public int addSubscription(Subscription subscription) {
		return jdbcTemplate.update(ADD_SUBSCRIPTION, subscription.getUserId(),
				subscription.getName(), subscription.getChannelId(),
				subscription.getTitle());
	}

	/**
	 * subscription 테이블에서 삭제
	 */
	public int deleteSubscription(Subscription subscription) {
		return jdbcTemplate.update(DELETE_SUBSCRIPTION,
				subscription.getUserId(), subscription.getChannelId());
	}

	/**
	 * subscription 테이블에서 리스트
	 */
	public List<Subscription> listSubscriptions(String userId) {
		return jdbcTemplate.query(LIST_SUBSCRIPTIONS, subscriptionRowMapper,
				userId);
	}
}