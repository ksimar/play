package controllers

import com.google.inject
import play.api.mvc.{Action, Controller}
import javax.inject._

class LogInController @Inject() extends Controller {

  def logIn = Action {
    Ok(views.html.logIn())
  }

}
