package com.bitamirshafiee.oop

import java.lang.Exception

fun main(){

    val car1 = Car(50, 4, 2)

    println("car1 speed is : ${car1.speed}, gear is : ${car1.gear}, seat is : ${car1.seat}")

    println("car1 speed after speeding up is ${car1.speedUp()}")

    val car2 = Car(5, 60, 5, 4)

    println("the distance cross by speed ${car2.speed} will be ${car2.distance}")
}

