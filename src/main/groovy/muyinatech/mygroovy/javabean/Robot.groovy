package muyinatech.mygroovy.javabean

/**
 * Created by Tosin on 31/01/14.
 */
class Robot {
    def type, height, width
    def static access(Map location, weight, fragile, other="n/a") {// other arg is optional
        println "Received fragile? $fragile, weight: $weight, loc: $location, other: $other"
    }

    def static task (name, String[] details) {// details arg is optional array of parameters
        println "$name - $details"
    }
    static void main(args) {
        def robot = new Robot(type: 'arm', width: 10, height: 40)
        println "$robot.type, $robot.height, $robot.width"

        access(x:30, y:20, z:10, 50, true) // name value pairs picked up as a map of entries
        access(x:50, y:70, z:30, 20, true, "super")

        task 'Call', '123-456-7890'
        task 'Call', '123-456-7890', '231-546-0987'
        task 'Check Mail'
    }
}
