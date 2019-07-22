package food

/**
 * Builder pattern example
 */
data class FoodOrder(
        val bread: String = "default",
        val condiments: String = "default",
        val meat: String = "default",
        val fish: String = "default") {

    data class Builder(
            private var bread: String? = "",
            private var condiments: String? = "",
            private var meat: String? = "",
            private var fish: String? = "") {

        fun bread(bread: String) = apply { this.bread = bread }
        fun condiments(condiments: String) = apply { this.condiments = condiments }
        fun meat(meat: String) = apply { this.meat = meat }
        fun fish(fish: String) = apply { this.fish = fish }
        fun build() = FoodOrder(bread.orEmpty(), condiments.orEmpty(), meat.orEmpty(), fish.orEmpty())
    }
}