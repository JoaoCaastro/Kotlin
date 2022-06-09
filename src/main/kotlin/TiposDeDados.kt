/**
 * Type     Bit
 * Double   64
 * Float    32
 * Long     64
 * Int      32
 * Short    16
 * Byte     8
 * Boolean  ? Documentação não explicita o tamanho do conteúdo
 * String   ? Não possui tamanho máx definida, depende somente do conteúdo inserido
 * Char     ? É somente um único caractere
 */

fun main() {

    val b: Boolean = true // ou false
    val s: String = "Qualquer texto inserido"
    val c: Char = 'C'

    val double: Double = 10.0
    val float: Float = 10f
    val long: Long = 10L
    val int: Int = 10
    val short: Short = 10
    val byte: Byte = 10

    val idade = 22 // Inferência de tipos

    println("****INTERVALO MIN - MAX DE CADA TIPO DE DADOS****")

    println("Double MIN ${Double.MIN_VALUE} - MAX ${Double.MAX_VALUE}")
    println("Float MIN ${Float.MIN_VALUE} - MAX ${Float.MAX_VALUE}")
    println("Long MIN ${Long.MIN_VALUE} - MAX ${Long.MAX_VALUE}")
    println("Int MIN ${Int.MIN_VALUE} - MAX ${Int.MAX_VALUE}")
    println("Short MIN ${Short.MIN_VALUE} - MAX ${Short.MAX_VALUE}")
    println("Byte MIN ${Byte.MIN_VALUE} - MAX ${Byte.MAX_VALUE}")

}