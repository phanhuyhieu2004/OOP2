package bai6;



import java.util.Scanner;

public class ClassName{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên lớp học: ");
        String className = scanner.nextLine();
        if (isValidClassName(className)) {
            System.out.println("Tên lớp hợp lệ.");
        } else {
            System.out.println("Tên lớp không hợp lệ.");
        }
    }

    public static boolean isValidClassName(String className) {
        String regex = "^[CAP]{1}[0-9]{4}[GHIKV]{1}$";
        return className.matches(regex);
    }
}

