import examples.CalculationsExample
import examples.ExampleType
import examples.ExampleTypeFactory
import examples.ExamplesManager

fun main(args: Array<String>) {
    val divider = "-------------------"
    println(divider)
    ExamplesManager.executeExample(ExampleType.CALCULATIONS_STRATEGY)
    println(divider)
    println(divider)
    ExampleTypeFactory.CALCULATIONS_STRATEGY()
    println(divider)
    println(divider)
    ExamplesManager.executeExample { CalculationsExample() }
    println(divider)
    println(divider)
    ExamplesManager.executeExample(CalculationsExample)
    println(divider)
}
