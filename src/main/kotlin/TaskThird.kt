const val ITEM_PRICE = 1_000U
const val DISCOUNT_SUM_START = 1_000U
const val DISCOUNT_SUM_IN_PERCENT_START = 10_000U
const val DISCOUNT_BASIS = 100U
const val DISCOUNT_IN_PERCENT = 5U
const val DISCOUNT_MUSIC_LOVER = 1U

fun main() {
    print("Введите кол-во дисков, которое хотите купить (например 11) : ")
    val itemCount = readLine()?.toUInt() ?: return
    var numberOfPurchasePerMonth = 1 //кол-во покупок в текущем месяце

    val totalPrice = ITEM_PRICE * itemCount * 100U
    numberOfPurchasePerMonth++ // после покупки инкреминтируем кол-во покупок
    val isMusicLover = numberOfPurchasePerMonth > 1 // проверка на "меломана" (true/false)

    var result = if (totalPrice > DISCOUNT_SUM_IN_PERCENT_START * 100U) {
        totalPrice - (totalPrice * DISCOUNT_IN_PERCENT / 100U)
    } else if (totalPrice > DISCOUNT_SUM_START * 100U) {
        (totalPrice - DISCOUNT_BASIS * 100U)
    } else totalPrice

    result = if (isMusicLover) result - (result * DISCOUNT_MUSIC_LOVER / 100U) else result // доп.скидка за меломанство
    println("Сумма покупки с учетом скидок составит:  ${result / 100U} рублей ${result % 100U} копеек")
}