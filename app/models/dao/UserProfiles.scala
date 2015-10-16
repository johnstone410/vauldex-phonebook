package models.dao

import models.tables
import models.{ UserProfile, Contact }

import scala.concurrent.Future
import javax.inject.{ Inject, Singleton }

import play.api.db.slick.DatabaseConfigProvider
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import com.github.tototoshi.slick.PostgresJodaSupport._

@Singleton
final class UserProfiles @Inject()(
  protected val dbConfigProvider: DatabaseConfigProvider,
  val contacts: Contacts
) extends tables.UserProfiles {
  import slick.driver.PostgresDriver.api._


  /** Table query */
  object query extends TableQuery(new UserProfilesTable(_)) {
    /** Finding user by user's id query */
    def filterById(id: Long): Query[UserProfilesTable, UserProfile, Seq] = this.filter(_.id === id)
    /** Finding user by user-name query */
    //def filterByNumber(number: String): Query[UserProfilesTable, UserProfile, Seq] = this.filter(_.number === number)
  }
  /** Get all user list */
  def all: Future[Seq[UserProfile]] = db.run(query.result)
  /** Find user by user's id */
  def findById(id: Long): Future[Option[UserProfile]] = db.run(query.filterById(id).result.headOption)

  /** Find user by user-name */
  //def findByNumber(number: String): Future[Option[UserProfile]] = db.run(query.filterByNumber(number).result.headOption)

  /** Returns user's existence, and it's searched by user's id */
  def idExists(id: Long): Future[Boolean] = db.run(query.filterById(id).exists.result)

  /** Insert new profile */
  def insertUserProfile(userProfile: UserProfile): Future[Long] = db.run((query returning query.map(_.id)) += userProfile)

  /** Delete profile */
  def deleteUserProfile(id: Long) : Future[Boolean] = db.run(query.filterById(id).delete.map(_ > 0));

  /** Update profile */
  def updateUserProfile(userProfile: UserProfile) : Future[Boolean] = db.run(query.filterById(userProfile.id.get).update(userProfile).map(_ > 0));

  def findUserWithProfile(id: Long): Future[Option[(Contact, UserProfile)]] = db.run {
    val q = for {
      profile <- query if profile.id === id
      contact <- profile.contact
    } yield (contact, profile)
    q.result.headOption
  }
}
