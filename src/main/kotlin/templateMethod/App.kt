package templateMethod

import templateMethod.App.Companion.classStart
import templateMethod.teacher.KotlinTeacher
import templateMethod.teacher.PythonTeacher
import templateMethod.teacher.Teacher

class App {
    companion object {
        fun classStart(teacher: Teacher) {
            teacher.수업하기()
        }
    }
}

fun main() {
    val kTeacher = KotlinTeacher()
    classStart(kTeacher)
    val pTeacher = PythonTeacher()
    classStart(pTeacher)
}
