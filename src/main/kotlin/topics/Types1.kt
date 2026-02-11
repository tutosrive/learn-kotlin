package com.srm.learn.topics

import com.srm.learn.models.RunTemplate

class Types1: RunTemplate(t="Tipos de datos básicos") {
    override fun doAll() {
        val variables = this.variablesSet()

        for(varI in variables){
            println("Variable Value: [$varI]")
        }
    }

    fun variablesSet(): Array<Any> {
        val int = 12
        val float = 12.1f
        val double = 12.2
        val char = 'a'
        val str = "This is a text"
        val boolean = true
        val long = 99_8818212_012991212

        val arrAny: Array<Any> = arrayOf(int, float, double, char, str, boolean, long)
        return arrAny
    }

}