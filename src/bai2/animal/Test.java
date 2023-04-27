package animal;

import edible.Edible;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;


public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Edible) {
                Edible edible = (Edible) animal;
                System.out.println(edible.howToEat());
            }
        }

//        Tiếp theo, ta định nghĩa interface Edible với một phương thức trừu tượng howToEat() trả về một chuỗi.

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
//        Cuối cùng, trong phần mã kiểm thử, ta tạo một mảng Fruit[] và gán một đối tượng Orange và một đối tượng Apple cho hai phần tử trong mảng. Ta duyệt qua từng phần tử trong mảng Fruit[] và gọi phương thức howToEat() của từng đối tượng.
    }
}