// package com.MongoConnection;

// import com.mongodb.client.MongoClients;
// import com.mongodb.client.MongoClient;
// import com.mongodb.ConnectionString;
// import com.mongodb.MongoClientSettings;
// import com.mongodb.ServerApi;
// import com.mongodb.ServerApiVersion;

// public class MongoConnection {
//   private static MongoClient mongoClient;

//   public static synchronized MongoClient getMongoClient() {
//     if (mongoClient == null) {
//       ConnectionString ConnectionString = new ConnectionString(
//           "mongodb+srv://admin:<Arash3132>@mycluster.yf2nch3.mongodb.net/?retryWrites=true&w=majority");
//       MongoClientSettings settings = MongoClientSettings.builder()
//           .applyConnectionString(ConnectionString)
//           .serverApi(ServerApi.builder()
//               .version(ServerApiVersion.V1)
//               .build())
//           .build();
//       mongoClient = MongoClients.create(settings);
//     }
//     return mongoClient;
//   }

// }
