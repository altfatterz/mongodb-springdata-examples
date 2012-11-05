package org.mongodb.news.example;

import org.mongodb.news.repositories.ArticleRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring-context.xml");

    	ArticleRepository repo = ctx.getBean("articleRepository",
				ArticleRepository.class);

		//find

    	Article article = repo.findByAuthor("Chris");
    	
    	System.out.println(article.getAuthor());
    }
}
