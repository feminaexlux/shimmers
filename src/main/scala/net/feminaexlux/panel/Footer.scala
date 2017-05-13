package net.feminaexlux.panel

import net.feminaexlux.utility.PanelIds
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.markup.html.panel.Panel
import org.joda.time.DateTime

/**
  * Created by lani on 4/2/17.
  */

class Footer extends Panel(PanelIds.Footer) {
  private val start = 2017
  private val now = DateTime.now.year.get
  add(new Label("year", if (now > start) s"$start-$now" else s"$now"))
}
