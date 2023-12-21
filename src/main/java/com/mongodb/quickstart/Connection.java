package com.mongodb.quickstart;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoClient;

public class Connection {


    public static void main(String[] args) {
        try {
            MongoClient mongoClient = ConnectionSingelton.getMongoClient();
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            for(Document db: databases){
                System.out.println(db.toString());
            }
 
        } catch (Exception exception) {
            System.err.println(exception.getClass().getName() + " " + exception.getMessage());
        }

    }
}