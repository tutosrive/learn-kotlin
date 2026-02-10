package com.srm.learn.models

open class RunTemplate {
    fun run(){
       this.doAll()
    }

    /**
     * Mostrar resultados de ejecución  ...
     * */
    open fun doAll(){
        println("\"RunTemplate.todoAll()\" method...")
    }
}