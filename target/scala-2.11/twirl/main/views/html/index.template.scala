
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import ejisan.play.libs.PageMeta
import libs.PjaxHeader

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Seq[Contact],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String ,lists: Seq[Contact]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main(title)/*3.13*/{_display_(Seq[Any](format.raw/*3.14*/("""

     """),format.raw/*5.6*/("""<table class="row">
      <thead>
        <tr>
          <th>Name</th>
          <th>Number</th>
          <th width="150"> Action </th>

        </tr>
      </thead>
      <tbody>
        """),_display_(/*15.10*/for(list <- lists) yield /*15.28*/{_display_(Seq[Any](format.raw/*15.29*/("""
        """),format.raw/*16.9*/("""<tr>
          <td>"""),_display_(/*17.16*/list/*17.20*/.fullName),format.raw/*17.29*/("""</td>
          <td>"""),_display_(/*18.16*/list/*18.20*/.number),format.raw/*18.27*/("""</td>
          <td>
            <ul class="button-group round">
              <li><a href="javascript:;"  data-id=""""),_display_(/*21.53*/list/*21.57*/.id.get),format.raw/*21.64*/("""" data-name=""""),_display_(/*21.78*/list/*21.82*/.fullName),format.raw/*21.91*/("""" data-number=""""),_display_(/*21.107*/list/*21.111*/.number),format.raw/*21.118*/("""" class="tiny button edit">Edit</a></li>
              <li><a href=""""),_display_(/*22.29*/routes/*22.35*/.Application.deleteContact(list.id.get)),format.raw/*22.74*/("""" class="tiny button delete" >Delete</a></li>

            </ul>
          </td>

        </tr>
        """)))}),format.raw/*28.10*/("""
      """),format.raw/*29.7*/("""</tbody>
    </table>

    <!-- edit modal -->
    <div id="modal-edit" class="reveal-modal" data-reveal aria-labelledby="modalTitle" aria-hidden="true" role="dialog">
        <a class="close-reveal-modal" aria-label="Close">&#215;</a>
      <form id="form-update" action=""""),_display_(/*35.39*/routes/*35.45*/.Application.updateContact),format.raw/*35.71*/("""" method="POST" accept-charset="utf-8" >

        <div class="row" style="margin-top:20px;">
          <div class="small-8 small-centered columns">
            <h4>Update Contact</h4>
            <hr>
            <input type="hidden" id="id" name="id" >
          </div>
          <div class="small-8 small-centered columns">
            <div class="row">
              <div class="small-3 columns">
                <label for="right-label" class="right inline">Name</label>
              </div>
              <div class="small-9 columns">
                <input type="text" name="fullName" required id="fullName" placeholder="name here">
              </div>
            </div>
          </div>
          <div class="small-8 small-centered columns">
            <div class="row">
              <div class="small-3 columns">
                <label for="right-label" class="right inline">Number</label>
              </div>
              <div class="small-9 columns">
                <input type="text" name="number" required id="number" placeholder="number here">
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
                    <li><input type="submit" name="submit" class="small button success" value="Save"></li>
                    <li><input type="reset"  value="reset" class="small button alert "></li>

                  </ul>
                </div>
              </div>
            </div>
          </div>


        </div>
      </form>
    </div>
""")))}),format.raw/*83.2*/("""


"""))
      }
    }
  }

  def render(title:String,lists:Seq[Contact]): play.twirl.api.HtmlFormat.Appendable = apply(title,lists)

  def f:((String,Seq[Contact]) => play.twirl.api.HtmlFormat.Appendable) = (title,lists) => apply(title,lists)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 16:14:49 PHT 2015
                  SOURCE: /Volumes/Development/Projects/phonebook/app/views/index.scala.html
                  HASH: 4cc526e1b678fee5712d20e04d245353e9ec6e65
                  MATRIX: 596->1|727->37|755->40|774->51|812->52|845->59|1062->249|1096->267|1135->268|1171->277|1218->297|1231->301|1261->310|1309->331|1322->335|1350->342|1494->459|1507->463|1535->470|1576->484|1589->488|1619->497|1663->513|1677->517|1706->524|1802->593|1817->599|1877->638|2013->743|2047->750|2348->1024|2363->1030|2410->1056|4202->2818
                  LINES: 22->1|27->1|29->3|29->3|29->3|31->5|41->15|41->15|41->15|42->16|43->17|43->17|43->17|44->18|44->18|44->18|47->21|47->21|47->21|47->21|47->21|47->21|47->21|47->21|47->21|48->22|48->22|48->22|54->28|55->29|61->35|61->35|61->35|109->83
                  -- GENERATED --
              */
          