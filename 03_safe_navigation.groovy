class User {
    String name
    Address address
}

class Address {
    String city
}

def user = new User(name: "John")

println user?.address?.city