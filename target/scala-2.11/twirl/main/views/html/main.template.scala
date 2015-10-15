
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import ejisan.play.libs.PageMeta
import libs.PjaxHeader

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE HTML>
<html>
<head>
  <title>"""),_display_(/*5.11*/title),format.raw/*5.16*/("""</title>
  <link rel="stylesheet"  href=""""),_display_(/*6.34*/routes/*6.40*/.WebJarAssets.at(WebJarAssets.locate("foundation.min.css"))),format.raw/*6.99*/("""">
  <link rel="stylesheet"  href=""""),_display_(/*7.34*/routes/*7.40*/.WebJarAssets.at(WebJarAssets.locate("font-awesome.min.css"))),format.raw/*7.101*/("""">
</head>
<body>

    <nav class="top-bar" data-topbar role="navigation">
      <ul class="title-area">
        <li class="name">
          <h1><a href="#">Phonebook</a></h1>
        </li>
         <!-- Remove the class "menu-icon" to get rid of menu icon. Take out "Menu" to just have icon alone -->
        <li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a></li>
      </ul>

      <section class="top-bar-section">
        <!-- Right Nav Section -->
        <ul class="right">
          <li """),_display_(/*23.16*/if(title == "Phonebook")/*23.40*/ {_display_(Seq[Any](format.raw/*23.42*/("""class="active" """)))}),format.raw/*23.58*/("""><a href=""""),_display_(/*23.69*/routes/*23.75*/.Application.index()),format.raw/*23.95*/("""">All Contacts</a></li>
          <li """),_display_(/*24.16*/if(title == "Add Contact")/*24.42*/ {_display_(Seq[Any](format.raw/*24.44*/("""class="active" """)))}),format.raw/*24.60*/("""><a href=""""),_display_(/*24.71*/routes/*24.77*/.Application.add_contact()),format.raw/*24.103*/("""">Add a Contact</a></li>

        </ul>
      </section>
    </nav>

    <div class="large-12 centered">
      """),_display_(/*31.8*/content),format.raw/*31.15*/("""
    """),format.raw/*32.5*/("""</div>

    <script src=""""),_display_(/*34.19*/routes/*34.25*/.WebJarAssets.at(WebJarAssets.fullPath("jquery","jquery.min.js"))),format.raw/*34.90*/(""""></script>
    <script src=""""),_display_(/*35.19*/routes/*35.25*/.WebJarAssets.at(WebJarAssets.locate("foundation.min.js"))),format.raw/*35.83*/(""""></script>

    <script>
      $(document).foundation();

      $(document).ready(function()"""),format.raw/*40.35*/("""{"""),format.raw/*40.36*/("""
          """),format.raw/*41.11*/("""$(".delete").click(function(e)"""),format.raw/*41.41*/("""{"""),format.raw/*41.42*/("""
            """),format.raw/*42.13*/("""if(confirm("Are you sure you want to delete this record ?"))
                  return true;
            else
              e.preventDefault();

          """),format.raw/*47.11*/("""}"""),format.raw/*47.12*/(""");

          $(".edit").click(function()"""),format.raw/*49.38*/("""{"""),format.raw/*49.39*/("""
            """),format.raw/*50.13*/("""// or directly on the modal


            $("#id").val($(this).attr("data-id"));
            $("#number").val($(this).attr("data-number"));
            $("#fullName").val($(this).attr("data-name"));

            $('#modal-edit').foundation('reveal', 'open');
            console.log($("#id").val());
            //$('#myModal').foundation('reveal', 'close');
          """),format.raw/*60.11*/("""}"""),format.raw/*60.12*/(""");

          $("#form-update").submit(function(e)"""),format.raw/*62.47*/("""{"""),format.raw/*62.48*/("""

              """),format.raw/*64.15*/("""e.preventDefault();

              $.post("/updateContact", $("#form-update").serialize(),function(data)"""),format.raw/*66.84*/("""{"""),format.raw/*66.85*/("""
                """),format.raw/*67.17*/("""//ar temp = $.parseJSON(data);
                if(data.success)"""),format.raw/*68.33*/("""{"""),format.raw/*68.34*/("""
                  """),format.raw/*69.19*/("""$('#modal-edit').foundation('reveal', 'close');
                  setTimeout(function()"""),format.raw/*70.40*/("""{"""),format.raw/*70.41*/(""" """),format.raw/*70.42*/("""window.location.reload()"""),format.raw/*70.66*/("""}"""),format.raw/*70.67*/(""",1000);
                """),format.raw/*71.17*/("""}"""),format.raw/*71.18*/("""

              """),format.raw/*73.15*/("""}"""),format.raw/*73.16*/(""")

          """),format.raw/*75.11*/("""}"""),format.raw/*75.12*/(""")

      """),format.raw/*77.7*/("""}"""),format.raw/*77.8*/(""");

    </script>

</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 16:14:49 PHT 2015
                  SOURCE: /Volumes/Development/Projects/phonebook/app/views/main.scala.html
                  HASH: 89d4650c7dabcdb67053ff5bae61cb1177015ce8
                  MATRIX: 586->1|711->31|738->32|804->72|829->77|897->119|911->125|990->184|1052->220|1066->226|1148->287|1690->802|1723->826|1763->828|1810->844|1848->855|1863->861|1904->881|1970->920|2005->946|2045->948|2092->964|2130->975|2145->981|2193->1007|2331->1119|2359->1126|2391->1131|2444->1157|2459->1163|2545->1228|2602->1258|2617->1264|2696->1322|2817->1415|2846->1416|2885->1427|2943->1457|2972->1458|3013->1471|3195->1625|3224->1626|3293->1667|3322->1668|3363->1681|3760->2050|3789->2051|3867->2101|3896->2102|3940->2118|4072->2222|4101->2223|4146->2240|4237->2303|4266->2304|4313->2323|4428->2410|4457->2411|4486->2412|4538->2436|4567->2437|4619->2461|4648->2462|4692->2478|4721->2479|4762->2492|4791->2493|4827->2502|4855->2503
                  LINES: 22->1|27->1|28->2|31->5|31->5|32->6|32->6|32->6|33->7|33->7|33->7|49->23|49->23|49->23|49->23|49->23|49->23|49->23|50->24|50->24|50->24|50->24|50->24|50->24|50->24|57->31|57->31|58->32|60->34|60->34|60->34|61->35|61->35|61->35|66->40|66->40|67->41|67->41|67->41|68->42|73->47|73->47|75->49|75->49|76->50|86->60|86->60|88->62|88->62|90->64|92->66|92->66|93->67|94->68|94->68|95->69|96->70|96->70|96->70|96->70|96->70|97->71|97->71|99->73|99->73|101->75|101->75|103->77|103->77
                  -- GENERATED --
              */
          