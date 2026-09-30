// Phạm Đức Trường - 25810048
class NhanVien(
	maNhanVien : String,
    val ten : String,
    var luongThang : Double
){
    constructor(ten : String) : this(maNhanVien = "TAM", ten = ten, luongThang = 0.0)
}


fun main() {
    val nv1 = NhanVien("TRGN","Truong", 15.0)
    val nv2 = NhanVien("Hoang")
    // khi dung code nv1.maNhanVien, vi maNhanVien la tham so tam thoi nen no ko luu vao object, nen no khong ton tai ngay
    //sau khi khoi tao
    
   println("""
   nv1
   ten: ${nv1.ten}
   luong thang : ${nv1.luongThang}
   
   
   nv2
   ten: ${nv2.ten}
   luong thang : ${nv2.luongThang}
   
   """)
}

