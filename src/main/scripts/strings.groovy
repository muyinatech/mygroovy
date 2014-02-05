/**
 * Created by Tosin on 03/02/14.
 */

def printClassInfo(obj) {
    println "class: ${obj.getClass().name}"
    println "superclass: ${obj.getClass().superclass.name}"
}
val = 125
printClassInfo "The Stock closed at ${val}" // GString
printClassInfo "/The Stock closed at ${val}/" // GString
printClassInfo "This is a simple String" // String

memo = '''Several of you raised concerns about long meetings.
To discuss this, we will be holding a 3 hour meeting starting at 9AM tomorrow.''' // 3 quotes for multi-line strings
println memo

hours = 5
memo2 = """Several of you raised concerns about long meetings.
To discuss this, we will be holding a ${hours} hour meeting starting at 9AM tomorrow.""" // 3 quotes for multi-line GStrings
println memo2

str = "Its a rainy day in London"
println str

str -= "rainy " // remove portion of string
println str

for (str in 'held'..'helm') {
    print "${str}"
}
println ""
pattern = ~"(G|g)roovy"
text = 'Groovy is Hip'
if (text =~ pattern) // partial match
    println "match"
else
    println "no match"

if (text ==~ pattern) // exact match
    println "match"
else
    println "no match"

matcher = 'Groovy is groovy' =~ /(G|g)roovy/
print "Size of matcher is ${matcher.size()} "
print "with element ${matcher[0]} and ${matcher[1]}."

str = 'Groovy is groovy, really groovy'
println str
result = (str =~ /groovy/).replaceAll('hip')
println result