
// @GENERATOR:play-routes-compiler
// @SOURCE:/Volumes/Development/Projects/phonebook/conf/routes
// @DATE:Fri Oct 16 17:15:12 PHT 2015

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:35
  class ReverseWebJarAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def at(file:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "wj-assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def add_profile(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "add_profile/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:26
    def submitUpdateProfile(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "submit_update_profile/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:15
    def deleteContact(id:Long = -1): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "deleteContact" + queryString(List(if(id == -1) None else Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:24
    def submitProfile(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "submit_profile/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:12
    def submitContact(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "submit")
    }
  
    // @LINE:9
    def add_contact(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "add_contact")
    }
  
    // @LINE:18
    def updateContact(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateContact")
    }
  
    // @LINE:29
    def getUserProfile(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "get_user_profile/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }


}