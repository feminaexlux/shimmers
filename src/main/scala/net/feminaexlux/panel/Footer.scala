package net.feminaexlux.panel

import net.feminaexlux.utility.PanelIds
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.markup.html.panel.Panel
import org.joda.time.DateTime

/**
  * Created by lani on 4/2/17.
  */

class Footer extends Panel(PanelIds.Footer) {
  add(new Label("year", DateTime.now.year.get))
}
