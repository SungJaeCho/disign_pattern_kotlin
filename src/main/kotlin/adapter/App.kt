package adapter

/**
 * 1. 외부 요소를 기존 시스템에 재사용하고 싶지만 아직 만들어지지 않은 경우
 * 2. 외부 요소를 기존 시스템에 재사용하고 싶지만 호환되지 않는 경우
 */
class App {

}

fun main(args: Array<String>) {
    val rat = Rat()
    val cat = Cat()
    val outerTiger = TigerAdapter()
    val doorMan = DoorMan()
    doorMan.getOut(rat)
    doorMan.getOut(cat)
    doorMan.getOut(outerTiger)
}
