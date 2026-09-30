// Phạm Đức Trường - 25810048
fun String.demnguyenam() : Int {
    var diem : Int = 0
    val g : String = "aeiou"
    for (c in this.lowercase()){
        if (c in g){
            diem++
        }
    }
    return diem
}

fun Int.lasonguyento() : Boolean {
    var diem : Int = 0
    if (this >= 2 ){
        for (i in 1..this){
            if (this % i == 0){
                diem++
            }
            if (diem > 2) return false
        }
        return true
    }
    else return false
}

fun main() {
    println("chuoi xin chao co so nguyen am la: " + "xin chao".demnguyenam())
    println("chuoi kotlin co so nguyen am la: " + "kotlin".demnguyenam())
    println("chuoi lap trinh co so nguyen am la: " + "lap trinh".demnguyenam())

    println("so 1 co phai so nguyen to: " + 1.lasonguyento())
    println("so 7 co phai so nguyen to: " + 7.lasonguyento())
    println("so 9 co phai so nguyen to: " + 9.lasonguyento())
}