package org.example.immutable;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImmutablePersonTest {

    @Test
    void name() {
        // Tworzymy obiekt klasy Person
        Person person = new Person("Alice", 30, new ArrayList<>(Arrays.asList("Reading", "Cycling")));

        // Zapisujemy stan przed wykonaniem kodu
        int initialAge = person.getAge();

        //Zmiana setterem nie powinna być możliwa
        person.setAge(31);

        // Sprawdzamy, czy wiek nie został zmieniony
        assertEquals(initialAge, person.getAge(), "Age has changed");
    }
    @Test
    void fieldChange() {
        // Tworzymy obiekt klasy Person
        Person person = new Person("Alice", 30, new ArrayList<>(Arrays.asList("Reading", "Cycling")));

        // Zapisujemy stan przed wykonaniem kodu
        String initialName = person.getName();

        //Zmiana pola bezpośrednio nie powinna być możliwa
        person.name = "Bob";

        // Sprawdzamy, czy imię nie zostało zmienione
        assertEquals(initialName, person.getName(), "Name has changed");
    }
    @Test
    void poleMutowalne() {
        // Tworzymy obiekt klasy Person
        Person person = new Person("Alice", 30, new ArrayList<>(Arrays.asList("Reading", "Cycling")));

        // Zapisujemy stan przed wykonaniem kodu
        List<String> initialHobbies = new ArrayList<>(person.getHobbies());

        //Zmiana pola mutowalnego nie powinna być możliwa
        person.getHobbies().add("Swimming");

        // Sprawdzamy, czy lista hobby nie została zmieniona
        assertEquals(initialHobbies, person.getHobbies(), "Hobbies list has changed");

    }
    @Test
    void Extending() {
        // Tworzymy obiekt klasy Person
        Person person = new Person("Alice", 30, new ArrayList<>(Arrays.asList("Reading", "Cycling")));

        // Zapisujemy stan przed wykonaniem kodu
        List<String> initialHobbies = new ArrayList<>(person.getHobbies());

        //Zmiana pola poprzez nadpisanie w klasie rozszerzającej nie powinna być możliwa
        Person extendedPerson = new ExtendedPerson(person);
        extendedPerson.getHobbies().add("Swimming");

        // Sprawdzamy, czy lista hobby nie została zmieniona
        assertEquals(initialHobbies, person.getHobbies(), "Hobbies list has changed");

    }
}
