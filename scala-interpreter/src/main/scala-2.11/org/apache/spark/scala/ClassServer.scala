package org.apache.spark.scala

/**
  * Created by piyushm on 22/4/16.
  */
trait ClassServer {
  val replMain = org.apache.spark.repl.Main
  replMain.main(Array())
  val sparkConf = replMain.conf
  println("#############   " + sparkConf.get("spark.repl.class.uri"))
  def classFileServerUri = sparkConf.get("spark.repl.class.uri")
}
