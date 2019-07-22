package examples

import food.FoodOrder

object HashCodeComparison: Example {
    override fun executeExample() {
        val foodOrder1: FoodOrder = FoodOrder.Builder()
                .bread("bread")
                .condiments("condiments")
                .meat("meat")
                .fish("fish")
                .build()

        val foodOrder2: FoodOrder = FoodOrder.Builder()
                .bread("bread")
                .condiments("condiments")
                .meat("meat")
                .fish("fish")
                .build()

        println("Are the objects equal? ${foodOrder1.hashCode() == foodOrder2.hashCode()}")
    }
}