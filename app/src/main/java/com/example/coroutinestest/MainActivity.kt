package com.example.coroutinestest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main()
        main1()
        main2()
        main3()
        main6()
        var job = Job()
        var c = String()
        var coroutineScope = CoroutineScope(job)
        coroutineScope.launch {
            c = "nihao"
        }
        println(job)
        main00()
        main333()
        main44()
    }
}