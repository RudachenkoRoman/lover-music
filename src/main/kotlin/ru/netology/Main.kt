package ru.netology

fun main() {
    val itemPrice = 100
    val discountOneHundred = 100
    val discountOneLevel = 1_001
    val discountTwoLevel = 10_001

    print("Введите количество музыкальных произведений для покупки: ")
    val itemCount = readLine()?.toInt() ?: return
    val totalPrice = itemPrice * itemCount
    println("Покупка - $totalPrice рублей →\n")
    var result = if (totalPrice < discountTwoLevel){ ((totalPrice - discountOneHundred).toDouble()) }
    else { (totalPrice - (totalPrice / 100 * 5)).toDouble() }

when (totalPrice) {
    in discountOneLevel..10_000 -> println("После применения скидки 100 рублей - $result рублей.\n")
    in discountTwoLevel..Int.MAX_VALUE -> println("После применения скидки 5% - $result рублей.\n")
}

val randomValue = (1..2).random()
if (randomValue == 1) {
    println("Вы настоящий \"меломан\"!, поэтому мы даем вам дополнительную скидку 1%!! ")
    result *= 0.99
    val integer = result.toInt()
    val double = (result - integer) * 100
    println("После применения 1% скидки - $integer рублей ${double.toInt()} копеек.")
}
}



