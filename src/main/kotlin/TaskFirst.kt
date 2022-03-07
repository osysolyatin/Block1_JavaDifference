fun main() {
    val amount = 100_000
    val minCommission = 35
    val commission = if (amount * 0.0075 > minCommission) amount * 0.0075 else minCommission
    println("Размер комиссии составит: $commission рублей")
}