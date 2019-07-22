package examples

import calculations.Calculation
import calculations.DivideByTwo
import calculations.MultiplyByTwo

object CalculationsExample : Example {
    override fun executeExample() {
        val initialValue: Float = 100.toFloat()
        val dividedValue = executeCalculation(initialValue, DivideByTwo)
        val multipliedValue = executeCalculation(initialValue, MultiplyByTwo)
        println("$initialValue / 2 = $dividedValue")
        println("$initialValue * 2 = $multipliedValue")
    }

    private fun executeCalculation(value: Float, calculation: Calculation): Float {
        return when (calculation) {
            is DivideByTwo -> calculation(value)
            is MultiplyByTwo -> calculation.calculate(value)
            else -> throw Exception("No such implementation")
        }
    }
}