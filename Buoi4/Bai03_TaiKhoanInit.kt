class TaiKhoanNganHang(soTaiKhoan : String,
                      soDuBanDau : Double){
    var soDu : Double = soDuBanDau
    init{
        if (soDuBanDau < 0) println("So du khong hop le")
        else println("Tao tai khoan thanh cong, so du ban dau la: $soDu")
    }
    
}


fun main() {
  	val sd1 = TaiKhoanNganHang("2233123", 100000.0)
 	val sd2 = TaiKhoanNganHang("6532443", -100000.0)
}

