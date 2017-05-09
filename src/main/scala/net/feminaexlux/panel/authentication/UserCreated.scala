package net.feminaexlux.panel.authentication

import net.feminaexlux.panel.PanelIds
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.markup.html.panel.Panel

/**
  * Created by lani on 5/7/17.
  */
class UserCreated(user: String) extends Panel(PanelIds.Content) {
  add(new Label("created_user", user))
}
