class SanPham(
	val tenSanPham : String,
    val gia : Double,
    val soLuongTonKho : Int = 0
)


fun main() {
	val sp1 = SanPham("dien thoai", 9000000.0, 20)
    val sp2 = SanPham(gia = 10000000.0, tenSanPham = "Laptop")
    
   println(
        """
        sp1
        ten: ${sp1.tenSanPham}
        gia: ${sp1.gia}
        sl: ${sp1.soLuongTonKho}
        
        sp2
        ten: ${sp2.tenSanPham}
        gia: ${sp2.gia}
        sl: ${sp2.soLuongTonKho}
        """
    )
    
}

