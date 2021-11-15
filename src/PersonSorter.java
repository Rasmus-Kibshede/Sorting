import java.util.Arrays;

public class PersonSorter {
    public static void main(String[] args) {
        PersonSorter app = new PersonSorter();
        app.start();
    }

    private void start() {
        Person[] arr = new Person[3];

        arr[0] = new Person("Harry", "Potter");
        arr[1] = new Person("Ron", "Weasly");
        arr[2] = new Person("Hermione", "Granger");

        System.out.println("Før sotering" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Efter sotering" + Arrays.toString(arr));
    }
}
