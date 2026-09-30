// Phạm Đức Trường - 25810048
class TaiKhoanNganHang(soTaiKhoan : String,
                      soDuBanDau : Double){
    var soDu : Double = soDuBanDau
    init{
        if (soDuBanDau < 0) println("So du khong hop le")
        else println("Tao tai khoan thanh cong, so du ban dau la: $soDu")
    }
    
    fun napTien(soTien:Double){
        soDu +=soTien
    }
    
    fun rutTien(soTien:Double) : Boolean{
        if (soTien > soDu) {
            println("So du khong du!!")
            return false}
        else {
            soDu -=soTien
            println("Da rut $soTien thanh cong!")
            
            
            return true}
    }
    
}


fun main() {
  	val sd1 = TaiKhoanNganHang("2233123", 100000.0)
    println("So du sd1 ban dau: ${sd1.soDu}")
    sd1.napTien(100000.0)
    println("So du sd1 sau khi nap tien: ${sd1.soDu}")
    sd1.rutTien(50000.0)
    println("So du sd1 sau khi rut tien: ${sd1.soDu}")
 	val sd2 = TaiKhoanNganHang("6532443", -100000.0)
    println("So du sd2 ban dau: ${sd2.soDu}")
    sd2.napTien(100000.0)
    println("So du sd2 sau khi nap tien: ${sd2.soDu}")
    sd2.rutTien(5000000.0)
    println("So du sd2 sau khi rut tien: ${sd2.soDu}")
}

