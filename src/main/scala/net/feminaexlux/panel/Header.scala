package net.feminaexlux.panel

import net.feminaexlux.Shimmers
import net.feminaexlux.page.UserAdministration
import net.feminaexlux.utility.PanelIds
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.markup.html.link.BookmarkablePageLink
import org.apache.wicket.markup.html.panel.Panel

/**
  * Created by lani on 4/2/17.
  */

class Header(title: String) extends Panel(PanelIds.Header) {
  add(new Label("h1_title", title))
  add(new Label("page_title", title))
  add(new BookmarkablePageLink("home_page", classOf[Shimmers]))
  add(new BookmarkablePageLink("user_admin", classOf[UserAdministration]))
}
