package bai5;

import java.io.*;
import java.util.ArrayList;

public class Student implements Serializable {
    private String studentID;
    private String studentName;
    private int age;
    private String className;

    public Student() {
    }

    public Student(String studentID, String studentName, int age, String className) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.age = age;
        this.className = className;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                '}';
    }
}
 class StudentProcess {
    public static boolean writeStudent(Student objStudent, String fileName) {
        try {
            // Tạo đối tượng ObjectOutputStream để ghi đối tượng vào file
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName, true));
            // Ghi đối tượng vào file
            objectOutputStream.writeObject(objStudent);
            // Đóng ObjectOutputStream
            objectOutputStream.close();
            // Trả về true nếu ghi thành công
            return true;
        } catch (IOException e) {
            // Nếu có lỗi, in ra thông báo lỗi và trả về false
            System.out.println("Lỗi khi ghi đối tượng vào file: " + e.getMessage());
            return false;
        }
    }

    public static Student[] readStudent(String fileName) {
        try {
            // Tạo đối tượng ObjectInputStream để đọc đối tượng từ file
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
            // Tạo một ArrayList để lưu các đối tượng đọc được từ file
            ArrayList<Student> studentList = new ArrayList<>();
            // Đọc các đối tượng từ file cho đến khi kết thúc file
            while (true) {
                try {
                    Student student = (Student) objectInputStream.readObject();
                    studentList.add(student);
                } catch (EOFException e) {
                    // Kết thúc file, thoát khỏi vòng lặp
                    break;
                }
            }
            // Đóng ObjectInputStream
            objectInputStream.close();
            // Nếu có ít nhất một đối tượng được đọc thành công từ file, trả về mảng đối tượng
            if (studentList.size() > 0) {
                return studentList.toArray(new Student[0]);
            } else {
                // Ngược lại, trả về null
                return null;
            }
        } catch (IOException | ClassNotFoundException e) {
            // Nếu có lỗi, in ra thông báo lỗi và trả về null
            System.out.println("Lỗi khi đọc đối tượng từ file: " + e.getMessage());
            return null;
        }
    }
}
//     Lớp StudentProcess có hai phương thức để ghi và đọc đối tượng sinh viên từ file. Phương thức writeStudent ghi một đối tượng Student vào file và trả về true nếu việc ghi thành công, ngược lại trả về false. Phương thức readStudent đọc các đối tượng Student từ file và trả về một mảng đối tượng Student. Nếu mảng đối tượng là null tức là file không có dữ liệu hoặc có lỗi.
 class StudentApp {
    public static void main(String[] args) {
        // Tạo 5 đối tượng sinh viên sử dụng lớp Student
        Student student1 = new Student("SV001", "Nguyen Van A", 20, "K62CB");
        Student student2 = new Student("SV002", "Tran Thi B", 21, "K62CC");
        Student student3 = new Student("SV003", "Le Van C", 22, "K62CB");
        Student student4 = new Student("SV004", "Pham Thi D", 23, "K62CC");
        Student student5 = new Student("SV005", "Do Van E", 24, "K62CB");

        // Đặt tên file là "students.dat"
        String fileName = "students.dat";

        // Ghi lần lượt từng đối tượng sinh viên vào file
        if (StudentProcess.writeStudent(student1, fileName)) {
            System.out.println("Ghi đối tượng student1 vào file thành công");
        } else {
            System.out.println("Ghi đối tượng student1 vào file không thành công");
        }

        if (StudentProcess.writeStudent(student2, fileName)) {
            System.out.println("Ghi đối tượng student2 vào file thành công");
        } else {
            System.out.println("Ghi đối tượng student2 vào file không thành công");
        }

        if (StudentProcess.writeStudent(student3, fileName)) {
            System.out.println("Ghi đối tượng student3 vào file thành công");
        } else {
            System.out.println("Ghi đối tượng student3 vào file không thành công");
        }

        if (StudentProcess.writeStudent(student4, fileName)) {
            System.out.println("Ghi đối tượng student4 vào file thành công");
        } else {
            System.out.println("Ghi đối tượng student4 vào file không thành công");
        }

        if (StudentProcess.writeStudent(student5, fileName)) {
            System.out.println("Ghi đối tượng student5 vào file thành công");
        } else {
            System.out.println("Ghi đối tượng student5 vào file không thành công");
        }

        // Đọc các đối tượng sinh viên từ file và hiển thị ra màn hình
        Student[] students = StudentProcess.readStudent(fileName);
        if (students != null) {
            for (Student student : students) {
                System.out.println(student);
            }
        } else {
            System.out.println("Không có đối tượng nào được đọc từ file");
        }
    }
}
//    Lớp StudentApp sử dụng lớp StudentProcess để ghi lần lượt từng đối tượng sinh viên vào file và sau đó đọc các đối tượng đó từ file và hiển thị ra màn hình. Tên file được đặt là "students.dat".