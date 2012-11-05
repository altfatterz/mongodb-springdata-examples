package org.mongodb.news;

import java.util.Date;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring-context.xml");

		MongoOperations ops = ctx.getBean("mongoTemplate",
				MongoOperations.class);
		
		//Create article
		Article article = new Article();
		article.setAuthorId(UUID.randomUUID());
		article.setAuthor("Chris");
		article.setDate(new Date());
		article.setTitle("Hello World");
		
		//insert
		ops.insert(article);
		
	}
}
