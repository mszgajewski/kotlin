
val newHumanString = """
    {"name":"John",
    "age":25, 
    "friends":["Mike","Helen"]}""".trimIndent()

val newHuman = humanAdapter.fromJson(newHumanString)

val humanList = listOf(human, newHuman)

val type = Types.newParameterizedType(List::class.java, Human::class.java)
val humanListAdapter = moshi.adapter<List<Human?>>(type)
print(humanListAdapter.toJson(humanList))