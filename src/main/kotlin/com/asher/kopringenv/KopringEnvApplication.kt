package com.asher.kopringenv

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KopringEnvApplication

fun main(args: Array<String>) {
	runApplication<KopringEnvApplication>(*args)
}
