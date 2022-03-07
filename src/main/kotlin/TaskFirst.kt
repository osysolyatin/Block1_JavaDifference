fun main() {
    var amountPerMonth = 0
    val minCommission: Double = 35.0

    if (amountPerMonth <= 600_000) {
        val amount = 100_000
        val commission = if (amount * 0.0075 > minCommission) amount * 0.0075 else minCommission
        println("Размер комиссии составит: $commission рублей")
        println("Суммарный платеж, с учетом комиссии составит: " + (amount + commission))
        amountPerMonth += amount
    } else println("Вы превысили месячный лимит переводов")
}