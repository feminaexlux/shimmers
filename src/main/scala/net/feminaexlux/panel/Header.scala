package net.feminaexlux.panel

import net.feminaexlux.utility.PanelIds
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.markup.html.panel.Panel

/**
  * Created by lani on 4/2/17.
  */

class Header(title: String) extends Panel(PanelIds.Header) {
  add(new Label("h1_title", title))
  add(new Label("page_title", title))
}
