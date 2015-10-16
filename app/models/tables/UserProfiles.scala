package models.tables

import models.dao
import models.UserProfile

import com.github.tototoshi.slick.PostgresJodaSupport._
import org.joda.time.LocalDate
import play.api.db.slick.HasDatabaseConfigProvider
import slick.profile.RelationalProfile

private[models] trait UserProfiles extends HasDatabaseConfigProvider[RelationalProfile] {
  import slick.driver.PostgresDriver.api._

  protected[this] val contacts: dao.Contacts


  /** Table Definition */

  protected[this] class UserProfilesTable(tag: Tag) extends Table[UserProfile](tag, "USER_PROFILES") {
    def id = column[Long]("ID", O.PrimaryKey)
    def firstName = column[String]("FIRST_NAME", O.Length(255, true))
    def lastName = column[String]("LAST_NAME", O.Length(255, true))
    def middleName = column[String]("MIDDLE_NAME", O.Length(255, true))
    def birthdate = column[LocalDate]("BIRTHDATE", O.Length(255, true))
    def gender  = column[Char]("GENDER")
    def address = column[String]("ADDRESS",O.Length(255,true))
    def contactNo = column[String]("CONTACT_NO", O.Length(255, true))
    def * = (id.?,
      firstName,
      lastName,
      middleName,
      birthdate,
      gender,
      address,
      contactNo
    ) <> ((UserProfile.apply _).tupled, UserProfile.unapply _)


    def contact = foreignKey(
      "FK_CONTACT" + tableName, id, contacts.query
    )(_.id, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Cascade)
    def idxID = index("IDX_ID_" + tableName.toUpperCase, id, unique=true)

  }
}
