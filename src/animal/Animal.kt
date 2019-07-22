package animal

/**
 * Factory pattern example
 */
abstract class Animal {
    abstract var type: String
    abstract fun eat()
    abstract fun sound()

    companion object AnimalFactory {
        fun getAnimal(type: String): Animal {
            return when (type) {
                "Dog" -> Dog()
                "Sheep" -> Sheep()
                else -> throw Exception("No such animal!")
            }
        }
    }
}