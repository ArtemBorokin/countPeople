package ru.netology

fun main() {
    println ("введите колличество лайков")
    var count:Int   = readLine()!!. toInt()

    if (count == 11 || count == 111 || count == 1311|| count == 10050011) {
        println("Понравилось $count людям")
    }
    else if (count == 1 || count == 111 || count % 10 == 1 || count % 111 == 11){
        println("Понравилось $count человеку")
    }
    else {
        println("Понравилось $count людям")
    }
}
