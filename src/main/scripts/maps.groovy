names = ['james':'brown', mariah:'carey','janet':'jackson', '101':'coben']// quotes optional for well defined keys
println names.getClass().name // java.util.LinkedHashMap
println names['james']
println names.james
println names.'101'

// attach a closure to each
names.each { entry ->
	println "name $entry.key has value $entry.value"	
}

names.each { name, surname ->
	println "first name $name has value $surname"
}

names.each { name, surname ->
	println 'first name $name has value $surname' // variable interpolation does not work with single quotes
}

println names.collect { entry ->
	entry.key.toUpperCase()
}

println names.collect { name, surname ->
	surname.toUpperCase()
}

entry = names.find { name, surname ->
	name.startsWith("j")
}

println "Found first entry starting with $entry"

entries = names.findAll { name, surname ->
	name.startsWith("j")
}

entries.each { name, surname ->
	println "found $name"
}

println names.any { name, surname ->
	name.startsWith("a")	
}

println names.every { name, surname ->
	surname.length() < 10
}

students = ['graham':'101', 'steven':'101', 'fred':'102', 'billy':'101', 'elizabeth':'103', 'kate':'103']
groups = students.groupBy { name, code ->
	code
}
groups.each { code, people ->
	println "$code : $people"
}