package proxy

class App {

}

fun main(args: Array<String>) {
    val rat = Rat()
    val cat = Cat()
    val doorMan = DoorManProxy(DoorMan())
    doorMan.getOut(rat)
    doorMan.getOut(cat)
}
