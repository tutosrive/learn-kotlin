package com.srm.learn.topics

import com.srm.learn.models.RunTemplate

class Types1: RunTemplate() {
    override fun doAll() {
        val variables: Array<Any> = this.variablesSet()

        for(varI in variables){
            println("Variable Value: [$varI]")
        }
    }

    fun variablesSet(): Array<Any> {
        val int: Int = 12
        val float: Float = 12.1f
        val double: Double = 12.2
        val char: Char = 'a'
        val str: String = "This is a text"

        val arrAny: Array<Any> = arrayOf(int, float, double, char, str)
        return arrAny
    }

}