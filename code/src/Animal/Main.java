package Animal;

abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The dog " + name + " barks.");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The cat " + name + " meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bruno", 1);
        Cat cat = new Cat("Bella", 2);

        dog.makeSound();
        cat.makeSound();
    }
}
