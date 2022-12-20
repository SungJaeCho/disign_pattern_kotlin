package proxy

class DoorManProxy{

    //컴포지션
    var doorMan = DoorMan()

    constructor(doorMan: DoorMan) {
        this.doorMan = doorMan
    }

    fun getOut(animal: Animal) {
        println("안녕")
        doorMan.getOut(animal)
    }
}
