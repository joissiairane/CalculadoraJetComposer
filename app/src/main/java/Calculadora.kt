class Calculadora {

    fun sum(a: Double, b:Double): Double = a + b

    fun subtract(a: Double, b:Double): Double = a - b

    fun multiply(a: Double, b:Double): Double = a * b

    fun divide(a: Double, b:Double): Double {
        if (b == 0.0) throw java.lang.IllegalArgumentException("Divisao por zero nao pode...")
        return a/b
    }
//throw lançar trtais a informação de onde deu o erro na cadeia de
}