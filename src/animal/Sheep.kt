package animal

class Sheep(override var type: String = "Sheep"): Animal() {
    override fun eat() {
        println("Eating grass")
    }

    override fun sound() {
        println("Meee")
    }
}