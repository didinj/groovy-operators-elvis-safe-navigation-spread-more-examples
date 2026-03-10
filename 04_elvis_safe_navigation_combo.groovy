class Address {
    String city
}

class User {
    Address address
}

def user = new User(address: null)

def city = user?.address?.city ?: "Unknown City"

println city