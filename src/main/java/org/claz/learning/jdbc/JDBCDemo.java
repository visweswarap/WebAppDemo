package org.claz.learning.jdbc;


import com.mongodb.MongoCredential;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.internal.MongoClientImpl;

public class JDBCDemo {

        public static void main( String args[] ) {
            // Creating a Mongo client
            MongoClient mongo = new MongoClientImpl( null, null);
            // Creating Credentials
            MongoCredential credential;
            credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
            System.out.println("Connected to the database successfully");
            //Accessing the database
            MongoDatabase database = mongo.getDatabase("myDb");
            //Creating a collection
            database.createCollection("sampleCollection");
            System.out.println("Collection created successfully");
        }

}
