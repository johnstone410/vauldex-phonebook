
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
  <link rel="stylesheet"  href=""""),_display_(/*6.34*/routes/*6.40*/.WebJarAssets.at(WebJarAssets.locate("foundation/css/foundation.min.css"))),format.raw/*6.114*/("""">
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
          <li """),_display_(/*25.16*/if(title == "Phonebook")/*25.40*/ {_display_(Seq[Any](format.raw/*25.42*/("""class="active" """)))}),format.raw/*25.58*/("""><a href=""""),_display_(/*25.69*/routes/*25.75*/.Application.index()),format.raw/*25.95*/("""">All Contacts</a></li>
          <li """),_display_(/*26.16*/if(title == "Add Contact")/*26.42*/ {_display_(Seq[Any](format.raw/*26.44*/("""class="active" """)))}),format.raw/*26.60*/("""><a href=""""),_display_(/*26.71*/routes/*26.77*/.Application.add_contact()),format.raw/*26.103*/("""">Add a Contact</a></li>

        </ul>
      </section>
    </nav>

    <div class="large-12 centered">
      """),_display_(/*33.8*/content),format.raw/*33.15*/("""
    """),format.raw/*34.5*/("""</div>

    <script src=""""),_display_(/*36.19*/routes/*36.25*/.WebJarAssets.at(WebJarAssets.fullPath("jquery","jquery.min.js"))),format.raw/*36.90*/(""""></script>
    <script src=""""),_display_(/*37.19*/routes/*37.25*/.WebJarAssets.at(WebJarAssets.locate("foundation/js/foundation.min.js"))),format.raw/*37.97*/(""""></script>

    <script>
      $(document).foundation();

      $(document).ready(function()"""),format.raw/*42.35*/("""{"""),format.raw/*42.36*/("""
          """),format.raw/*43.11*/("""$(".delete").click(function(e)"""),format.raw/*43.41*/("""{"""),format.raw/*43.42*/("""
            """),format.raw/*44.13*/("""if(confirm("Are you sure you want to delete this record ?"))
                  return true;
            else
              e.preventDefault();

          """),format.raw/*49.11*/("""}"""),format.raw/*49.12*/(""");

          $(".edit").click(function()"""),format.raw/*51.38*/("""{"""),format.raw/*51.39*/("""

            """),format.raw/*53.13*/("""$("#id").val($(this).attr("data-id"));
            $("#number").val($(this).attr("data-number"));
            $("#fullName").val($(this).attr("data-name"));

            $('#modal-edit').foundation('reveal', 'open');

          """),format.raw/*59.11*/("""}"""),format.raw/*59.12*/(""");

          $("#form-update").submit(function(e)"""),format.raw/*61.47*/("""{"""),format.raw/*61.48*/("""

              """),format.raw/*63.15*/("""e.preventDefault();

              $.post("/updateContact", $("#form-update").serialize(),function(data)"""),format.raw/*65.84*/("""{"""),format.raw/*65.85*/("""
                """),format.raw/*66.17*/("""//ar temp = $.parseJSON(data);
                if(data.success)"""),format.raw/*67.33*/("""{"""),format.raw/*67.34*/("""
                  """),format.raw/*68.19*/("""$('#modal-edit').foundation('reveal', 'close');
                  setTimeout(function()"""),format.raw/*69.40*/("""{"""),format.raw/*69.41*/(""" """),format.raw/*69.42*/("""window.location.reload()"""),format.raw/*69.66*/("""}"""),format.raw/*69.67*/(""",1000);
                """),format.raw/*70.17*/("""}"""),format.raw/*70.18*/("""

              """),format.raw/*72.15*/("""}"""),format.raw/*72.16*/(""")

          """),format.raw/*74.11*/("""}"""),format.raw/*74.12*/(""")

      """),format.raw/*76.7*/("""}"""),format.raw/*76.8*/(""");

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
                  DATE: Fri Oct 16 17:23:22 PHT 2015
                  SOURCE: /Volumes/Development/Projects/phonebook/app/views/main.scala.html
                  HASH: b1878b37cd10bc592a885ee02286dfb1544961b6
                  MATRIX: 586->1|711->31|738->32|804->72|829->77|897->119|911->125|1006->199|1068->235|1082->241|1164->302|1708->819|1741->843|1781->845|1828->861|1866->872|1881->878|1922->898|1988->937|2023->963|2063->965|2110->981|2148->992|2163->998|2211->1024|2349->1136|2377->1143|2409->1148|2462->1174|2477->1180|2563->1245|2620->1275|2635->1281|2728->1353|2849->1446|2878->1447|2917->1458|2975->1488|3004->1489|3045->1502|3227->1656|3256->1657|3325->1698|3354->1699|3396->1713|3652->1941|3681->1942|3759->1992|3788->1993|3832->2009|3964->2113|3993->2114|4038->2131|4129->2194|4158->2195|4205->2214|4320->2301|4349->2302|4378->2303|4430->2327|4459->2328|4511->2352|4540->2353|4584->2369|4613->2370|4654->2383|4683->2384|4719->2393|4747->2394
                  LINES: 22->1|27->1|28->2|31->5|31->5|32->6|32->6|32->6|33->7|33->7|33->7|51->25|51->25|51->25|51->25|51->25|51->25|51->25|52->26|52->26|52->26|52->26|52->26|52->26|52->26|59->33|59->33|60->34|62->36|62->36|62->36|63->37|63->37|63->37|68->42|68->42|69->43|69->43|69->43|70->44|75->49|75->49|77->51|77->51|79->53|85->59|85->59|87->61|87->61|89->63|91->65|91->65|92->66|93->67|93->67|94->68|95->69|95->69|95->69|95->69|95->69|96->70|96->70|98->72|98->72|100->74|100->74|102->76|102->76
                  -- GENERATED --
              */
          