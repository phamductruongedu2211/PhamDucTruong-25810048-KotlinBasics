data class SinhVien(val mssv : String, val hoTen : String, val diemTrungBinh : Double)

fun main() {
	val ob1 = SinhVien("34324324", "Pham Duc Truong", 1.4)
    val ob2 = SinhVien("34324324", "Pham Duc Truong", 1.4)
    println(ob1)
    println(ob1 == ob2)
    val ob3 = ob1.copy(diemTrungBinh = 3.6)
    print(ob3)
    
}