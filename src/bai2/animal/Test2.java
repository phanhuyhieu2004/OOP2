package bai2.animal;

import bai2.edible.Edible;

public class Test2 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[1];
        animals[0] = new Cat();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Cat) {
                Edible edibler = (Cat) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }

}
