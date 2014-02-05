import static java.lang.Math.random as rand // alias for static method import
import groovy.lang.ExpandoMetaClass as EMC
// safe navigation operator(?)
def reverseString(str){
    //if (str != null) {str.reverse()}
    str?.reverse() // ? returns a null instead of a nullpointer exception if str = null
}

println reverseString('evil')
println reverseString(null)

def  splitName(fullName) { fullName.split(' ')}
def (firstName, lastName) = splitName("James Bond") // return the result into two variables
println "$lastName, $firstName $lastName"

/*
implicit boolean checks
 */
str = "hello"
if (str) {println "exists"} // line not printed if str = null

lst0 = null
println lst0 ? 'lst0 true' : 'lst0 false'
lst1 = [1,2,3]
println lst1 ? 'lst1 true' : 'lst1 false'

/*
Using import aliases
 */
double value = rand()
println value

def metaClass = new EMC(Integer)
println metaClass.getClass().name

/*
Delegate annotation
 */
class Worker {
    def work() {println 'getting work done'}
    def anaylze() {println 'analyze...'}
}

class Manager {
    @Delegate Worker worker = new Worker(); // delegate to the methods of the worker object
}

def bernie = new Manager()
bernie.anaylze()
bernie.work()

/*
Define a im
 */