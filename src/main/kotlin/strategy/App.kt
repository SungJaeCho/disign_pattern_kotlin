package strategy

class App {

}

fun main(args: Array<String>) {
    val rat = Rat()
    val cat = Cat()
    val doorMan = DoorMan()
    doorMan.getOut(rat)
    doorMan.getOut(cat)
}
