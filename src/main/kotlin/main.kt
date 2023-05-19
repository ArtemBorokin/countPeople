package ru.netology

fun main() {
    println ("введите колличество лайков")
    var count:Int   = readLine()!!. toInt()

    if (count == 11 || count % 100 == 20) {
        println("Понравилось $count людям")
    }
    else if (count == 1 || count % 10 == 1){
        println("Понравилось $count человеку")
    }
    else {
        println("Понравилось $count людей")
    }
}
