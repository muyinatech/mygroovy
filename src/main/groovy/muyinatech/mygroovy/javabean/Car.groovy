package muyinatech.mygroovy.javabean

import groovy.transform.Canonical

@Canonical(excludes = "year") // specifies to include all the fields in toString()
class Car {
    def miles = 0
    final year

    Car(theYear) {year = theYear}

    static void main(args) {
        Car car = new Car(2008)
        println "Year: $car.year"
        println "Miles: $car.miles"
        println "Setting miles"
        car.miles = 25
        println "Miles: $car.miles"
        println car
    }
}
