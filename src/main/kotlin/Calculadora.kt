import kotlin.math.*


class Calculadora {
    fun somar(num1: Float, num2: Float): Float = num1 + num2

    fun subtrair(num1: Float, num2: Float): Float = num1 - num2

    fun multiplicar(num1: Float, num2: Float): Float = num1 * num2

    fun dividir(divisor: Float, dividendo: Float): Float = divisor / dividendo

    fun potencializar(base: Double, expoente: Double): Float = base.pow(expoente).toFloat()

    fun raizQuadrada(numero: Double): Float = sqrt(numero).toFloat()

    fun restoDivisao(numero:Float,modulo:Float):Float = numero%modulo
}
