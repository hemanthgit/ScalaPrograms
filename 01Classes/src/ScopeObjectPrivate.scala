class ScopeObjectPrivate(val usrname: String, val pwd: String) {
  private var username = usrname
  private[this] var password = pwd

  def this() {
    this("abc", "xyz");
  }

  def displayUser(guest: ScopeObjectPrivate) = {

    guest.username = this.username
    //  guest.password = this.password---->    //error  value password is not member of class ScopeObjectPrivate

    this.username = "abc-v1"
    this.password = "xyz-v1" //----------valid

    // Looks very strange, need to investigate
    val a = this
    a.username = "test"
    //    a.password="test" //-------------> 
  }

  def setUserName(newUsername: String) = { println("updating user name:" + newUsername); this.username = newUsername }
  def getUserName(newUsername: String): String = { newUsername }

  def setPassword(newPassword: String) = { println("updating user name:" + newPassword); this.password = newPassword }
  def getPassword(newPassword: String): String = { newPassword }

  override def toString() = s"$username......$password"
}

object ScopeObjectPrivate extends App {
  val a = new ScopeObjectPrivate()
  println("----------------------Current data-----------------")
  println(a)
  a.setUserName("usrname-- updated");
  a.setPassword("pwd-- updated")
  println("----------------------Updated Data-----------------")
  println(a)
}