package _03_array_java.bai_tap_anhTrung;

import java.util.Scanner;


public class StudentManagement {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("----------Chương trình quản lý sinh viên----------");
        Student[] students = new Student[50];
        while (true) {
            System.out.println("Menu chương trình");
            System.out.println("1. Xem danh sách sinh viên");
            System.out.println("2. Xoá sinh viên");
            System.out.println("3. Chỉnh sửa thông tin sinh viên");
            System.out.println("4. Thêm mới sinh viên");
            System.out.println("5. Thoát chương trình");
            System.out.print("Chọn chức năng muốn sử dụng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayStudent(students);
                    break;
                case 2:
                    deleteStudent(students);
                    break;
                case 3:
                    System.out.println("Nhập tên sinh viên muốn sửa: ");
//                    String editStudent = scanner.nextLine();
//                    for (int i =0;i<students.length;i++){
//                        if (students[i].equals(editStudent)){
//                            students[i]=scanner.nextLine();
//                        }
//                    }
                    break;
                case 4:
                    createNewStudent(students);
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Cho người dùng nhập lại nếu nhầm");
            }
        }
    }

    private static void displayStudent(Student[] students) {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    private static void deleteStudent(Student[] students) {
        String deleteStudent = inputOutput("Nhập tên sinh viên muốn xoá");
        for (int i = 0; i < students.length; i++) {
            if (deleteStudent.equals(students[i])) {
                students[i] = null;
            }
        }
    }

    private static void createNewStudent(Student[] students) {
        System.out.println("Mời bạn nhập id sinh viên mới: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên sinh viên mới: ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập tuổi sinh viên mới:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập địa chỉ sinh viên mới: ");
        String address = scanner.nextLine();
        Student newStudent = new Student(id, name,age,address);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = newStudent;
                break;
            }
        }
    }

    private static String inputOutput(String message) {
        System.out.println(message);
        String output = scanner.nextLine();
        return output;
    }

}