package animal;


import edible.Edible;

public class Cat extends Animal implements Edible {
    public String makeSound() {
        return "Cat: meow meow!";
    }


    public String howToEat() {
        return "mouth";
    }
}





