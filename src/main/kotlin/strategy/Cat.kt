package strategy

class Cat: Animal() {
    private val name = "고양이"

    override fun getName(): String {
        return name
    }
}
