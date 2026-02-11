package com.srm.learn.models

open class RunTemplate(
    t: String
) {
    open val topic = t

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
        println("\n#########\nTema: ${this.topic}\n#########\n")
    }
}