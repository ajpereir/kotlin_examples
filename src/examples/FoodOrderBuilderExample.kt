package examples

import food.FoodOrder

object FoodOrderBuilderExample: Example {
    override fun invoke() {
        val foodOrder: FoodOrder = FoodOrder.Builder()
                .bread("random")
                .condiments("cilantro")
                .meat("chicken")
                .build()

        println(foodOrder.toString())
    }
}