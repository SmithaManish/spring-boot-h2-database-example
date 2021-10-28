package com.javatpoint

import org.springframework.boot.autoconfigure.SpringBootApplication
import kotlin.jvm.JvmStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class SpringBootH2DatabaseExampleApplication

fun main(args: Array<String>) {

    runApplication<SpringBootH2DatabaseExampleApplication>(*args)
    println(" **** Spring Boot Kotlin RESTful Web Services CRUD Example!!! *****")
}


