package adapter

class TigerAdapter : Animal() {

    private var outerTiger = OuterTiger()

    override fun getName(): String {
        return outerTiger.getFullName()
    }
}
