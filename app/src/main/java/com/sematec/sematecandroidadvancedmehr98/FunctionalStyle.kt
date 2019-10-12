package com.sematec.sematecandroidadvancedmehr98

class FunctionalStyle {

    init {
        val list = arrayListOf<String>()
        list.add("Ali")
        list.add("Ali")
        list.add("Ali")
        list.add("Ali")
        list.add("Ali")
        list.add("Ali")
        list.add("Ali")
        list.add("Ali")
        list.add("Ali")
        list.add("Mamad")
        list.add("Qoli")
        list.add("Saeed")

        val uniqueNames = arrayListOf<String>()
        list.forEach {
            if (it != "Ali")
                uniqueNames.add(it)
            print(it)
        }


        val myUniqueList = list.filter { it == "Saman" }


        list.first()
        list.last()

        list.firstOrNull()

        list.indexOfFirst { it == "Mamad" }
        list.indexOfLast { it == "Ali" }

        val secondItem = list[2] // list.get(2)


        list.isEmpty()

        list.isNullOrEmpty()


        list.sortByDescending { it }


    }
}