open class DongVat(val ten : String){
    open fun keu() : String{
        return "chit chit!"
    }
}

class Cho(ten : String) : DongVat(ten){
    override fun keu() : String{
        return "Gau Gau"
    }
} 

class Meo(ten : String) : DongVat(ten){
    override fun keu() : String{
        return "Meow meow"
    }
} 



fun main() {

    val danhSachDongVat = listOf(Cho("Herry"), Meo("Tom"), Cho("Sung"), Cho("Phon"), Meo("hell"))
    for (s in danhSachDongVat){
        println("${s.ten} keu: ${s.keu()}")
    }
}

