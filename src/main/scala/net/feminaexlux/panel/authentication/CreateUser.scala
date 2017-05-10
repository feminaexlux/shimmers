package net.feminaexlux.panel.authentication

import net.feminaexlux.component.CreateUserForm
import net.feminaexlux.utility.PanelIds
import org.apache.wicket.markup.html.panel.Panel

/**
  * Created by lani on 5/7/17.
  */
class CreateUser() extends Panel(PanelIds.Content) {
  add(new CreateUserForm)
}
