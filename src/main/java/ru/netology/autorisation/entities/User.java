package ru.netology.autorisation.entities;

import java.util.Objects;

public class User {
    private final String name;
    private final String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        System.out.println("User created");
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }


    @Override
    public String toString() {
        return "User: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }
}
