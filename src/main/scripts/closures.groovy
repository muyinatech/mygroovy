def pickEven(n, block){ // higher order function, a functions that takes functions as arguments or returns a function as a result
    for(int i=2;  i<=n; i +=2) {
        block(i) // block holds a reference to the closure
    }
}

pickEven(10, {println it}) // it default name for a single parameter passed to a closure
pickEven(10, {evenNumber -> println evenNumber}) // specify name for closure variable
total =1
pickEven(10) {total += it}
product=1
pickEven(10) {product *= it}

def tellFortune(closure){
    closure new Date("09/20/2012"), "Your day is filled with ceremony"
}

tellFortune() {date, fortune ->
    println "Fortune for ${date} is ${fortune}"
}

// Curried closure
def tellFortunes(closure){
    Date date = new Date("09/20/2012")
    postFortune = closure.curry(date)
    postFortune "Your day is filled with ceremony"
    postFortune "They're features, not bugs"
}

tellFortunes() {date, fortune ->
    println "Fortune for ${date} is ${fortune}"
}

def doSomething(closure){
    if (closure) { // check if closure is passed
        closure()
    } else {
        println "Using default implementation"
    }
}

doSomething() {print "Use specialized implementation"}
doSomething()

def completeOrder(amount, taxComputer) {
    tax = 0
    if (taxComputer.maximumNumberOfParameters == 2) { //check number of parameters in the closure
        tax = taxComputer(amount, 6.05)
    } else {
        tax = taxComputer(amount)
    }
    println "Sales tax is ${tax}"
}

completeOrder(100) {it * 0.0825} // closure is last argument can be attached to the method call
completeOrder(100) {amount, rate -> amount * (rate/100)}

def examine(closure) {
    println "$closure.maximumNumberOfParameters parameter(s) given:"
    for (aParameter in closure.parameterTypes) {println aParameter.name}
    println "--"
}

examine() {} // even when no parameters passes, it takes one parameter by default (whose name defaults to it)
examine() {it}
examine() {->}
examine() {val1 ->}
examine() {Date val1 ->}
examine() {Date val1, val2 ->}
examine() {Date val1, String val2 ->}
