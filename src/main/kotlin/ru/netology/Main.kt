package ru.netology

fun main() {
    val itemPrice = 100
    val discountOneHundred = 100
    val discountOneLevel = 1_001
    val discountTwoLevel = 10_001
    var result: Double

    println("Введите количество музыкальных произведений для покупки:")
    val itemCount = readLine()!!.toInt()

    val totalPrice = itemPrice * itemCount
    println("Покупка - $totalPrice рублей →\n")
    if (totalPrice > discountOneLevel) {
        if (totalPrice in (discountOneLevel + 1) until discountTwoLevel) {
            result = ((totalPrice - discountOneHundred).toDouble())
            println("После применения скидки 100 рублей - ${result.toInt()} рублей.\n")
        } else {
            result = (totalPrice - (totalPrice / 100 * 5)).toDouble()
            println("После применения 5% скидки - ${result.toInt()} рублей.\n")
        }
    } else {
        result = totalPrice.toDouble()
    }

    val randomValue = (1..2).random()
    if (randomValue == 1) {
        println(
            "Вы настоящий \"меломан\"!, " +
                    "поэтому мы даем вам дополнительную скидку 1%!! "
        )
        var musicLover = result / 100 * 1
        result -= musicLover
        var integer = result.toInt()
        var double = (result - integer) * 100
        println("После применения 1% скидки - $integer рублей ${double.toInt()} копеек.")
    }
}
