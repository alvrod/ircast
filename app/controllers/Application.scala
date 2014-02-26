package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok("Hi! I am Ircast, a toy IRC bot, coming to you from a blog post in http://alvrod.com .")
  }

}