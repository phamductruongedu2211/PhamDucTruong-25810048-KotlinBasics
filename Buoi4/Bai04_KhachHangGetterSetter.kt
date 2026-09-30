class KhachHang(
    var ho: String,
    var ten: String
) {
    var hoTen: String
        get() = "$ho $ten"
        set(value) {
            val p = value.split(" ")
            ho = p[0]
            ten = p[1]
        }
}

fun main() {
   
    val kh = KhachHang("Nguyen", "An")
    println("Ban dau: ${kh.hoTen}") 

  
    kh.ten = "Binh"
    println("Sau khi doi ten: ${kh.hoTen}")

    kh.hoTen = "Tran Dung"
    println("Sau khi set hoTen moi:")
    println("Ho: ${kh.ho}")   
    println("Ten: ${kh.ten}")
}