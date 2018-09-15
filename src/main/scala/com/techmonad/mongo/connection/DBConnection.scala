package com.techmonad.mongo.connection

import org.mongodb.scala.MongoDatabase

trait DBConnection {
  val database: MongoDatabase
}

