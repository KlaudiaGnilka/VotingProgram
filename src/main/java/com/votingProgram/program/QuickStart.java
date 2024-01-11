package com.votingProgram.program;

import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickStart {
    public static void main(String[] args) {
//        String uri = "mongodb+srv://klaudiagnilkaa:MC7537vVwTUzPpne@cluster0.zkoacs5.mongodb.net/?retryWrites=true&w=majority";
//
//        try(MongoClient mongoClient = MongoClients.create(uri)){
//            MongoDatabase database = mongoClient.getDatabase("VotingProgram");
//            MongoCollection<Document> collection = database.getCollection("Users");
//
//            Document doc = collection.find(eq("title", "Back to the future")).first();
//            if(doc != null) {
//                System.out.printf(doc.toJson());
//            } else {
//                System.out.print("No matching documents found.");
//            }
//        }

        SpringApplication.run(QuickStart.class, args);
    }
}
