package com.jiiwon79.motteapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MotteAppApplication

fun main(args: Array<String>) {
    runApplication<MotteAppApplication>(*args)
}
