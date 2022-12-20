package templateMethod.teacher

class KotlinTeacher: Teacher() {
    // 재정의
    override fun 강의하기() { // 동적 바인딩 (C#에서는 동적결합 이라고도 불림)
        println("코틀린 강의하기")
    }
}
