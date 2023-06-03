import java.util.Scanner;

public class Student {    
    private String ID;
    private static int idCounter = 0;
    private String contactInformation;
    private String[] enrolledCourses;
    private boolean tuitionStatus;
    private double tuitionDebt;
    public String studentFirstName;
    public String studentLastName;
    public String gradeYear;

    //Enroll new student, gather first and last name, contact information, grade year, and contact information.
    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.studentFirstName = sc.nextLine();

        System.out.print("Enter student last name: ");
        this.studentLastName = sc.nextLine();

        System.out.print("Enter grade year: Freshman Sophomore Junior Senior\n");
        this.gradeYear = sc.nextLine();

        System.out.print("Enter your phone number: (999)-999-");
        this.contactInformation = sc.nextLine();

        
        ID = this.generateID(studentFirstName, studentLastName, gradeYear);
        System.out.println(ID);

    }
    //Generate unique student id
    private static String generateID(String studentFirstName, String studentLastName, String gradeYear) {
        String firstNameAbbreviation = studentFirstName.substring(0, 1).toUpperCase();
        String lastNameAbbreviation = studentLastName.substring(0, 1).toUpperCase();
        String gradeLevel = gradeYear.substring(0, 1).toUpperCase();
        int uniqueNumber = idCounterNumber();
        return firstNameAbbreviation + lastNameAbbreviation + gradeLevel + uniqueNumber;
    }

    private static int idCounterNumber() {
        int counter = idCounter;
        idCounter++;
        return counter;
    }

    //Enroll student in courses
    public void enrollCourse() {
        Enroll newEnroll = new Enroll();
        this.enrolledCourses = newEnroll.enrollCourses();
    }

    class Enroll {
        private int coursePrice = 600;

        public String[] enrollCourses() {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nWelcome to Java University! Would you like to enroll into your courses: YES NO");
            String enrollment = sc.nextLine();
    
            if (enrollment.toLowerCase().equals("yes"))
            {
                System.out.print("Enter the number of courses you would like to enroll: ");
                int numberOfCourses = sc.nextInt();   
                sc.nextLine();
    
                String[] enrolledCourses = new String[numberOfCourses];
    
                System.out.println("Enter the course you would like to enroll: PHYS180 BIO120");
                for (int i = 0; i < numberOfCourses; i++)
                {
                    enrolledCourses[i] = sc.nextLine();
                }
                System.out.println("\nYou've successfully enrolled in " + enrolledCourses.length + " courses.");
                return enrolledCourses;    
            }
            else
            {
                return new String[0];
            }
        }
        
    }

    //View tuition status ie. check if there is outstanding tuition balance and how much tuition debt the student is in.

    //Show student status, contact information, enrolled courses, tuition status, outstanding balance, ID and enrolled courses.
}

