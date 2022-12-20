package singleton

class App {
}

fun main(args: Array<String>) {
    val rat = Rat()
    val cat = Cat()
    // DoorMan의 new 생성을 막고 getInstance로만 호출 가능하게 함
    val doorMan = DoorMan.getInstance()
    doorMan.getOut(rat)
    doorMan.getOut(cat)
}
