

class ScopePrivate(val username: String, val password: String) {
  private var _username = username
  private var _password = password

  def this() {
    this("abc", "xyz")
    this._username = "abc-updated"
    this._password = "xyz-updated"
  }

  def displayUser(guest: ScopePrivate) {

    println(" guest username=" + guest._username + " guest password=" + guest._password)
    guest._username = this._username
    guest._password = this._password
    this._password = "test"
    println(" guest username=" + guest._username + " guest password=" + guest._password)
    println(" guest username=" + guest._username)

  }
}

object ScopePrivate {
  def main(args: Array[String]) {
    var real = new ScopePrivate("realUserName", "realPassword")
    var guest = new ScopePrivate("dummyUserName", "dummyPassword")
    real.displayUser(guest)

  }
}