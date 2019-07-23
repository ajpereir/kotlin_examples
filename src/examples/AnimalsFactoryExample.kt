package examples

import animal.Animal

object AnimalsFactoryExample: Example {
    override fun invoke() {
        val animals: Array<String> = arrayOf("Dog", "Sheep")
        animals.forEach { animalType ->
            val animal: Animal = Animal.getAnimal(animalType)
            println("-------------------------------")
            println("Animal Type: ${animal.type}")
            print("A ${animal.type} does: ")
            animal.sound()
            animal.eat()
            println("-------------------------------")
        }
    }
}