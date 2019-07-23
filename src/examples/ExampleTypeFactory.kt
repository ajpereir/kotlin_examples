package examples

enum class ExampleTypeFactory : Example {
    CALCULATIONS_STRATEGY {
        override fun invoke() {
            CalculationsExample()
        }
    },
    ANIMALS_FACTORY {
        override fun invoke() {
            AnimalsFactoryExample()
        }
    },
    FOOD_ORDER_BUILDER {
        override fun invoke() {
            FoodOrderBuilderExample()
        }
    },
    ARRAY_OPERATIONS {
        override fun invoke() {
            ArrayOperationsExample()
        }
    },
    HASH_COMPARISON {
        override fun invoke() {
            HashCodeComparison()
        }
    };
}
