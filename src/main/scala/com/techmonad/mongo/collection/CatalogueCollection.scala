package com.techmonad.mongo.collection

import org.mongodb.scala.bson.ObjectId
import org.mongodb.scala.{FindObservable, MongoClient, MongoCollection, MongoDatabase}

trait CatalogueCollection {

  import org.bson.codecs.configuration.CodecRegistries.{fromProviders, fromRegistries}
  import org.mongodb.scala.bson.codecs.DEFAULT_CODEC_REGISTRY
  import org.mongodb.scala.bson.codecs.Macros._

  import Implicits._

  val codecRegistry = fromRegistries(fromProviders(classOf[Catalogue]), DEFAULT_CODEC_REGISTRY)

  val database: MongoDatabase = MongoClient().getDatabase("cataloguedb").withCodecRegistry(codecRegistry)

  val collection: MongoCollection[Catalogue] = database.getCollection("catalogue")

  def save(documents: IndexedSeq[Catalogue]) = {
    collection.insertMany(documents).toBlocking.headOption
  }

  def find(): Option[List[Catalogue]] = {
    collection.find().toList.toBlocking.headOption
  }

  def drop() = {
    collection.drop().toBlocking.headOption

  }

  def update() = {

  }

}


object Catalogue {
  def apply(firstName: String, lastName: String): Catalogue =
    Catalogue(new ObjectId(), firstName, lastName)
}

case class Catalogue(
                      _id: ObjectId,
                      firstName: String,
                      lastName: String
                    )
