package models.dao

import models.tables
import models.Contact

import scala.concurrent.Future
import javax.inject.{ Inject, Singleton }

import play.api.db.slick.DatabaseConfigProvider
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import com.github.tototoshi.slick.PostgresJodaSupport._

@Singleton
final class Contacts @Inject()(
  protected val dbConfigProvider: DatabaseConfigProvider
) extends tables.Contacts {
  import slick.driver.PostgresDriver.api._

  /** Table query */
  object query extends TableQuery(new ContactsTable(_)) {
    /** Finding user by user's id query */
    def filterById(id: Long): Query[ContactsTable, Contact, Seq] = this.filter(_.id === id)
    /** Finding user by user-name query */
    def filterByNumber(number: String): Query[ContactsTable, Contact, Seq] = this.filter(_.number === number)
  }
  /** Get all user list */
  def all: Future[Seq[Contact]] = db.run(query.result)
  /** Find user by user's id */
  def findById(id: Long): Future[Option[Contact]] = db.run(query.filterById(id).result.headOption)

  /** Find user by user-name */
  def findByNumber(number: String): Future[Option[Contact]] = db.run(query.filterByNumber(number).result.headOption)

  /** Returns user's existence, and it's searched by user's id */
  def idExists(id: Long): Future[Boolean] = db.run(query.filterById(id).exists.result)

  /** Insert new contact */
  def insert(contact: Contact): Future[Long] = db.run((query returning query.map(_.id)) += contact)

  /** Delete contact */
  def deleteContact(id: Long) : Future[Boolean] = db.run(query.filterById(id).delete.map(_ > 0));

  /** Update contact */
  def updateContact(contact: Contact) : Future[Boolean] = db.run(query.filterById(contact.id.get).update(contact).map(_ > 0));

}
