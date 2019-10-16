package com.sematec.sematecandroidadvancedmehr98

class FunctionalCoding {


    // name
    // sort by age


    fun sortPersonByAge(): Boolean {
        val people = arrayListOf<Person>()
        people.add(Person("Samad", "Samadian", 45))
        people.add(Person("Ali", "Alizade", 30))
        people.add(Person("Mohammad", "Mohammadpour", 10))
        people.add(Person("Sina", "Sinazade", 50))
        people.add(Person("Somaye", "Somayeeeyan", 20))


        return people
            .filter { "m" in it.name }
            .sortedBy { it.age }
            .map {
                PersonNameModel(it.name, it.family)
            }
            .count() > 3
    }


    fun learningZip() {
        val list = arrayListOf<Int>()
        list.add(10)
        list.add(5)
        list.add(5)
        list.add(10)
        list.add(9)
        list.add(3)
        list.add(10)
        list.add(2)
        list.add(2)
        list.add(2)

        list
            .filter { listNumber -> list.count { it == listNumber } == 3 }
            .distinct()
            .forEach {
                println(it)
            }



    }
}