package com.srm.learn.topics

import com.srm.learn.models.RunTemplate

class Lists3 : RunTemplate(t = "Listas (List)") {
    override fun doAll() {
        val lists: List<Any> = this.createLists()

        for (list in lists) {
            println("Objeto Lista: \n=> $list")
            //println("Primer elemento: ${list.first()}")
        }
    }

    fun createLists(): List<Any> {
        // Lista de solo lectura
        val pairNumbers: List<Int> = listOf(2, 4, 6, 8, 10, 12, 14, 16, 18)

        // Lista mutable
        val users = mutableListOf<String>("Santiago", "Nicrolax", "Eduardo")

        val allLists = listOf<Any>(users)
        return allLists
    }
}