package org.example.immutable;

import java.util.List;

public class ExtendedPerson extends Person {

    public ExtendedPerson(String name, int age, List<String> hobbies) {
        super(name, age, hobbies);
        this.hobbies = hobbies;
    }

    public ExtendedPerson(Person person) {
        super(person.getName(), person.getAge(), person.getHobbies());
        this.name = person.getName();
        this.age = person.getAge();
        this.hobbies = person.getHobbies();
    }

    @Override
    public List<String> getHobbies() {
        return this.hobbies;
    }
}
