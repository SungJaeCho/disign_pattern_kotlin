package singleton

/**
 * DoorMan 을 한명만 만들어서 재사용
 */
class DoorMan {

    companion object {
        private val doorMan = DoorMan()

        @JvmStatic
        fun getInstance(): DoorMan {
            return doorMan
        }
    }

    // new 생성을 막음
    private constructor() {

    }

    fun getOut(animal: Animal) {
        println("${animal.getName()} 쫓아내")
    }
}
