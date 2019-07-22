package examples

object ExamplesManager {
    fun executeExample(exampleName: String) {
        when (exampleName) {
            "calculations strategy" -> CalculationsExample
            "animals factory" -> AnimalsFactoryExample
            "food order builder" -> FoodOrderBuilderExample
            "array operations" -> ArrayOperationsExample
            "hash comparison" -> HashCodeComparison
            else -> throw Exception("No such example!")
        }.executeExample()
    }
}