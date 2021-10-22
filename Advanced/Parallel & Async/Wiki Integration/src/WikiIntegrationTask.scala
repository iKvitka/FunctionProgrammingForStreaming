import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.Http
import akka.http.scaladsl.marshallers.xml.ScalaXmlSupport._
import akka.http.scaladsl.model.Uri.Query
import akka.http.scaladsl.model._
import akka.http.scaladsl.model.headers._
import akka.http.scaladsl.unmarshalling.Unmarshal

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{ExecutionContextExecutor, Future}
import scala.xml.NodeSeq

object WikiIntegrationTask {

  def retrieveLatestChanges(): Future[Seq[WikiChange]] =
    Future(
      Seq(
        WikiChange("test driven development",
                   Uri("https://en.wikipedia.org/wiki/Test-driven_development"),
                   Uri("https://www.youtube.com/watch?v=dQw4w9WgXcQ"),
                   "for lulz",
                   LocalDateTime.now().minusDays(1337))))

  case class WikiChange(title: String, link: Uri, guid: Uri, description: String, pubDate: LocalDateTime)

}
