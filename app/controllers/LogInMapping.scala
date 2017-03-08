//package controllers
//
//import models.Credentials
import models.Credentials
import play.api.data._
import play.api.data.Forms._
import play.api.mvc.Action


/**
  * Created by dell on 3/8/2017.
  */
class LogInMapping {

  val logInForm : Form[Credentials] = Form(
    mapping(
      "userName" -> nonEmptyText,
      "password" -> nonEmptyText
    )(Credentials.apply)(Credentials.unapply)
  )

////  def validate = Action {
////    implicit request =>
////      logInForm.bindFromRequest.fold(
////        formWithErrors => {
////          Redirect(routes.LogInController.logIn()).flashing(
////
////          )
////        },
////        userCredentials => {}
////      )
////  }
//
}
