import play.api._
import org.springframework.context.support.ClassPathXmlApplicationContext

object Global extends GlobalSettings {
 
  override def onStart(app: Application) {
    Logger.info("Application has started")
    initCamel
  }
 
  def initCamel() {
    // Start Camel
    new ClassPathXmlApplicationContext("camel-context.xml")
  }
}
