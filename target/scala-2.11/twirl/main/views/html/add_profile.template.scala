
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object add_profile_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import ejisan.play.libs.PageMeta
import libs.PjaxHeader

class add_profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[Long,String,Form[UserProfile],play.api.mvc.Call,Option[Contact],Option[UserProfile],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long,title: String,formProfile: Form[UserProfile], action: play.api.mvc.Call, contact: Option[Contact], profile: Option[UserProfile])(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.193*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main(title)/*4.13*/{_display_(Seq[Any](format.raw/*4.14*/("""
  """),_display_(/*5.4*/form(action = action)/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
    """),format.raw/*6.5*/("""<div class="row" style="margin-top:20px;">
      <div class="panel callout radius small-8 small-centered columns">
        <h4>"""),_display_(/*8.14*/title),format.raw/*8.19*/("""</h4>

      </div>
      <div class="small-8 small-centered columns">

        <div class="row">
          <input type="hidden" value=""""),_display_(/*14.40*/id),format.raw/*14.42*/("""" name="id" id="id">
          <div class="small-12 columns">
            """),_display_(/*16.14*/inputText(formProfile("firstName"), '_label -> "First Name:", '_showConstraints -> false)),format.raw/*16.103*/("""
          """),format.raw/*17.11*/("""</div>
        </div>
      </div>
      <div class="small-8 small-centered columns">
        <div class="row">

          <div class="small-12 columns">

            """),_display_(/*25.14*/inputText(formProfile("lastName"), '_label -> "Last Name:", '_showConstraints -> false)),format.raw/*25.101*/("""
          """),format.raw/*26.11*/("""</div>
        </div>
      </div>

            <div class="small-8 small-centered columns">
        <div class="row">

          <div class="small-12 columns">
            """),_display_(/*34.14*/inputText(formProfile("middleName"), '_label -> "Middle Name:", '_showConstraints -> false)),format.raw/*34.105*/("""
          """),format.raw/*35.11*/("""</div>
        </div>
      </div>

      <div class="small-8 small-centered columns">
        <div class="row">

          <div class="small-12 columns">
            """),_display_(/*43.14*/inputText(formProfile("birthdate"), '_label -> "Birthdate:",'placeholder -> "MM/DD/YYYY" , '_showConstraints -> false)),format.raw/*43.132*/("""
          """),format.raw/*44.11*/("""</div>
        </div>
      </div>

      <div class="small-8 small-centered columns">
        <div class="row">

          <div class="small-12 columns">
            """),_display_(/*52.14*/select(formProfile("gender"), options("M" -> "Male" , "F" -> "Female"),'_label -> "Gender:", '_showConstraints -> false)),format.raw/*52.134*/("""
          """),format.raw/*53.11*/("""</div>
        </div>
      </div>
      <div class="small-8 small-centered columns">
        <div class="row">

          <div class="small-12 columns">
            """),_display_(/*60.14*/inputText(formProfile("address"), '_label -> "Address:", '_showConstraints -> false)),format.raw/*60.98*/("""
          """),format.raw/*61.11*/("""</div>
        </div>
      </div>

      <div class="small-8 small-centered columns">
        <div class="row">

          <div class="small-12 columns">
            """),_display_(/*69.14*/inputText(formProfile("contactNo"), '_label -> "Contact No.:", '_showConstraints -> false)),format.raw/*69.104*/("""
          """),format.raw/*70.11*/("""</div>
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
  """)))}),format.raw/*92.4*/("""
""")))}),format.raw/*93.2*/("""
"""))
      }
    }
  }

  def render(id:Long,title:String,formProfile:Form[UserProfile],action:play.api.mvc.Call,contact:Option[Contact],profile:Option[UserProfile],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(id,title,formProfile,action,contact,profile)(request,messages)

  def f:((Long,String,Form[UserProfile],play.api.mvc.Call,Option[Contact],Option[UserProfile]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (id,title,formProfile,action,contact,profile) => (request,messages) => apply(id,title,formProfile,action,contact,profile)(request,messages)

  def ref: this.type = this

}


}

/**/
object add_profile extends add_profile_Scope0.add_profile
              /*
                  -- GENERATED --
                  DATE: Fri Oct 16 17:09:10 PHT 2015
                  SOURCE: /Volumes/Development/Projects/phonebook/app/views/add_profile.scala.html
                  HASH: d2f798958f74a0949380e40696b3a7f44bf898c7
                  MATRIX: 695->1|997->192|1024->210|1051->212|1070->223|1108->224|1137->228|1166->249|1205->251|1236->256|1390->384|1415->389|1579->526|1602->528|1704->603|1815->692|1854->703|2049->871|2158->958|2197->969|2398->1143|2511->1234|2550->1245|2745->1413|2885->1531|2924->1542|3119->1710|3261->1830|3300->1841|3494->2008|3599->2092|3638->2103|3833->2271|3945->2361|3984->2372|4610->2968|4642->2970
                  LINES: 22->1|27->1|28->3|29->4|29->4|29->4|30->5|30->5|30->5|31->6|33->8|33->8|39->14|39->14|41->16|41->16|42->17|50->25|50->25|51->26|59->34|59->34|60->35|68->43|68->43|69->44|77->52|77->52|78->53|85->60|85->60|86->61|94->69|94->69|95->70|117->92|118->93
                  -- GENERATED --
              */
          