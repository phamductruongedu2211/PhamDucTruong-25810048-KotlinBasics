// Phạm Đức Trường - 25810048

abstract class PhuongTienDiChuyen {
    abstract val tocDoToiDa: Int

    fun moTa() {
        println("toc do toi da phuong tien nay la $tocDoToiDa km/h.")
    }
}


class XeMay : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 110
}


class OTo : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 200
}

fun main() {
    val xeMay = XeMay()
    val oTo = OTo()

    print("xe may: ")
    xeMay.moTa()

    print("oto: ")
    oTo.moTa()
}