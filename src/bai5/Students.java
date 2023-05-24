package bai5;

import java.io.*;

public  class Students implements Serializable {
        private String studentID;
        private String studentName;
        private int age;
        private String className;

        public Students() {
        }

        public Students(String studentID, String studentName, int age, String className) {
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

    //
    class StudentProcess {
        public static boolean writeStudent(Students[] objStudent, String fileName) {
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

        // phương thức để đọc đối tượng sinh viên từ file
        public static Students[] readStudent(String fileName) throws IOException, ClassNotFoundException {
            // tạo đối tượng ObjectInputStream để đọc đối tượng từ file
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
            // đọc đối tượng mảng sinh viên từ file
            Students[] listStudent = (Students[]) objectInputStream.readObject();
            // in ra thông tin của từng sinh viên trongmảng
            for (Students e : listStudent) {
                System.out.println(e.toString());
            }
            // đóng ObjectInputStream
            objectInputStream.close();
            // trả về mảng đối tượng sinh viên
            return listStudent;
        }
    }


class StudentApps {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Students[] student = new Students[5];
        student[0]=new Students("1","Phan ",18,"IBSL1D2");
        student[1]=new Students("2","Puuun ",18,"IBSL1D2");
        student[2]=new Students("3","Pkkyhan ",18,"IBSL1D2");
        student[3]=new Students("4","Phkkn ",18,"IBSL1D2");
        student[4]=new Students("5","Phkkn ",18,"IBSL1D2");
        StudentProcess.writeStudent(student,"student.dat");
        StudentProcess.readStudent("student.dat");


    }
    }


