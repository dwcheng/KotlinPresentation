package model

data class Person(val address: Address?)

fun fetchPerson(): Person {
    val city = City("Toronto")
    val country = Country(city, "Canada")
    val address = Address(country, Continent.NORTH_AMERICA)
    return Person(address)
}