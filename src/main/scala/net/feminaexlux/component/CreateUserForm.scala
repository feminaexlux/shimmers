package net.feminaexlux.component

import org.apache.wicket.markup.html.form.{Form, PasswordTextField, TextField}
import org.apache.wicket.model.Model

/**
  * Created by lani on 5/7/17.
  */
class CreateUserForm extends Form("create_user_form") {
  add(new TextField("username", Model.of("")))
  add(new TextField("name", Model.of("")))
  add(new PasswordTextField("password", Model.of("")))
}
