import play.api.libs.json._
import play.api.data.validation.ValidationError

package object models {
  implicit object charJsonFormat extends Format[Char] {
    def reads(json: JsValue): JsResult[Char] = json match {
      case JsString(str) if str.length == 1 => JsSuccess(str(0))
      case _ => JsError(Seq(JsPath() -> Seq(ValidationError("validate.error.expected.jsstring")))) }

    def writes(char: Char): JsValue = JsString(char.toString)
  }

  implicit val profileJsonFormat: Format[UserProfile] = Json.format[UserProfile]
  implicit def ejson = Json.format[Contact]
}
