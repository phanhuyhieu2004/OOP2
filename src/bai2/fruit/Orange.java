package bai2.fruit;


public class Orange extends Fruit {
    public String howToEat() {
        return "Orange could be juiced";
    }
}
//    Sau đó, ta định nghĩa lớp Apple và Orange là hai lớp con của Fruit. Lớp Apple override phương thức howToEat() để trả về chuỗi "Apple could be sliced",trong khi lớp Orange cũng override phương thức này để trả về chuỗi "Orange could be juiced".
