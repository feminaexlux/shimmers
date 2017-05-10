package net.feminaexlux.model.dao

import javax.persistence.{EntityManager, PersistenceContext}
import javax.transaction.Transactional

import net.feminaexlux.model.User
import org.joda.time.DateTime
import org.springframework.stereotype.Repository

/**
  * Created by lani on 5/7/17.
  */
@Repository
@Transactional
class UserDao {
  @PersistenceContext var em: EntityManager = _

  def getAll(): java.util.List[User] = {
    val list = em createQuery "select u from User u" getResultList()
    list match {
      case definedList: java.util.List[User] => definedList
      case _ => throw new IllegalArgumentException
    }
  }

  def get(username: String): User = {
    val user = em find(classOf[User], username)
    em refresh user
    user
  }

  def update(user: User): User = {
    user.updated = DateTime.now().toDate
    val updatedUser = em merge user
    em flush()
    updatedUser
  }
}
