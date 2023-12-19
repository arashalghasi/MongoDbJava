package com.mongodb.quickstart;

import static com.mongodb.client.model.Filters.eq;

import org.bson.Document;

import com.mongodb.ConnectionString;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class Connection {
    public static void main(String[] args) {
        try {
            ConnectionString connectionString = new ConnectionString("mongodb+srv://arash:genova12345@mycluster.yf2nch3.mongodb.net/?retryWrites=true&w=majority");
            MongoClient mongoClient = MongoClients.create(connectionString);
            System.out.println("Successful database connection established. \n");
            // FindIterable<Document> arashDocuments = arashCollection.find();
            // for(Document docs : arashDocuments){
            //     System.out.println(docs);
            // }
            

        } catch (Exception exception) {
            System.err.println(exception.getClass().getName() + " " + exception.getMessage());
        }

    }
}