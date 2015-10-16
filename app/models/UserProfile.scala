package models
import play.api.libs.json.Json
import org.joda.time.LocalDate

case class UserProfile(

  id: Option[Long],
  firstName: String,
  lastName: String,
  middleName: String,
  birthdate: LocalDate,
  gender: Char,
  address: String,
  contactNo: String

)


// object UserProfile {
//   implicit def ejson = Json.format[UserProfile]
// }
