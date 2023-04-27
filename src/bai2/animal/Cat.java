package bai2.animal;


import bai2.edible.Edible;

public class Cat extends Animal implements Edible {
    public String makeSound() {
        return "Cat: meow meow!";
    }


    public String howToEat() {
        return "mouth";
    }
}





