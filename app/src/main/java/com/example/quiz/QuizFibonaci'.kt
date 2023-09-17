package com.example.quiz

//fungsi utama
fun main(args: Array<String>) {
    val n = 5
    var bil1 = 1
    var bil2 = 1

    print("bilangan ke $n adalah : ")

    //perulangan untuk angkanya agar bertambah
    for (i in 1..n) {
        print("$bil1 " )

        //penambahan antara bilangan 1 dan bilangan 2
        val sum = bil1 + bil2
        bil1 = bil2
        bil2 = sum
    }
}