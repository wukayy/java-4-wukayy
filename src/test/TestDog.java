package test;

import domain.Dog;

public class TestDog {

    public static void main(String[] args) {

        Dog dog = new Dog("Рекс", 30, "Німецька вівчарка");

        System.out.println(dog);

        dog.eat();
        dog.speak();
        dog.move();
        dog.play();
        dog.guardHouse();
        dog.showBreed();
    }
}
