package bai1;
//Mục đích chung của bài này là thiết kế các lớp đối tượng trong Java, bao gồm lớp cha People và hai lớp con là Student và Employee, theo mô tả yêu cầu trong đề bài.
//
//        Lớp People là lớp cha, định nghĩa các thuộc tính và phương thức chung cho tất cả các đối tượng People và các lớp con của nó. Lớp này có các thuộc tính là name (tên), gender (giới tính) và age (tuổi), cùng với các phương thức getter và setter để truy cập và cập nhật các giá trị này. Ngoài ra, lớp People cũng có hai phương thức khởi tạo, một trong số đó không cần đối số đầu vào mà sử dụng giá trị mặc định, và phương thức toString để trả về thông tin của đối tượng dưới dạng chuỗi.
//
//        Lớp Student và lớp Employee là hai lớp con của lớp People, được kế thừa các thuộc tính và phương thức của lớp cha. Lớp Student có thêm thuộc tính className (tên lớp học), phương thức study để thể hiện hành động học tập, và các phương thức khởi tạo và toString tương tự như trong lớp People. Lớp Employee có thêm thuộc tính enterprise (tên công ty), phương thức work để thể hiện hành động làm việc, và các phương thức khởi tạo và toString tương tự như trong lớp People.
//
//        Các lớp này cho phép mô hình hóa các đối tượng People, Student và Employee trong Java, và cung cấp các phương thức và thuộc tính để thực hiện các hành động và truy xuất thông tin của các đối tượng này
public class People {
    private String name;
    private boolean gender;
    private int age;

    public People() {
        this.name = "Tên mặc định";
        this.gender = false;
        this.age = 0;
    }

    public People(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("Mọi người cùng ăn...");
    }

    public void sleep() {
        System.out.println("Ngủ thôi...");
    }

    public String toString() {
        return "Một người có tên:" + getName() + ", age: " + getAge() + " and gender: " + (isGender() ? "Nam" : "Nữ");
    }
}
//    Lớp People là một lớp đơn giản đại diện cho một người, bao gồm các thuộc tính name (tên), gender (giới tính) và age (tuổi), cùng với các phương thức getter và setter tương ứng. Nó cũng có hai phương thức eat và sleep để đại diện cho hoạt động ăn và ngủ của một người. Phương thức toString được định nghĩa để trả về một chuỗi miêu tả đầy đủ thông tin của một người.

    class PeopleTest {
        public static void main(String[] args) {
            People people = new People();
            System.out.println(people);
            people = new People("Nguyen Thi C", false, 18);
            people.setAge(20);
            System.out.println(people);

        }
    }
//        Lớp PeopleTest chứa phương thức main để kiểm tra lớp People. Nó tạo một đối tượng People mới với giá trị mặc định, in ra thông tin của đối tượng đó bằng cách gọi phương thức toString, sau đó tạo một đối tượng People mới với các giá trị được chỉ định cho tên, giới tính và tuổi, sau đó gọi phương thức setAge để thay đổi tuổi và in ra thông tin của đối tượng đó.

   class Student extends People {
        private String className;

        public Student() {
            super();
            this.className = "D101_C1K14";
        }

        public Student(String className) {
            super();
            this.className = className;
        }
        public Student(String name,boolean gender,int age,String className) {
            super(name, gender, age);
            this.className=className;
        }

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public void study() {
            System.out.println("Học code..");
        }

        public String toString() {
            return "Một người có tên:" + getClassName() + "đó là lớp con của " + super.toString();
        }

    }
//       Lớp Student là một lớp con của People và bổ sung thêm thuộc tính className (tên lớp) và phương thức study (học tập). Nó định nghĩa lại phương thức toString để trả về một chuỗi miêu tả đầy đủ thông tin của một sinh viên, bao gồm tên lớp và các thông tin của lớp cha People.

 class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);

        student = new Student("D101_C2K14");
        System.out.println(student);

        student = new Student("Ta Van A", false, 23, "IBSK1D1");
        System.out.println(student);
    }

}
//     Lớp StudentTest chứa phương thức main để kiểm tra lớp Student. Nó tạo một đối tượng Student mới với giá trị mặc định, in ra thông tin của đối tượng đó bằng cách gọi phương thức toString, sau đó tạo một đối tượng Student mới với tên lớp được chỉ định và in ra thông tin của đối tượng đó. Cuối cùng, nó tạo một đối tượng Student mới với các giá trị được chỉ định cho tên, giới tính, tuổi và tên lớp, và in ra thông tin của đối tượng đó.
class  Employee extends People{
    private String enterprise;
    public Employee(){
        super();
        this.enterprise="CodeGym";
    }
    public Employee(String enterprise){
        super();
        this.enterprise=enterprise;
    }
    public Employee(String name, boolean gender, int age, String enterprise) {
        super(name, gender, age);
        this.enterprise = enterprise;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }
    public void work(){
        System.out.println("Làm,.....");
    }
    public String toString(){
        return "1 nhân viên làm việc"+getEnterprise()+"đó là lớp con của"+super.toString();

    }


    public int getAge() {
        return super.getAge();
    }
}class EmployeeTest{
//    Lớp Employee là một lớp con khác của People và bổ sung thêm thuộc tính enterprise (công ty) và phương thức work (làm việc). Nó định nghĩa lại phương thức toString để trả về một chuỗi miêu tả đầy đủ thông tin của một nhân viên, bao gồm tên công ty và các thông tin của lớp cha People.
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);

        employee = new Employee("Nguyen Thi A", true, 21, "FPT");
        System.out.println(employee);

        employee.work();
        employee.setEnterprise("Viettel");
        System.out.println(employee);
    }
//    Lớp EmployeeTest chứa phương thức main để kiểm tra lớp Employee. Nó tạo một đối tượng Employee mới với giá trị mặc định, in ra thông tin của đối tượng đó bằng cách gọi phương thức toString, sau đó tạo một đối tượng Employee mới với các giá trị được chỉ định cho tên, giới tính, tuổi và tên công ty, và in ra thông tin của đối tượng đó. Cuối cùng, nó gọi phương thức work và thay đổi tên công ty của đối tượng Employee và in ra thông tin của đối tượng đó.
}






