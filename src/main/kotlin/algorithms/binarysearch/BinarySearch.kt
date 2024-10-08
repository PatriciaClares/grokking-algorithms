package org.book.algorithms.binarysearch

import org.book.algorithms.Algorithm
import kotlin.system.measureTimeMillis

class BinarySearch : Algorithm {
    override fun execute(list: List<Int>, number: Int) {

        val timeInMillis = measureTimeMillis {
            var baixo = 0
            var alto = list.size - 1

            while (baixo <= alto) {
                val meio = (baixo + alto) / 2
                val chute = list[meio]
                if (chute == number) {
                    break
                } else if (chute > number) {
                    alto = meio - 1
                } else {
                    baixo = meio + 1
                }

            }
        }

        println("Binary Search execution time: $timeInMillis ms")
    }
}