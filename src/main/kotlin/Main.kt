package com.srm.learn
import com.srm.learn.models.RunTemplate
import com.srm.learn.topics.Types1
import com.srm.learn.topics.Variables2

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val typesObj: Types1 = Types1()
    val variables: Variables2 = Variables2()
    val arrAllObj: Array<RunTemplate> = arrayOf(typesObj, variables)

    callRunAll(arrAllObj)
}

fun callRunAll(objs: Array<RunTemplate>){
    for(obj in objs){
        obj.run()
    }
}