package org.lee.subscription;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SubscriptionMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"subscription-context.xml");
		SubscriptionService subscriptionService = context
				.getBean("subscriptionService", SubscriptionService.class);

		subscriptionService.subscribe();
		subscriptionService.listSubscriptions();
		context.close();
	}
}