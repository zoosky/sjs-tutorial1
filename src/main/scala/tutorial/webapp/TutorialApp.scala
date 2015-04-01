package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.dom
// import dom.document // interact with jquery
import org.scalajs.jquery.jQuery
import scala.scalajs.js.annotation.JSExport


object TutorialApp extends JSApp {
  def main(): Unit = {
    println("Hello world!")
    //appendPar(document.body, "Hello World, Browser") //DOM
    jQuery(setupUI _)
  }


  /*  // DOM
  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }
  */


  //@JSExport replaced by setupUI jquery call
  def addClickedMessage(): Unit = {

    //appendPar(document.body, "You clicked the button!") // dom
    jQuery("body").append("<p>[message]</p>")

  }

  def setupUI(): Unit = {
    jQuery("#click-me-button").click(addClickedMessage _)
    jQuery("body").append("<p>Hello World, Browser</p>")
}

}
