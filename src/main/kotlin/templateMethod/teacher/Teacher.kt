package templateMethod.teacher

open abstract class Teacher {
    private fun 입장하기() {
        println("입장하기")
    }
    private fun 출석부르기() {
        println("출석부르기")
    }

    // override (부모의 메서드를 무효화 하다)
    open abstract fun 강의하기()

    private fun 퇴장하기() {
        println("퇴장하기")
    }

    fun 수업하기() {
        입장하기()
        출석부르기()
        강의하기()
        퇴장하기()
    }
}
