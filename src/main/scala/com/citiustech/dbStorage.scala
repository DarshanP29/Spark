package com.citiustech

import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession
import org.slf4j.LoggerFactory

object dbStorage {
  def main(args: Array[String]): Unit ={

    Logger.getLogger("org").setLevel(Level.ERROR)

//    val Logger = LoggerFactory.getLogger(dbStorage.getClass)
//    Logger.info("Local hadoop env setup")
    System.setProperty("hadoop.home.dir", "C:\\winutils")


    val spark = SparkSession.builder().master("local[1]").getOrCreate()
    val df = spark.read.option("multiline","true").format("JSON").load("C:\\Users\\DarshanP\\Downloads\\examples-json\\patient-example.json")
//    Logger.info("Dataframe schema Printing")
//    df.printSchema()
    //    store(df)

//    val config_details : Map[String, String] = spark.conf.getAll
//    println("configuration details: " + config_details )

//    val orgCode = spark.conf.get("orgCode")
//    println("ORG_CODE: " + orgCode)

    println(spark.conf.get("jdbc.password"))






        }

        }



