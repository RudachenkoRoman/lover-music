package ru.netology

import kotlin.math.ceil

fun main() {
    val itemPrice = 100
    val discountOneHundred = 100
    val discountOneLevel = 1_001
    val discountTwoLevel = 10_001

    print("Введите количество музыкальных произведений для покупки: ")
    val itemCount = readLine()?.toInt() ?: return
    var result: Double
    val totalPrice: Int
    if (itemCount <= 0) {
        println("Вы ввели неверную сумму. Сумма должна быть больше 0")
        return
    } else {
        totalPrice = itemPrice * itemCount
        println("Покупка - $totalPrice рублей →\n")
        result = when (totalPrice) {
            in discountOneLevel..discountTwoLevel -> (totalPrice - discountOneHundred).toDouble()
            in discountTwoLevel..Int.MAX_VALUE -> (totalPrice - (totalPrice / 100 * 5)).toDouble()
            else -> {
                totalPrice.toDouble()
            }
        }
    }

    when (totalPrice) {
        in discountOneLevel..10_000 -> println("После применения скидки 100 рублей - ${result.toInt()} рублей.\n")
        in discountTwoLevel..Int.MAX_VALUE -> println("После применения скидки 5% - ${result.toInt()} рублей.\n")
    }

    val randomValue = (1..2).random()
    if (randomValue == 1) {
        println("Вы настоящий \"меломан\"!, поэтому мы даем вам дополнительную скидку 1%!! ")
        result *= 0.99
        val pennies = (result - result.toInt()) * 100
        println("После применения 1% скидки - ${result.toInt()} рублей ${ceil(pennies).toInt()} копеек.")
    }
}



