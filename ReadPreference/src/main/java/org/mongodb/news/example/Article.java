package org.mongodb.news.example;

import java.util.Date;
import java.util.UUID;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Article {

	@Id
	private ObjectId id;
	
	
	
	private UUID authorId;
	
	private String author;
	
	private Date date;
	
	private String title;
	
	private byte[] text;

	public ObjectId getId() {
		return id;
	}



	public UUID getAuthorId() {
		return authorId;
	}

	public void setAuthorId(UUID authorId) {
		this.authorId = authorId;
	}

	public String getAuthor() {
		return author;
	}

	public Date getDate() {
		return date;
	}

	public String getTitle() {
		return title;
	}

	public byte[] getText() {
		return text;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setText(byte[] text) {
		this.text = text;
	}
}
