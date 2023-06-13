package com.example.coroutinestest

import android.util.Log
import kotlinx.coroutines.*

fun main(){
GlobalScope.launch {
    println("GlobalScope")
    delay(1500)
    Log.d("TAG","GlobalScope_1")
}
    Thread.sleep(1000)
}
fun main1(){
    runBlocking {
        println("runBlocking")
    }
}

fun main2(){
    runBlocking{
        launch {
            println("launch_0")
            delay(1000)
            println("launch_0 finished")
        }
        launch {
            println("launch_1")
            delay(1000)
            println("launch_1 finished")
        }
    }
}

fun main3(){
    runBlocking {
        main4()
        main5()
    }
}
suspend fun main4(){

    delay(1000)
    println("没有协程作用域_0")
}
fun main5(){
    println("没有协程作用域_1")
}
fun main6(){
    runBlocking {
        main7()
        main8()
    }
}
suspend fun main7() = coroutineScope{
   launch {
       println("coroutineScope_0")
       delay(1000)
   }
}
suspend fun main8() = coroutineScope{
    launch {
        var a = 10+5
        var ss = a*a
        println("coroutineScope_1")
        println(ss)
        delay(1000)
    }
}