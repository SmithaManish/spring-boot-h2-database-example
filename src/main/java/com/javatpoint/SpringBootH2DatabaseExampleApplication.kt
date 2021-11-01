package com.javatpoint

import org.springframework.boot.autoconfigure.SpringBootApplication
import kotlin.jvm.JvmStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing

open class SpringBootH2DatabaseExampleApplication

fun main(args: Array<String>) {

    runApplication<SpringBootH2DatabaseExampleApplication>(*args)
    println(" **** Spring Boot Kotlin RESTful Web Services CRUD Example!!! *****")
}


