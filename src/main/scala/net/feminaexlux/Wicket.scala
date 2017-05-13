package net.feminaexlux

import net.feminaexlux.page.Home
import org.apache.wicket.Page
import org.apache.wicket.protocol.http.WebApplication
import org.apache.wicket.spring.injection.annot.SpringComponentInjector

/**
  * Created by lani on 5/7/17.
  */
class Wicket extends WebApplication {
  override def getHomePage: Class[_ <: Page] = {
    classOf[Home]
  }

  override def init(): Unit = {
    super.init()
    getComponentInstantiationListeners add new SpringComponentInjector(this)
  }
}
