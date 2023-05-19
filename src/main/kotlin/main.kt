package ru.netology

fun main() {
    println ("введите колличество лайков")
    var count:Int   = readLine()!!. toInt()

    if (count % 10 == 1 && count % 100 != 11){
        println("Понравилось $count человеку")
    }
    else {
        println("Понравилось $count людям")
    }
}
