package org.example;

abstract class Parent {
    private String name;

    static {
        System.out.println("Parent:static 1");
    }

    {
        System.out.println("Parent:instance 1");
    }

    static {
        System.out.println("Parent:static 2");
    }

    public Parent() {
        System.out.println("Parent:constructor");
    }

    {
        System.out.println("Parent:instance 2");
    }

    public Parent(String name) {
        this.name = name;
        System.out.println("Parent:name-constructor");
    }
}

class Child extends Parent {

    static {
        System.out.println("Child:static 1");
    }

    {
        System.out.println("Child:instance 1");
    }

    static {
        System.out.println("Child:static 2");
    }

    public Child() {
        System.out.println("Child:constructor");
    }

    {
        System.out.println("Child:instance 2");
    }

    public Child(String name) {
        super(name);
        System.out.println("Child:name-constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Создаем первый объект Child():");
        Child child1 = new Child();

        System.out.println("\nСоздаем второй объект Child(\"Ivan\"):");
        Child child2 = new Child("Ivan");
    }
}
