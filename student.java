package practice;
import java.util.*;
public class student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses="";
    private int tutionBalance;
    private int costOfCourse=600;
    private static int id=2000;
    //constructor: prompt user to enter student's name and year

    public student()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FIRST NAME");
        firstName=sc.next();
        System.out.println("ENTER LAST NAME");
        lastName=sc.next();
        System.out.println("ENTER YEAR OF STUDENT\n 1. FISRT YEAR\n2. SECOND YEAR\n 3. THIRD YEAR");
        gradeYear=sc.nextInt();
        studentID=setId();
        //System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentID);
    }
    //generate an ID
    public int setId()
    {
        id++;
        return (this.gradeYear*10000)+id;
    }
    //enrolled in which courses
    public void enroll()
    {
        System.out.println("ENTER COURSES TO ENROLL (Q TO QUIT)");
        Scanner sc=new Scanner(System.in);
        String c="";
        while(!(c.equalsIgnoreCase("Q")))
        {
            c=sc.next();
            if(c.equalsIgnoreCase("Q"))
                break;
            courses+=c+" ";
            tutionBalance+=costOfCourse;
        }
       // System.out.println("ENROLLED IN :"+courses);
       // System.out.println("TUTION BALANCE :"+tutionBalance);
    }
    //view balance
    public void viewBalance()
    {
        System.out.println("YOUR BALANCE IS "+tutionBalance);
    }
    //pay fees
    public void payFees()
    {
        viewBalance();
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR PAYMENT");
        int payment=sc.nextInt();
        tutionBalance-=payment;
        System.out.println("THANK YOU FOR YOUR PAYMENT OF Rs."+payment);
        viewBalance();
    }
    //show status
    public void showInfo()
    {
        System.out.println("NAME: "+firstName+" "+lastName);
        System.out.println("YEAR OF STUDY: "+gradeYear);
        System.out.println("STUDENT ID: "+studentID);
        System.out.println("COURSES ENROLLED: "+courses);
        System.out.println("TUITION BALANCE: "+tutionBalance);
    }
}
