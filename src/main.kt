import examples.CalculationsExample
import examples.ExampleTypeFactory
import examples.ExamplesManager

fun main(args: Array<String>) {
//    ExamplesManager.invoke(ExampleType.CALCULATIONS_STRATEGY)
//    ExampleTypeFactory.CALCULATIONS_STRATEGY.invoke()
    ExamplesManager.executeExample { CalculationsExample() }
//    ExamplesManager.executeExample(CalculationsExample)
}
