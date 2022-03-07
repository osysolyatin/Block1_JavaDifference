fun main() {
    val itemPrice = 1_000
    val itemCount = 11
    val discount = 100
    val discountInPercent = 0.05
    val discountStart = 1_000
    val discountPercentStart = 10_000
    var numberOfPurchasePerMonth = 1 //кол-во покупок в месяц

    val totalPrice = itemPrice * itemCount
    numberOfPurchasePerMonth++ // после покупки инкреминтируем кол-во покупок
    val isMusicLover = numberOfPurchasePerMonth > 1 // проверка на "меломана"
    var result = if (totalPrice > discountPercentStart) {
        totalPrice - (totalPrice * discountInPercent)
    } else if (totalPrice > discountStart) {
        (totalPrice - discount).toDouble()
    } else totalPrice.toDouble()

    result = if (isMusicLover) result - (result * 0.01) else result // доп.скидка за меломанство
    println("Total Price: $result")
}