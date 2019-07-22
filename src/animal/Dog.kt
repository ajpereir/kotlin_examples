package animal

class Dog(override var type: String = "Dog"): Animal() {
    override fun eat() {
        println("Eating meat")
    }

    override fun sound() {
        println("Woof")
    }
}