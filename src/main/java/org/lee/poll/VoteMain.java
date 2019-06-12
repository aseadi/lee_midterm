package org.lee.poll;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VoteMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"vote-context.xml");
		VoteService pollService = context.getBean("voteService",
				VoteService.class);

		pollService.voteFor();
		pollService.listVotes();
		context.close();
	}

}