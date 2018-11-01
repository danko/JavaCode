public class PersonPublic {

    public String firstName;
    public String lastName;
    public int age;

    public static void main(String[] args) {
        PersonPublic p = new PersonPublic();
        p.firstName = "John";
        p.lastName = "Smith";
        p.age = 15;

        System.out.println("name " + p.firstName + " " + p.lastName + " age: " + p.age);
    }
};