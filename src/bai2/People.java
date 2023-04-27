package bai2;

interface Student {
    void registerCourse(String course);

    void attendClass();
}

abstract class People {
    private String name;
    private int age;
    private boolean gender;

    public People(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getGender() {
        return gender;
    }

    public abstract void eat();

    public abstract void sleep();
}

class StudentImpl extends People implements Student {

    public StudentImpl(String name, int age, boolean gender) {
        super(name, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Student is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Student is sleeping.");
    }

    @Override
    public void registerCourse(String course) {
        System.out.println("Student is registering course: " + course);
    }

    @Override
    public void attendClass() {
        System.out.println("Student is attending class.");
    }

    @Override
    public String toString() {
        return "Student{name='" + getName() + "', age=" + getAge() + ", gender=" + getGender() + "}";
    }
}

class bai2 {

    public static void main(String[] args) {
        StudentImpl student = new StudentImpl("Tuan Anh", 25, true);
        StudentImpl student1 = new StudentImpl("hhhi", 25, true);

        student.eat();
        student.sleep();
        student.registerCourse("Programming Node JS");
        student.attendClass();

        System.out.println(student);
        System.out.println(student1);
    }
}