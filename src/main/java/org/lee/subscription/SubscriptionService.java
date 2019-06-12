package org.lee.subscription;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {

	@Autowired
	SubscriptionDao subscriptionDao;

	Logger logger = LogManager.getLogger();

	/**
	 * (1) 구독/구독해제
	 */
	public void subscribe() {
		Subscription subscription = new Subscription();
		subscription.setUserId("19");
		subscription.setName("정택환");
		subscription.setChannelId("3");
		subscription.setTitle("데스런");

		try {
			subscriptionDao.addSubscription(subscription);
			logger.debug("구독했습니다.");
		} catch (DuplicateKeyException e) {
			// 이미 구독하고 있는 경우 구독해제
			subscriptionDao.deleteSubscription(subscription);
			logger.debug("구독해제 했습니다.");
		}
	}

	/**
	 * (2) 구독 목록
	 */
	public void listSubscriptions() {
		// 19번 사용자의 구독 목록
		List<Subscription> subscriptionList = subscriptionDao
				.listSubscriptions("19");
		logger.debug(subscriptionList);
	}
}