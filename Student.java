
// Write a java program to define a class student with data members like name, rollno, age, gender, sub1, 
// and sub2. Defines appropriate methods to initialize and displays the values of data members also 
// calculates total marks, percentage and grade by the ‘n’ number of students. 
// Note: get the values at run time with corresponding objects. Write the sample output with all the 
// // operations. 
import java.util.Scanner;

public class Student {
    private String name;
    private int rollno;
    private int age;
    private char gender;
    private int sub1;
    private int sub2;

    public Student(String name, int rollno, int age, char gender, int sub1, int sub2) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
        this.gender = gender;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }

    public int getTotalMarks() {
        return sub1 + sub2;
    }

    public float getPercentage() {
        return ((float) getTotalMarks() / 200.0f) * 100.0f;
    }

    public String getGrade() {
        float percentage = getPercentage();
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B+";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C+";
        } else if (percentage >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int n = scanner.nextInt();

            Student[] students = new Student[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for student " + (i + 1) + ":");
                System.out.print("Name: ");
                String name = scanner.next();
                System.out.print("Roll No: ");
                int rollno = scanner.nextInt();
                System.out.print("Age: ");
                int age = scanner.nextInt();
                System.out.print("Gender (M/F): ");
                char gender = scanner.next().charAt(0);
                System.out.print("Subject 1 Marks: ");
                int sub1 = scanner.nextInt();
                System.out.print("Subject 2 Marks: ");
                int sub2 = scanner.nextInt();

                students[i] = new Student(name, rollno, age, gender, sub1, sub2);
                System.out.println();
            }

            for (int i = 0; i < n; i++) {
                System.out.println("Details of student " + (i + 1) + ":");
                students[i].displayDetails();
                System.out.println("Total Marks: " + students[i].getTotalMarks());
                System.out.println("Percentage: " + students[i].getPercentage() + "%");
                System.out.println("Grade: " + students[i].getGrade());
                System.out.println();
            }
        }
    }
}
