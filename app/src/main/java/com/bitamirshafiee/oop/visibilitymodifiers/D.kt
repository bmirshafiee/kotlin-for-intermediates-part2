package com.bitamirshafiee.oop.visibilitymodifiers

class D : B() {

    fun accessAFromD(){
        val instanceA = A()
        println("property class A is : ${instanceA.propertyA}")
        instanceA.functionA()
    }
}