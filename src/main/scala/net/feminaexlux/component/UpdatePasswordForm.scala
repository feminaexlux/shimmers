package net.feminaexlux.component

import net.feminaexlux.model.dao.UserDao
import net.feminaexlux.utility.Security
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.markup.html.form.{Form, PasswordTextField}
import org.apache.wicket.model.Model
import org.apache.wicket.spring.injection.annot.SpringBean

/**
  * Created by lani on 5/7/17.
  */
class UpdatePasswordForm extends Form("update_password_form") {
  @SpringBean var userDao: UserDao = _
  private val old = new PasswordTextField("old", Model of "")
  private val password = new PasswordTextField("password", Model of "")
  private val confirm = new PasswordTextField("confirm", Model of "")

  add(old)
  add(password)
  add(confirm)
  add(new Label("message", "Update password for lani I guess??"))

  override def onSubmit(): Unit = {
    super.onSubmit()

    if (!password.getConvertedInput.equals(confirm.getConvertedInput)) {
      replace(new Label("message", "Passwords don't match"))
    } else {
      val user = userDao get "lani"
      val canUpdate = Security CheckPassword(old.getConvertedInput, user.password)
      if (!canUpdate) {
        replace(new Label("message", "Could not update password for user " + user.username))
      } else {
        user.password = Security HashPassword password.getConvertedInput
        val updated = userDao update user

        replace(new Label("message", "Updated user " + updated.username))
      }
    }
  }
}