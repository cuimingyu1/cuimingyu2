package com.foo

import org.apache.spark.SparkConf
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.Seconds
import org.apache.spark.streaming.kafka.KafkaUtils
import kafka.serializer.StringDecoder

object StreamingKafka {
  def main(args: Array[String]): Unit = {
     val conf=new SparkConf()
     conf.setAppName("Spark kafka")
     conf.setMaster("local[*]")
     
   val context=  new StreamingContext(conf,Seconds(5))
     context.checkpoint("d:/checkpoint")
     
     val topics = Array("cuimingy").toSet
     val sparkStream = Map[String,String]("metadata.broker.list"->"crxy99:9092")
      
    
  }
}