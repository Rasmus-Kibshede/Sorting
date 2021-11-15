public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    /*public int compareTo(Sammenlignbar person) {
        Person otherPerson = (Person) person;
        return this.firstName.compareTo(otherPerson.firstName);
    }*/

    @Override
    public int compareTo(Person o) {
        return firstName.compareTo(o.firstName);
    }
}
