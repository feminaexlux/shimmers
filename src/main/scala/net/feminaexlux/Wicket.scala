package net.feminaexlux

import org.apache.wicket.Page
import org.apache.wicket.protocol.http.WebApplication
import org.apache.wicket.spring.injection.annot.SpringComponentInjector

/**
  * Created by lani on 5/7/17.
  */
class Wicket extends WebApplication {
  override def getHomePage: Class[_ <: Page] = {
    return classOf[Shimmers]
  }

  override def init(): Unit = {
    super.init
    getComponentInstantiationListeners add new SpringComponentInjector(this)
  }
}
