import org.apache.camel._
import play.api._
import play.api.Play.current
import play.api.libs.json._

class MsgProcessor {
  def setJson(exchange: Exchange) {
	val jsonObj = Json.toJson(
		Map(
			"data" -> exchange.getIn.getBody.toString,
			"user" -> exchange.getIn.getHeader("irc.user.nick").toString,
			"date" -> exchange.getProperty(Exchange.CREATED_TIMESTAMP).toString
		)
	)			
	val newBody = Json.stringify(jsonObj)
	Logger.info(s"Processing $newBody")
	exchange.getIn.setBody(newBody)
  }
}
