package com.sunnyweather.android

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

//开启协程
fun main() {
    GlobalScope.launch {
        println("codes run in coroutine scope")
    }
}