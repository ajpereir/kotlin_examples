package calculations

interface Calculation {
    /**
     * Calculation called by calling .calculate() on a class instance
     */
    fun calculate(value: Float): Float

    /**
     * Called by the invoke operator ()
     */
    operator fun invoke(value: Float): Float
}