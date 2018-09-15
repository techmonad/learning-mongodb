package com.techmonad.mongo.connection

import org.mongodb.scala.{MongoClient, MongoDatabase}

trait MongoDBConnection extends DBConnection {

  val database: MongoDatabase = MongoConnection.mongoClient.getDatabase("cataloguedb")

}


private[connection] object MongoConnection {

  val mongoClient: MongoClient = MongoClient()

}