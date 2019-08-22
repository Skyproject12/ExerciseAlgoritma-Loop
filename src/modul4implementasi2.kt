fun main (args : Array<String>) {
        angkaBerulang()
}

fun angkaBerulang () {
        var t=-1
    for(i in 1..5){
        for(j in i..5){
            print(j)
        }
        t++
        for (l in 1..t) {
            print(l)
        }
        println()
    }
}