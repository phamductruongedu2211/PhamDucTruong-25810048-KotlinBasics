interface CoTheTinhDienTich {
    fun tinhDienTich(): Double
}


class HinhVuong(val canh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double = canh * canh
}


class HinhTron(val r: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double = Math.PI * r * r
}

fun main() {
    val hv = HinhVuong(5.0)
    val ht = HinhTron(3.0)

    println("dthv: ${hv.tinhDienTich()}")
    println("dtht: ${ht.tinhDienTich()}")
}