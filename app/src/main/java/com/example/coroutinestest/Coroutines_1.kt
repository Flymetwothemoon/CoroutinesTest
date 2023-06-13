package com.example.coroutinestest

import kotlinx.coroutines.*

fun main00(){
    runBlocking {
        launch {
            println("哈哈哈")
        }
        val result = async {
             5+5

        }.await()
        println(result)
    }
}

fun main333()
{
    val start = System.currentTimeMillis()
    runBlocking {
        val result1 = async {
            delay(1000)
            5 + 5
        }.await()

        val result2 = async {
            delay(1000)
            4 + 6
        }.await()
        println("result is ${result1+result2}")
        val end = System.currentTimeMillis()
        println("时间 ${end-start}")
    }
    }
fun main44(){
        runBlocking {
            val start = System.currentTimeMillis()
            val deferred1 = async {
                delay(1000)
                5 + 5
            }

            val deferred2 = async {
                delay(1000)
                4 + 6
            }
            println("result is ${deferred1.await() + deferred2.await()}")
            val end = System.currentTimeMillis()
            println("cost: ${end - start} ms.")

            val result1 = withContext(Dispatchers.Default){

            }
        }
}

