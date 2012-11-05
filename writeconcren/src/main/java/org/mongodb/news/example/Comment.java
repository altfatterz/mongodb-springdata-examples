package org.mongodb.news.example;

import java.util.Date;

public class Comment {

	private String author;
	
	private String text;
	
	private Date date;

	public String getAuthor() {
		return author;
	}

	public String getText() {
		return text;
	}

	public Date getDate() {
		return date;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
