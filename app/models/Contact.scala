package models

import play.api.libs.json.Json

case class Contact(
  id: Option[Long],
  fullName: String,
  number: String
)

