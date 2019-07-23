package examples

object ExamplesManager {
    fun executeExample(exampleName: ExampleType) {
        when (exampleName) {
            ExampleType.CALCULATIONS_STRATEGY -> CalculationsExample
            ExampleType.ANIMALS_FACTORY -> AnimalsFactoryExample
            ExampleType.FOOD_ORDER_BUILDER -> FoodOrderBuilderExample
            ExampleType.ARRAY_OPERATIONS -> ArrayOperationsExample
            ExampleType.HASH_COMPARISON -> HashCodeComparison
        }()
    }

    inline fun <Example> executeExample(example: () -> Example) { example() }

    fun executeExample(example: Example) { example() }
}