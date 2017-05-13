package net.feminaexlux.page.layout

import net.feminaexlux.panel._
import org.apache.wicket.markup.html.WebPage
import org.apache.wicket.request.mapper.parameter.PageParameters

/**
  * Created by lani on 4/2/17.
  */

class Basic(title: String, pageParameters: PageParameters) extends WebPage(pageParameters) {
  add(new Header(title))
  add(new Footer)
  add(new Navigation)
}

