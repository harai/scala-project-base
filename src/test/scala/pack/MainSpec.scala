package pack

import org.specs2._

class MainSpec extends org.specs2.mutable.Specification {
  "add" >> {
    val n = Main.add(1, 2)
    "" >> {
      n must_== 3
    }
    "" >> {
      Main.add(2, 3) must_== 5
    }
    "" >> {
      Main.add(0, 0) must_== 0
    }
  }
}
