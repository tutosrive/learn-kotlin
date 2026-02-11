package com.srm.learn.models

open class RunTemplate {
    open val topic = "Template"

    fun run(){
        this.getTopic()
        this.doAll()
    }

    /**
     * Mostrar resultados de ejecución  ...
     * */
    open fun doAll(){
        println("\"RunTemplate.todoAll()\" method...")
    }

    open fun getTopic(){
        println(this.topic)
    }
}