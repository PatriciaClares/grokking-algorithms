package org.book.algorithms.simplesearch

import org.book.algorithms.Algorithm
import kotlin.contracts.contract
import kotlin.system.measureTimeMillis

class SimpleSearch : Algorithm {
    override fun execute(list: List<Int>, number: Int) {

        val timeInMillis = measureTimeMillis {
            var count = 0
            while (count != number) {
                count++
            }
        }

        println("Simple Search execution time: $timeInMillis ms")
    }
}