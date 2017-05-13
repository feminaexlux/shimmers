package net.feminaexlux.panel

import net.feminaexlux.page.Home
import net.feminaexlux.page.administration.UserAdministration
import net.feminaexlux.utility.PanelIds
import org.apache.wicket.markup.html.link.BookmarkablePageLink
import org.apache.wicket.markup.html.panel.Panel

/**
  * Created by lani on 5/10/17.
  */
class Navigation extends Panel(PanelIds.Navigation) {
  add(new BookmarkablePageLink("home_page", classOf[Home]))
  add(new BookmarkablePageLink("user_admin", classOf[UserAdministration]))
}
