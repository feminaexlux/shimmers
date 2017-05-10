package net.feminaexlux.component

import net.feminaexlux.model.User
import net.feminaexlux.model.dao.UserDao
import net.feminaexlux.utility.Security
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.markup.html.form.{ChoiceRenderer, DropDownChoice, Form, PasswordTextField}
import org.apache.wicket.model.Model
import org.apache.wicket.spring.injection.annot.SpringBean

/**
  * Created by lani on 5/7/17.
  */
class UpdatePasswordForm extends Form("update_password_form") {
  @SpringBean var userDao: UserDao = _

  val users = new DropDownChoice[User]("users", new Model[User], userDao.getAll(), new ChoiceRenderer[User]("name", "username"))
  val old = new PasswordTextField("old", Model of "")
  val password = new PasswordTextField("password", Model of "")
  val confirm = new PasswordTextField("confirm", Model of "")

  add(users)
  add(old)
  add(password)
  add(confirm)
  add(new Label("message", "Update password for user"))

  override def onSubmit(): Unit = {
    super.onSubmit()

    if (users.getConvertedInput == null) {
      replace(new Label("message", "Please select user"))
    } else if (!password.getConvertedInput.equals(confirm.getConvertedInput)) {
      replace(new Label("message", "Passwords don't match"))
    } else {
      val selectedUser = users.getConvertedInput
      val canUpdate = Security CheckPassword(old.getConvertedInput, selectedUser.password)
      if (!canUpdate) {
        replace(new Label("message", "Could not update password for user " + selectedUser.username))
      } else {
        selectedUser.password = Security HashPassword password.getConvertedInput
        val updated = userDao update selectedUser

        replace(new Label("message", "Updated user " + updated.username))
      }
    }
  }
}
