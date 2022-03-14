const val MAX_MONTH_LIMIT = 600_000
const val MIN_COMMISSION = 35
const val TRANSACTION_COMMISSION = 0.0075

fun main() {
    var amountPerMonth = 0

    if (amountPerMonth <= MAX_MONTH_LIMIT) {
        val amount = 100_000
        val commission =
            if (amount * 100 * TRANSACTION_COMMISSION > MIN_COMMISSION * 100) (amount * 100 * TRANSACTION_COMMISSION).toInt() else (MIN_COMMISSION * 100)
        println("Размер комиссии составит: $commission копеек")
        println("Суммарный платеж, с учетом комиссии составит: ${(amount + (commission / 100))} рублей")
        amountPerMonth += amount
    } else println("Вы превысили месячный лимит переводов")
}