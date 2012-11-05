package org.mongodb.news.example;

import org.springframework.data.mongodb.core.MongoAction;
import org.springframework.data.mongodb.core.WriteConcernResolver;

import com.mongodb.WriteConcern;

public class NewsWriteConcernResolver implements WriteConcernResolver {

	public WriteConcern resolve(MongoAction action) {
		if(action.getCollectionName().equals("article")){
			return WriteConcern.JOURNAL_SAFE;
		}
		return WriteConcern.NORMAL;
	}

}
