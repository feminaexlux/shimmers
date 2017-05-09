package net.feminaexlux.panel

import net.feminaexlux.Fxl
import net.feminaexlux.page.UserAdministration
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.markup.html.link.Link
import org.apache.wicket.markup.html.panel.Panel

/**
  * Created by lani on 4/2/17.
  */

class Header(title: String) extends Panel(PanelIds.Header) {
  add(new Label("h1_title", title))
  add(new Label("page_title", title))
  add(new Link("home_page") {
    override def onClick(): Unit = {
      setResponsePage(classOf[Fxl])
    }
  })
  add(new Link("user_admin") {
    override def onClick(): Unit = {
      setResponsePage(classOf[UserAdministration])
    }
  })
}