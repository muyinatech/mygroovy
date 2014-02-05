/**
 * Created by Tosin on 03/02/14.
 */
def lst = [1,3,4,1,8,9,2,6]
println lst
println lst.getClass().name // ArrayList
println lst[0] // first element
println lst[lst.size() -1] // last element
println lst[-1] // last element
println lst[-2] // 2nd from last element
println lst[2..5] // get elements in a range
println lst[-6..-3] // get elements in a negative range
lst.each {println it}

total = 0
lst.each {total += it}
println "Total is $total"

doubled = []
lst.each {doubled << it * 2}
println()

println lst.collect {it * 2}

println lst.find {it == 2} // find the first number = 2
println lst.findAll {it == 2} // find all numbers = 2
println lst.findAll {it > 4} // find all numbers > 4

lst = ['Programming', 'In', 'Groovy']
println lst.collect {it.size()}.sum() // sum the length of each string
println lst.inject(0) {carryOver, element -> carryOver + element.size()}
println lst.join(' ')

lst[0] = ['Be', 'Productive'] // set at index 0
println lst

lst = lst.flatten() // make one-dimensional
println lst

println lst - ['Productive', 'In']

println lst.size()
println lst*.size() // spread operator same as lst.collect{it.size}

langs = ['C++':'Stroustrup','Java':'Gosling','Lisp':'McCarthy'] // LinkedHashMap by default
println langs.getClass().name
println langs['Java']
println langs['C++']
println langs.Java // access keys like a property
println langs.'C++'

langs = ['C++':'Stroustrup',Java:'Gosling',Lisp:'McCarthy'] // quotes are optional
langs.each { language, author ->
    println "Language $language was authored by $author"
}

println langs.collect { language, author ->
    language.replaceAll("[+]", "P")
}

entry = langs.find { language, author ->
   language.size() > 3
}
println "Found $entry.key written by $entry.value"

selected = langs.findAll { language, author ->
    language.size() > 3
}
selected.each { key, value ->
    println "Found $key written by $value"
}

friends = [briang:'Brian Green', brains:'Brian Saunders', davidb:'David Brown', davidg:'David Gordon',
        scottd:'Scott Davis',scottl:'Scott Lewis',stuarth:'Stuart Hill']

groupByFirstName = friends.groupBy {it.value.split(' ')[0]}
println groupByFirstName

groupByFirstName.each { firstName, buddies ->
    println "$firstName:${buddies.collect {key, fullName -> fullName}.join(', ')}"
}