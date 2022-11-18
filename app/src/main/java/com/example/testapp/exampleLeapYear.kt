package com.example.testapp

import java.util.*

class LeapYear() {

    fun checkLeapYear(year: Int) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            println("Leap year")
        } else {
            println("Not a Leap Year")
        }
    }
}

fun main() {
    var y = LeapYear()
    var s = Scanner(System.`in`)
    println("Please enter year: ")
    var year = s.nextInt()
    y.checkLeapYear(year)

}