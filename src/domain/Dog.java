package domain;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, int weight, String breed) {
        this.name = name;
        this.weight = weight;
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(name + " їсть корм.");
    }

    @Override
    public void speak() {
        System.out.println(name + " гавкає: Гав-гав!");
    }

    public void move() {
        System.out.println(name + " швидко біжить.");
    }

    public void play() {
        System.out.println(name + " грається з м'ячем.");
    }

    public void guardHouse() {
        System.out.println(name + " охороняє будинок.");
    }

    public void showBreed() {
        System.out.println("Порода: " + breed);
    }

    @Override
    public String toString() {
        return super.toString() + "\nBreed:\t" + breed;
    }
}
