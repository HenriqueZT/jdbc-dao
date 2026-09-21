package io.github.henriquezt;

import Model.entities.Department;

public class Main {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        IO.println(obj);
    }
}
