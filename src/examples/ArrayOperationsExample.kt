package examples

object ArrayOperationsExample : Example {
    override fun executeExample() {
        val range = 1..10
        var array: Array<Int> = arrayOf()

        range.step(2).forEach { value ->
            array += value
        }

        println("Array size is: ${array.size}")

        printRangedArray(array)

        printFilteredValues(array)
    }

    private fun printRangedArray(array: Array<Int>) {
        print("Ranged array: ")

        array.forEach {
            if (it > 1) {
                print(it)
                if (it != array.last()) print(", ") else println("")
            }
        }
    }

    private fun printFilteredValues(array: Array<Int>) {
        val filteredArray: Array<Int> = array.asSequence().filter { it > 5 }.toList().toTypedArray()

        filteredArray.forEach { println("New filtered value: $it") }
    }
}