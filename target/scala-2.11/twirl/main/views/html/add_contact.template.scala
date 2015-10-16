
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object add_contact_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import ejisan.play.libs.PageMeta
import libs.PjaxHeader

class add_contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,Form[Contact],play.api.mvc.Call,RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, formContact: Form[Contact], action: play.api.mvc.Call)(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.125*/("""
"""),_display_(/*3.2*/main(title)/*3.13*/{_display_(Seq[Any](format.raw/*3.14*/("""
  """),_display_(/*4.4*/form(action = action)/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""
    """),format.raw/*5.5*/("""<div class="row" style="margin-top:20px;">
      <div class="small-8 small-centered columns">
        <h4>Add Contact</h4>
        <hr>
      </div>
      <div class="small-8 small-centered columns">
        <div class="row">

          <div class="small-12 columns">
            """),_display_(/*14.14*/inputText(formContact("fullName"), '_label -> "First Name:", '_showConstraints -> false)),format.raw/*14.102*/("""
          """),format.raw/*15.11*/("""</div>
        </div>
      </div>


      <div class="small-8 small-centered columns">
        <div class="row">

          <div class="small-12 columns">

            """),_display_(/*25.14*/inputText(formContact("number"), '_label -> "Number:", '_showConstraints -> false)),format.raw/*25.96*/("""
          """),format.raw/*26.11*/("""</div>
        </div>
      </div>


      <div class="small-8 small-centered columns">
        <div class="row">
          <div class="small-3 columns">
          </div>
          <div class="small-9 columns">
            <div class="button-bar">
              <ul class="button-group radius right ">
                <li><input type="submit" name="submit" class="small button success" value="Submit"></li>
                <li><input type="reset"  value="reset" class="small button alert "></li>

              </ul>
            </div>
          </div>
        </div>
      </div>


    </div>
  """)))}),format.raw/*49.4*/("""

""")))}),format.raw/*51.2*/("""
"""))
      }
    }
  }

  def render(title:String,formContact:Form[Contact],action:play.api.mvc.Call,request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(title,formContact,action)(request,messages)

  def f:((String,Form[Contact],play.api.mvc.Call) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (title,formContact,action) => (request,messages) => apply(title,formContact,action)(request,messages)

  def ref: this.type = this

}


}

/**/
object add_contact extends add_contact_Scope0.add_contact
              /*
                  -- GENERATED --
                  DATE: Fri Oct 16 16:25:20 PHT 2015
                  SOURCE: /Volumes/Development/Projects/phonebook/app/views/add_contact.scala.html
                  HASH: 154e252e9b1c74195bc3713c94c05463029359e1
                  MATRIX: 650->1|884->124|911->143|930->154|968->155|997->159|1026->180|1065->182|1096->187|1404->468|1514->556|1553->567|1750->737|1853->819|1892->830|2519->1427|2552->1430
                  LINES: 22->1|27->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5|39->14|39->14|40->15|50->25|50->25|51->26|74->49|76->51
                  -- GENERATED --
              */
          