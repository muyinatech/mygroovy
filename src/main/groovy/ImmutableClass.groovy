import groovy.transform.Immutable

/**
 * Created by Tosin on 31/01/14.
 */
@Immutable
class ImmutableClass {
    String name
    int age

    static void main(args) {
        println new ImmutableClass("Fred", 11)
    }
}

