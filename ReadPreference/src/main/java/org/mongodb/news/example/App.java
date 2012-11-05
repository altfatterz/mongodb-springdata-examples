package org.mongodb.news.example;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import com.mongodb.ReadPreference;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring-context.xml");

		MongoOperations ops = ctx.getBean("mongoTemplate",
				MongoOperations.class);

		ops.getCollection("article")
				.setReadPreference(ReadPreference.SECONDARY);

		Article article = ops.findOne(query(where("author").is("Chris")),
				Article.class);

		System.out.println(article.getAuthor());
	}
}
