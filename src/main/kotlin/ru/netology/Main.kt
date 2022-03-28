package ru.netology

import kotlin.math.ceil

fun main() {
    val itemPrice = 100
    val discountOneHundred = 100
    val discountOneLevel = 1_001
    val discountTwoLevel = 10_001

    print("Введите количество музыкальных произведений для покупки: ")
    val itemCount = readLine()?.toInt() ?: return
    if (itemCount <= 0) {
        println("Вы ввели неверное количество. Количество должно быть больше 0")
        return
    }
    var totalPrice: Double = (itemPrice * itemCount).toDouble()
    println("Покупка - ${totalPrice.toInt()} рублей →\n")
    if (totalPrice > discountOneLevel) {
        if (totalPrice > discountTwoLevel) {
            totalPrice *= 0.95
            println("После применения 5% скидки - ${totalPrice.toInt()} рублей\n")
        } else {
            totalPrice -= discountOneHundred
            println("После применения скидки 100 рублей - ${totalPrice.toInt()} рублей\n")
        }
    }

    val randomValue = (1..2).random()
    if (randomValue == 1) {
        println("Вы настоящий \"меломан\"!, поэтому мы даем вам дополнительную скидку 1%!! ")
        totalPrice *= 0.99
        val pennies = (totalPrice - totalPrice.toInt()) * 100
        println("После применения 1% скидки - ${totalPrice.toInt()} рублей ${ceil(pennies).toInt()} копеек.")
    }
}



