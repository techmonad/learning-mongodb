package com.techmonad.mongo

import com.techmonad.mongo.collection.CatalogueCollection

object MongoApp {

  def main(args: Array[String]): Unit = {
    val collection = new CatalogueCollection {}

    val catalogues = collection.find()

    catalogues foreach println

  }

}
