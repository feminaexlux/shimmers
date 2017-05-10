package net.feminaexlux.page

import net.feminaexlux.model.User
import net.feminaexlux.model.dao.UserDao
import net.feminaexlux.panel.authentication.UpdatePassword
import net.feminaexlux.utility.Security
import org.apache.wicket.request.mapper.parameter.PageParameters
import org.apache.wicket.spring.injection.annot.SpringBean


/**
  * Created by lani on 5/7/17.
  */
class UserAdministration(pageParameters: PageParameters) extends Basic("User Administration", pageParameters) {
  @SpringBean var userDao: UserDao = _

  replace(new UpdatePassword)

  if (pageParameters.get("type").toString("").equalsIgnoreCase("update password")) {
    val user = userDao get "lani"
    user.password = Security HashPassword pageParameters.get("password").toString()
  }

  if (!pageParameters.get("username").isEmpty && !pageParameters.get("password").isEmpty) {
    if (pageParameters.get("type").toString("").equalsIgnoreCase("create user")) {
      val hashed = Security HashPassword pageParameters.get("password").toString()
      val user = new User
      user.username = pageParameters.get("username").toString
      user.password = hashed
      userDao.update(user)
    }
  }
}
