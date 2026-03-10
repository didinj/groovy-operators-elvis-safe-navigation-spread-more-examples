class Person {
    public String name

    String getName() {
        return "Getter: " + name
    }
}

def p = new Person(name: "Groovy")

println p.@name