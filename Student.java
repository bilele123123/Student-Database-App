import java.util.Scanner;

public class Student {    
    private String ID;
    private int idCounter = 0;
    private String[] contactInformation;
    private String[] enrolledCourses;
    private boolean tuitionStatus;
    private double tuitionDebt;
    private int coursePrice = 600;
    private String studentFirstName;
    private String studentLastName;
    private String gradeYear;

    //Enroll new student, gather first and last name, contact information, grade year, and contact information.
    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.studentFirstName = sc.nextLine();

        System.out.print("Enter student last name: ");
        this.studentLastName = sc.nextLine();

    }
    //Generate unique student id

    //Enroll student in courses

    //View tuition status ie. check if there is outstanding tuition balance and how much tuition debt the student is in.

    //Show student status, contact information, enrolled courses, tuition status, outstanding balance, ID and enrolled courses.
}

