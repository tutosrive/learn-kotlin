package com.srm.learn
import com.srm.learn.models.RunTemplate
import com.srm.learn.topics.Types1

fun main() {
    val typesObj: Types1 = Types1()
    val arrAllObj: Array<RunTemplate> = arrayOf(typesObj)

    callRunAll(arrAllObj)
}

fun callRunAll(objs: Array<RunTemplate>){
    for(obj in objs){
        obj.run()
    }
}