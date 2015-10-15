package controllers


import models.dao
import models.Contact

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.libs.json.Json
import javax.inject.Inject
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future



class Application @Inject()(
  val contacts : dao.Contacts
) extends Controller {


  val submitForm = Form( mapping(
    "id" -> default(optional(longNumber),None),
    "fullName" -> nonEmptyText,
    "number" -> text)(Contact.apply)(Contact.unapply)
  )



  def index = Action.async { request =>
    //Future.successful(BadRequest)
    contacts.all.map( result =>
      Ok(views.html.index("Phonebook",result))
    )
  }

  def add_contact = Action { request =>
    Ok(views.html.add_contact("Add Contact", submitForm, routes.Application.submitContact))
  }

  def submitContact = Action.async { implicit  request =>

    submitForm.bindFromRequest.fold(
      formWithErrors => Future.successful(Ok(views.html.add_contact("Add Contact", submitForm, routes.Application.submitContact))),
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

  def tsar = Action {
    TODO
  }


}
