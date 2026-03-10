def username = null
def name = username ?: "Guest"

class Address {
    String city
}

class User {
    Address address
}

def user = new User()

def city = user?.address?.city ?: "Unknown"

def books = [
    [title: "Book A"],
    [title: "Book B"]
]

def titles = books*.title

println name
println city
println titles