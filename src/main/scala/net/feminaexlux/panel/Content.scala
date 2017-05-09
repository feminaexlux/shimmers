package net.feminaexlux.panel

import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.markup.html.panel.Panel

/**
  * Created by lani on 5/7/17.
  */
class Content(content: String) extends Panel(PanelIds.Content) {
  add(new Label("content", content))
}
