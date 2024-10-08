package org.book

import org.book.algorithms.Algorithm
import org.book.algorithms.binarysearch.BinarySearch
import org.book.algorithms.simplesearch.SimpleSearch
import java.io.File
import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  val algorithm: List<Algorithm> =
      listOf(BinarySearch(), SimpleSearch())

    val numbers = File("numbers.txt").readText().trim().split(" ").map { it.toInt() }
    val firstNumber = numbers[0]
    val randomNumber = Random.nextInt(firstNumber, numbers.size)

    println("Initiating searchs with list size=[${numbers.size}] and random number=[$randomNumber]")
    algorithm.forEach { it.execute(numbers, randomNumber)}

}