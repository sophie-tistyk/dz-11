package com.people;

public class Main {
    public static void main(String[] args) {

        Woman woman = new Woman("Anna", "Martina", 25, "Smith");
        Man man = new Man("John", "Martina", 29);

        if (woman.getLastName().equals(man.getLastName())) {
            woman.deregisterPartnership(true);
        } else woman.registerPartnership(man);

    }
}