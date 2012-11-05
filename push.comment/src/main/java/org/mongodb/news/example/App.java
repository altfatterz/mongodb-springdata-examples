package org.mongodb.news.example;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring-context.xml");

		MongoOperations ops = ctx.getBean("mongoTemplate",
				MongoOperations.class);

		Comment comment = new Comment();
		comment.setAuthor("Tom");
		comment.setDate(new Date());
		comment.setText("fsdkhfksfh");

//		ops.upsert(query(where("author").is("Chris")),
//				new Update().push("comments", comment),
//				Article.class);
		
		ops.upsert(query(where("author").is("Chris")),
				new Update().pop("comments", Update.Position.FIRST),
				Article.class);
		

	}

}
