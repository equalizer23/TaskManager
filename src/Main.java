import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Enter your height:");
        int height = scanner.nextInt();

        Student student = new Student(name, age, height);
        System.out.println("Name - " + student.getName());
        System.out.println("Age - " + student.getAge());
        System.out.println("Height - " + student.getHeight());

    }
}



