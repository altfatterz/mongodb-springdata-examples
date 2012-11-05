# MongoDB and Spring Data Examples #

The primary goal this repo is to provide examples from the MongoDB and Spring Data Webex presented at https://www.10gen.com/events/webinar/building-web-apps-mongodb-spring

## Introduction ##
These examples look at at building a simple news article application 

## create.article ##
This example models a simple new article (Article.class) as inserts it into a local MongoDB

## find.author.query ##
This example executes a simple find query to find Articles buy author

## find.author.repo ##
This example uses the Spring Data repository support to find Articles buy author

## push.comment ##
This example illustrates how a "Comment" can be pushed onto an existing Article

## inc.comment ##
This example illustrates uses the "inc" operator to keep track of comment counter within the article 

## read.preference ##
This example demonstrates how to read of mongodb secondary

## write.concern ##
This example illustrates how to control write durability within Spring Data
