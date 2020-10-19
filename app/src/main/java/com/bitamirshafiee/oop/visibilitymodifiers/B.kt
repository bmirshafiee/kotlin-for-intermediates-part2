package com.bitamirshafiee.oop.visibilitymodifiers

open class B {

    fun accessClassAFromB(){

        val instanceA = A()
        println("property class A is : ${instanceA.propertyA}")
        instanceA.functionA()
    }
}