package com.srm.learn.topics

import com.srm.learn.models.RunTemplate

class Variables2: RunTemplate() {
    override fun doAll() {
        val vars: Array<Any> = this.setAllVariables()

        println("\n#############\nTema: Variables\n#############\n")
        for(varI in vars){
            println("Valor de variable: [$varI]")
        }
    }

    fun setAllVariables(): Array<Any>{
       val isInteger: Int = 123
       val isLong: Long = 12321212L
       val isBoolean: Boolean = false
       val isString: String = "Texto de ejemplo"
       val isFloat: Float = 12.9458f
       val isDouble: Double = 12.9458
       val isChar: Char = 'a'

        val variables: Array<Any> = arrayOf(isInteger, isLong, isBoolean, isString, isFloat, isDouble, isChar)
        return variables
    }
}