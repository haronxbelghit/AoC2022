package day01

import readInput

fun main() {
    val elves = mutableListOf(0)

    fun part1(input: List<String>): Int {
        for (line in input) {
            if (line == "") {
                elves.add(0)
            } else {
                elves[elves.size - 1] += line.toInt()
            }
        }
        return elves.max()
    }

    fun part2(): Int {
        return elves.sortedByDescending { it }.take(3).sum()
    }

    // tests
    val testInput = readInput("day01/test")
    check(part1(testInput) == 24000)
    check(part2() == 45000)

    // answers
    val input = readInput("day01/input")
    println(part1(input))
    println(part2())
}
