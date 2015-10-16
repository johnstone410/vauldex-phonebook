
// @GENERATOR:play-routes-compiler
// @SOURCE:/Volumes/Development/Projects/phonebook/conf/routes
// @DATE:Fri Oct 16 17:15:12 PHT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:35
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "wj-assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def add_profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.add_profile",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add_profile/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:26
    def submitUpdateProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.submitUpdateProfile",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submit_update_profile/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:15
    def deleteContact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteContact",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteContact" + _qS([(id == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id))])})
        }
      """
    )
  
    // @LINE:24
    def submitProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.submitProfile",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "submit_profile/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:12
    def submitContact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.submitContact",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submit"})
        }
      """
    )
  
    // @LINE:9
    def add_contact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.add_contact",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add_contact"})
        }
      """
    )
  
    // @LINE:18
    def updateContact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateContact",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateContact"})
        }
      """
    )
  
    // @LINE:29
    def getUserProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUserProfile",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "get_user_profile/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}