package animal;


import edible.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    public String howToEat() {
        return "could be fried";
    }
}
//    trong khi lớp Chicken cũng override phương thức này để trả về chuỗi "Chicken: cluck-cluck!". Lớp Chicken cũng implements interface Edible với phương thức howToEat() trả về chuỗi "could be fried".



