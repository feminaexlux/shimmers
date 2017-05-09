package net.feminaexlux

/**
  * Created by lani on 3/15/17.
  */

import net.feminaexlux.page.Basic
import net.feminaexlux.panel.Content
import org.apache.wicket.request.mapper.parameter.PageParameters

class Fxl(parameters: PageParameters) extends Basic("Shimmers", parameters) {
  replace(new Content("Fxl page"))
}