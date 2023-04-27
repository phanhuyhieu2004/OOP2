package bai1;

public class Animal {
    private double weight; // Khai báo thuộc tính weight là trọng lượng
    private double height; // Khai báo thuộc tính height là chiều cao

    public Animal() { // Hàm tạo không đối số của lớp Animal
        super(); // Gọi hàm tạo của lớp cha (Object)
        this.weight = 0.0; // Khởi tạo giá trị của weight là 0.0
        this.height = 0.0; // Khởi tạo giá trị của height là 0.0
    }

    public Animal(double weight, double height) { // Hàm tạo của lớp Animal với hai đối số weight và height
        super(); // Gọi hàm tạo của lớp cha (Object)
        this.weight = weight; // Thiết lập giá trị của weight bằng đối số đầu vào
        this.height = height; // Thiết lập giá trị của height bằng đối số đầu vào
    }

    public double getWeight() { // Phương thức lấy giá trị trọng lượng
        return weight;
    }

    public double getHeight() { // Phương thức lấy giá trị chiều cao
        return height;
    }

    public void setWeight(double weight) { // Phương thức thiết lập giá trị trọng lượng
        this.weight = weight;
    }

    public void setHeight(double height) { // Phương thức thiết lập giá trị chiều cao
        this.height = height;
    }

    public String toString() { // Phương thức trả về thông tin đối tượng dưới dạng chuỗi
        return "Động vật có trọng lượng là :"
                + getWeight()
                + ", và chiều cao là :"
                + getHeight();
    }
}

class AnimalTest { // Lớp kiểm tra lớp Animal
    public static void main(String[] args) { // Phương thức chính của lớp AnimalTest
        Animal animal1 = new Animal(); // Tạo đối tượng animal1 từ lớp Animal không đối số
        System.out.println(animal1); // In thông tin của animal1

        animal1 = new Animal(5, 6); // Tạo đối tượng animal1 từ lớp Animal với trọng lượng và chiều cao được chỉ định
        System.out.println(animal1); // In thông tin của animal1

        Animal animal2 = new Animal(); // Tạo đối tượng animal2 từ lớp Animal không đối số
        animal2.setWeight(1); // Thiết lập giá trị trọng lượng cho animal2
        animal2.setHeight(2); // Thiết lập giá trị chiều cao cho animal2
        System.out.println(animal2); // In thông tin của animal2
    }
}

class Cat extends Animal { // Lớp Cat kế thừa từ lớp Animal
    private double age; // Khai báo thuộc tính age là tuổi

    public Cat() { // Hàm tạo không đối số của lớp Cat
        super(); // Gọi hàm tạo của lớp cha (Animal)
        this.age = 1.0; // Khởi tạo giá trị của age là 1.0
    }

    public Cat(double age) { // Hàm tạo của lớp Cat với đối số là age
        super(); // Gọi hàm tạo của lớp cha (Animal)
        this.age = age; // Thiết lập giá trị của age bằng đối số đầu vào
    }

    public Cat(double weight, double height, double age) { // Hàm tạo của lớp Cat với ba đối số weight, height và age
        super(weight, height); // Gọi hàm tạo của lớp cha (Animal) với hai đối số weight và height
        this.age = age; // Thiết lập giá trị của age bằng đối số đầu vào
    }

    public double getAge() { // Phương thức lấy giá trị tuổi
        return age;
    }

    public void setAge(double age) { // Phương thức thiết lập giá trị tuổi
        this.age = age;
    }

    public String sound() { // Phương thức trả về tiếng kêu của mèo
        return "Meo meo";
    }

    public String eat() { // Phương thức trả về hành động ăn của mèo
        return "Meo meo";
    }

    public String toString() { // Phương thức trả về thông tin đối tượng dưới dạng chuỗi
        return "Một con mèo có tuổi "
                + getAge()
                + ", là lớp con của "
                + super.toString();
    }
}

class CatTest { // Lớp kiểm tra lớp Cat
    public static void main(String[] args) { // Phương thức chính của lớp CatTest
        Cat cat = new Cat(); // Tạo đối tượng cat từ lớp Cat không đối số
        System.out.println(cat); // In thông tin của cat

        cat = new Cat(3.5); // Tạo đối tượng cat từ lớp Cat với tuổi được chỉ định
        System.out.println(cat); // In thông tin của cat

        cat = new Cat(3.5, 5, 10); // Tạo đối tượng cat từ lớp Cat với trọng lượng, chiều cao và tuổi được chỉ định
        System.out.println(cat); // In thông tin của cat
    }
}