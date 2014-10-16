import groovy.transform.Immutable

@Immutable
class ImmutableClass {
    String name
    int age

    static void main(args) {
        println new ImmutableClass("Fred", 11)
    }
}

