package utils

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import com.fasterxml.jackson.databind.{DeserializationFeature, ObjectMapper}
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.fasterxml.jackson.module.scala.experimental.ScalaObjectMapper

trait JsonUtils {

  val mapper = new ObjectMapper() with ScalaObjectMapper
  mapper.registerModule(DefaultScalaModule)
  val javaTime = new JavaTimeModule
  javaTime.addDeserializer[LocalDateTime](classOf[LocalDateTime], new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
  javaTime.addSerializer[LocalDateTime](classOf[LocalDateTime], new LocalDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
  mapper.registerModule(javaTime)
  mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

  def toJson(value: Map[Symbol, Any]): String = {
    toJson(value map { case (k, v) => k.name -> v })
  }

  def toJson(value: Any): String = {
    mapper.writeValueAsString(value)
  }

  def toMap[V](json: String)(implicit m: Manifest[V]) = fromJson[Map[String, V]](json)

  def fromJson[T](json: String)(implicit m: Manifest[T]): T = {
    mapper.readValue[T](json)
  }

}

//object JsonUtils {
//
//  val mapper = new ObjectMapper() with ScalaObjectMapper
//  mapper.registerModule(DefaultScalaModule)
//  mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
//
//  def toJson(value: Map[Symbol, Any]): String = {
//    toJson(value map { case (k, v) => k.name -> v })
//  }
//
//  def toJson(value: Any): String = {
//    mapper.writeValueAsString(value)
//  }
//
//  def toMap[V](json: String)(implicit m: Manifest[V]) = fromJson[Map[String, V]](json)
//
//  def fromJson[T](json: String)(implicit m: Manifest[T]): T = {
//    mapper.readValue[T](json)
//  }
//
//}
