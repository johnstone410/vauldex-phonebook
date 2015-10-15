
// @GENERATOR:play-routes-compiler
// @SOURCE:/Volumes/Development/Projects/phonebook/conf/routes
// @DATE:Wed Oct 14 15:54:12 PHT 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:24
  WebJarAssets_0: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:24
    WebJarAssets_0: controllers.WebJarAssets
  ) = this(errorHandler, Application_1, WebJarAssets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, WebJarAssets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add_contact""", """controllers.Application.add_contact"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submit""", """controllers.Application.submitContact"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteContact""", """controllers.Application.deleteContact(id:Long ?= -1)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateContact""", """controllers.Application.updateContact"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """wj-assets/$file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_add_contact1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add_contact")))
  )
  private[this] lazy val controllers_Application_add_contact1_invoker = createInvoker(
    Application_1.add_contact,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "add_contact",
      Nil,
      "GET",
      """ Add a contact page""",
      this.prefix + """add_contact"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_submitContact2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submit")))
  )
  private[this] lazy val controllers_Application_submitContact2_invoker = createInvoker(
    Application_1.submitContact,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "submitContact",
      Nil,
      "POST",
      """ SUBMIT ADD CONTACT FORM""",
      this.prefix + """submit"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_deleteContact3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteContact")))
  )
  private[this] lazy val controllers_Application_deleteContact3_invoker = createInvoker(
    Application_1.deleteContact(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteContact",
      Seq(classOf[Long]),
      "GET",
      """ DELETE A CONTACT""",
      this.prefix + """deleteContact"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_updateContact4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateContact")))
  )
  private[this] lazy val controllers_Application_updateContact4_invoker = createInvoker(
    Application_1.updateContact,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateContact",
      Nil,
      "POST",
      """ UPDATE A CONTACT""",
      this.prefix + """updateContact"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_WebJarAssets_at5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("wj-assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at5_invoker = createInvoker(
    WebJarAssets_0.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """wj-assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:9
    case controllers_Application_add_contact1_route(params) =>
      call { 
        controllers_Application_add_contact1_invoker.call(Application_1.add_contact)
      }
  
    // @LINE:12
    case controllers_Application_submitContact2_route(params) =>
      call { 
        controllers_Application_submitContact2_invoker.call(Application_1.submitContact)
      }
  
    // @LINE:15
    case controllers_Application_deleteContact3_route(params) =>
      call(params.fromQuery[Long]("id", Some(-1))) { (id) =>
        controllers_Application_deleteContact3_invoker.call(Application_1.deleteContact(id))
      }
  
    // @LINE:18
    case controllers_Application_updateContact4_route(params) =>
      call { 
        controllers_Application_updateContact4_invoker.call(Application_1.updateContact)
      }
  
    // @LINE:24
    case controllers_WebJarAssets_at5_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at5_invoker.call(WebJarAssets_0.at(file))
      }
  }
}