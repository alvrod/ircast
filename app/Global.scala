import play.api._
import play.api.Play.current
import play.api.libs.concurrent._
import play.api.libs.concurrent.Execution.Implicits._
import scala.concurrent.duration._
import akka.camel.CamelExtension
import org.springframework.context.support.ClassPathXmlApplicationContext

object Global extends GlobalSettings {
 
  override def onStart(app: Application) {
    Logger.info("Application has started")
    initCamel
  }
 
  def initCamel() {
    // Start Camel
    val camel = CamelExtension(Akka.system)
    val camelContext = camel.context
    camelContext.start()
    new ClassPathXmlApplicationContext("camel-context.xml")
  }
}
