package examples

enum class ExampleTypeFactory : Example {
    CALCULATIONS_STRATEGY {
        override fun executeExample() {
            CalculationsExample.executeExample()
        }
    },
    ANIMALS_FACTORY {
        override fun executeExample() {
            AnimalsFactoryExample.executeExample()
        }
    },
    FOOD_ORDER_BUILDER {
        override fun executeExample() {
            FoodOrderBuilderExample.executeExample()
        }
    },
    ARRAY_OPERATIONS {
        override fun executeExample() {
            ArrayOperationsExample.executeExample()
        }
    },
    HASH_COMPARISON {
        override fun executeExample() {
            HashCodeComparison.executeExample()
        }
    };
}
