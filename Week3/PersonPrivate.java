public class PersonPrivate {
    private String firstName;
    private String lastName;
    private int age;

    public PersonPrivate() {
        firstName = "John";
        lastName = "Smith";
        age = 15;
    }

    public PersonPrivate(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString() {
        return "name " + firstName + " " + lastName + " age: " + age;
    }
};