package nullsafety

import model.Person
import model.fetchPerson

fun livesInCanada(person: Person): Boolean {
    return false
}

fun main(args: Array<String>) {
    val person = fetchPerson()
    println(livesInCanada(person))
}