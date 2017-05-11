package net.feminaexlux.panel

import net.feminaexlux.Shimmers
import net.feminaexlux.page.UserAdministration
import net.feminaexlux.utility.PanelIds
import org.apache.wicket.markup.html.link.BookmarkablePageLink
import org.apache.wicket.markup.html.panel.Panel

/**
  * Created by lani on 5/10/17.
  */
class Navigation extends Panel(PanelIds.Navigation) {
  add(new BookmarkablePageLink("home_page", classOf[Shimmers]))
  add(new BookmarkablePageLink("user_admin", classOf[UserAdministration]))
}
