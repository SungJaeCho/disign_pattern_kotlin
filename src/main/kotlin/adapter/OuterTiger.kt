package adapter

// 외부에서 만든 라이브러리라고 가정
class OuterTiger {
    private val fullName = "외부 호랑이"

    fun getFullName(): String {
        return fullName
    }
}
