package repositories

import java.time.format.DateTimeFormatter
import java.time.{LocalDateTime, ZoneOffset}

import io.getquill.{JdbcContext, MySQLDialect, PluralizedTableNames, SnakeCase}
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

trait QaDb {

  lazy val qadb = new JdbcContext[MySQLDialect, SnakeCase with PluralizedTableNames]("qadb")

  import qadb._

  implicit val dateTimeDecoder: Decoder[DateTime] =
    decoder[DateTime] {
      row => index =>
        val format = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.S")
        DateTime.parse(row.getObject(index).toString, format)
    }

  implicit val dateTimeEncoder: Encoder[DateTime] =
    encoder[DateTime](row => (idx, dateTime) =>
        row.setObject(idx, dateTime.toDate, java.sql.Types.TIMESTAMP),
      java.sql.Types.TIMESTAMP)

  implicit val optionLocalDateTimeDecoder: Decoder[Option[LocalDateTime]] =
    decoder[Option[LocalDateTime]] {
      row => index =>
        val format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S")
        if (row.getObject(index) != null)
          Some(LocalDateTime.parse(row.getObject(index).toString, format))
        else
          None
    }

  implicit val optionLocalDateTimeEncoder: Encoder[Option[LocalDateTime]] =
    encoder[Option[LocalDateTime]](row => (idx, dateTime) =>
        dateTime match {
          case Some(_) => row.setObject(idx, java.util.Date.from(dateTime.get.toInstant(ZoneOffset.UTC)), java.sql.Types.TIMESTAMP)
          case _ => row.setObject(idx, None)
        }
        ,java.sql.Types.TIMESTAMP
      )

  implicit val localDateTimeDecoder: Decoder[LocalDateTime] =
    decoder[LocalDateTime] {
      row => index =>
        val format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S")
        LocalDateTime.parse(row.getObject(index).toString, format)
    }

  implicit val localDateTimeEncoder: Encoder[LocalDateTime] =
    encoder[LocalDateTime](row => (idx, dateTime) =>
        row.setObject(idx, java.util.Date.from(dateTime.toInstant(ZoneOffset.UTC)), java.sql.Types.TIMESTAMP),
      java.sql.Types.TIMESTAMP)
}
