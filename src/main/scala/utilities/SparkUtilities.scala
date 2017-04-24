package utilities

import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by ahazarnis on 4/23/17.
  */
object SparkUtilities {

  def  getSparkContext(appName:String):SparkContext={
    val conf = new SparkConf().setAppName(appName).setMaster("local")
    val sc = new SparkContext(conf)
    sc
  }

  def getSparkSession(appName:String):SparkSession={
    val spark = SparkSession.builder()
                            .appName(appName)
                            .master("local")
                            .getOrCreate()
    spark
  }

}