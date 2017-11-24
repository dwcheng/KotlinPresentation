package nullsafety;

import model.Person;
import model.PersonKt;

public class JavaVersion {

    public static boolean livesInCanada(Person person) {
        if (person != null && person.getAddress() != null && person.getAddress().getCountry() != null) {
            return person.getAddress().getCountry().getName().equals("Canada");
        }

        return false;
    }

    public static void main(String[] args) {
        Person person = PersonKt.fetchPerson();
        System.out.println(livesInCanada(person));
    }
}
