/**
 * Created by Tosin on 31/01/14.
 */

class Man {
    static void helpMoveThings() {
        println "Man's helping"
    }
}

class Woman {
    static void helpMoveThings() {
        println "Woman's helping"
    }
}

class Elephant {
    static void helpMoveThings() {
        println "Elephant's helping"
    }

    static void eatSugarcane() {
        println "I love sugarcanes ..."
    }
}

def takeHelp(helper) {// helper uses dynamic typing
    helper.helpMoveThings()
    if (helper.metaClass.respondsTo(helper, 'eatSugarcane')) {
        helper.eatSugarcane()
    }
}

takeHelp(new Man())
takeHelp(new Woman())
takeHelp(new Elephant())