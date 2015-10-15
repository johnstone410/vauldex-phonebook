
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

class add_contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Form[Contact],play.api.mvc.Call,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, formContact: Form[Contact], action: play.api.mvc.Call):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.72*/("""
"""),_display_(/*3.2*/main(title)/*3.13*/{_display_(Seq[Any](format.raw/*3.14*/("""
  """),_display_(/*4.4*/form(action = action)/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""
    """),format.raw/*5.5*/("""<div class="row" style="margin-top:20px;">
      <div class="small-8 small-centered columns">
        <h4>Add Contact</h4>
        <hr>
      </div>
      <div class="small-8 small-centered columns">
        <div class="row">
          """),_display_(/*12.12*/if(formContact("fullName").hasErrors)/*12.49*/ {_display_(Seq[Any](format.raw/*12.51*/("""
            """),format.raw/*13.13*/("""<div class="small-12 columns">test</div>
          """)))}),format.raw/*14.12*/("""
          """),format.raw/*15.11*/("""<div class="small-3 columns">
            <label for="right-label" class="right inline">Name</label>
          </div>
          <div class="small-9 columns">
            <input type="text" name=""""),_display_(/*19.39*/formContact("fullName")/*19.62*/.name),format.raw/*19.67*/("""" id="right-label" placeholder="name here">
          </div>
        </div>
      </div>
      <div class="small-8 small-centered columns">
        <div class="row">
          """),_display_(/*25.12*/if(formContact("number").error)/*25.43*/ {_display_(Seq[Any](format.raw/*25.45*/("""
            """),format.raw/*26.13*/("""<div class="small-12 columns">test</div>
          """)))}),format.raw/*27.12*/("""
          """),format.raw/*28.11*/("""<div class="small-3 columns">
            <label for="right-label" class="right inline">Number</label>
          </div>
          <div class="small-9 columns">
            <input type="text" name=""""),_display_(/*32.39*/formContact("number")/*32.60*/.name),format.raw/*32.65*/("""" required id="right-label" placeholder="number here">
          </div>
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
  """)))}),format.raw/*54.4*/("""

""")))}),format.raw/*56.2*/("""
"""))
      }
    }
  }

  def render(title:String,formContact:Form[Contact],action:play.api.mvc.Call): play.twirl.api.HtmlFormat.Appendable = apply(title,formContact,action)

  def f:((String,Form[Contact],play.api.mvc.Call) => play.twirl.api.HtmlFormat.Appendable) = (title,formContact,action) => apply(title,formContact,action)

  def ref: this.type = this

}


}

/**/
object add_contact extends add_contact_Scope0.add_contact
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 18:21:38 PHT 2015
                  SOURCE: /Volumes/Development/Projects/phonebook/app/views/add_contact.scala.html
                  HASH: 401c2a2c60d5bb1f4abbc3e1041dc7fa5844bcd1
                  MATRIX: 627->1|807->71|834->90|853->101|891->102|920->106|949->127|988->129|1019->134|1283->371|1329->408|1369->410|1410->423|1493->475|1532->486|1755->682|1787->705|1813->710|2017->887|2057->918|2097->920|2138->933|2221->985|2260->996|2485->1194|2515->1215|2541->1220|3231->1880|3264->1883
                  LINES: 22->1|27->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5|37->12|37->12|37->12|38->13|39->14|40->15|44->19|44->19|44->19|50->25|50->25|50->25|51->26|52->27|53->28|57->32|57->32|57->32|79->54|81->56
                  -- GENERATED --
              */
          