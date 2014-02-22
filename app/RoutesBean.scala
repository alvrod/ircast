import org.apache.camel._
import play.api._
import play.api.Play.current

class RoutesBean {
  def setRoot(exchange: Exchange) {
    val root = s"${Play.application(current).path.getPath()}/public"
    Logger.info(s"setting root $root to exchange")
    exchange.getIn.setHeader("AppRoot", root)
	exchange.getIn.setBody(exchange.getIn.getBody() + "\r\n")
  }
}
