package calculations

object DivideByTwo: Calculation {
    override fun calculate(value: Float): Float {
        return value/2
    }

    override fun invoke(value: Float): Float {
        return value/2
    }
}