package org.example.immutable;

import java.util.ArrayList;
import java.util.List;

class Person {
    String name;
    int age;
    List<String> hobbies;

    public Person(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        //return List.copyOf(this.hobbies); // zwraca UnsupportedOperationException
        return new ArrayList<>(hobbies);
    }

    public void setAge(int age) {
        this.age = age;
    }

}
