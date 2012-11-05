package org.mongodb.news.repositories;

import org.bson.types.ObjectId;
import org.mongodb.news.example.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, ObjectId> {

	public Article findByAuthor(String author);
}
