package net.feminaexlux.model

import java.util.Date
import javax.persistence._

/**
  * Created by lani on 5/7/17.
  */
@Entity
@Table(name = "users")
class User extends java.io.Serializable {
  @Id
  var username: String = _
  var password: String = _
  var name: String = _
  var lastLogin: Date = _
  var created: Date = _
  var updated: Date = _
}
