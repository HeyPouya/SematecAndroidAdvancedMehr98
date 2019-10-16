package com.sematec.sematecandroidadvancedmehr98;

import androidx.annotation.NonNull;

public class Person {
    public Person(String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }

    private String name;
    private String family;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }


    @NonNull
    @Override
    public String toString() {
        return "Name is : " + getName() + "\n" +
                "Family is : " + getFamily();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
