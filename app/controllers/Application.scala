package controllers


import models.dao
import models.Contact
import models.UserProfile

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import com.ejisan.play.Forms._
import play.api.libs.json.Json
import javax.inject.Inject
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

import play.api.i18n.{ MessagesApi, I18nSupport }




class Application @Inject()(
  val contacts: dao.Contacts,
  val profiles: dao.UserProfiles,
  val messagesApi: MessagesApi

) extends Controller with I18nSupport {


  val submitForm = Form( mapping(
    "id" -> default(optional(longNumber),None),
    "fullName" -> nonEmptyText,
    "number" -> nonEmptyText)(Contact.apply)(Contact.unapply)
  )

  val submitProfileForm = Form( mapping(
    "id" -> optional(longNumber),
    "firstName" -> nonEmptyText,
    "lastName" -> nonEmptyText,
    "middleName" -> nonEmptyText,
    "birthdate" -> jodaLocalDate,
    "gender" -> default(character,' '),
    "address" -> nonEmptyText,
    "contactNo" -> nonEmptyText)(UserProfile.apply)(UserProfile.unapply)
  )


  def index = Action.async { request =>
    //Future.successful(BadRequest)
    contacts.all.map( result =>
      Ok(views.html.index("Phonebook",result))
    )
  }

  def add_contact = Action {  implicit request =>
    Ok(views.html.add_contact("Add Contact", submitForm, routes.Application.submitContact))
  }

  def submitContact = Action.async { implicit  request =>

    submitForm.bindFromRequest.fold(
      formWithErrors => Future.successful(Ok(views.html.add_contact("Add Contact", formWithErrors, routes.Application.submitContact))),
      data => {
          contacts.insert(data).map { r =>
            if (r > 0) Redirect(routes.Application.index())
            else BadRequest
          }

      }
    )

  }

  def deleteContact(id: Long) = Action.async {  request =>

    contacts.deleteContact(id).map(result => Redirect(routes.Application.index()))

  }

  def updateContact() = Action { implicit  request =>

    submitForm.bindFromRequest.fold(
      formWithErrors => BadRequest,
      data => {
          contacts.updateContact(data)
          Ok( Json.obj("success" -> "1"))

      }
    )

  }

  def add_profile(id: Long) = Action.async { implicit request =>


    profiles.findUserWithProfile(id).map{
            case Some((c, p)) => Ok(views.html.add_profile(id,"Edit Contact Profile", submitProfileForm.fill(p), routes.Application.submitUpdateProfile(id), Some(c), Some(p)));

            case None => Ok(views.html.add_profile(id,"Add Contact Profile", submitProfileForm, routes.Application.submitProfile(id),None,None));


    }

    //Ok(views.html.add_profile(id,"Add Contact Profile", submitProfileForm, routes.Application.submitProfile(id)));
  }

  def submitProfile(id: Long) = Action.async { implicit  request =>

    submitProfileForm.bindFromRequest.fold(
      formWithErrors => Future.successful(Ok(views.html.add_profile(id,"Add Contact Profile", formWithErrors, routes.Application.submitProfile(id),None,None))),
      data => {
          profiles.insertUserProfile(data).map { r =>
            if (r > 0) Redirect(routes.Application.index())
            else BadRequest
          }

      }
    )

  }
  def submitUpdateProfile(id: Long) = Action.async { implicit  request =>

    submitProfileForm.bindFromRequest.fold(
      formWithErrors => Future.successful(Ok(views.html.add_profile(id,"Edit Contact Profile", formWithErrors, routes.Application.submitProfile(id),None,None))),
      data => {
          profiles.updateUserProfile(data).map { r =>
            if (r) Redirect(routes.Application.index())
            else BadRequest
          }

      }
    )
  }



  def getUserProfile(id: Long) = Action.async { request =>

    profiles.findUserWithProfile(id).map{
      case Some((c, p)) => Ok("contact:"+Json.toJson(c) +" & profile :" + Json.toJson(p) )
      case None => BadRequest
    }

  }

}
