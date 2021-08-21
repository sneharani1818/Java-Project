package practice;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here

        //ask how many new students will be added
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER HOW MANY NEW STUDENTS WILL BE ENROLLED");
        int numOfStudents=sc.nextInt();
        //create n number of new students
        student [] s=new student[numOfStudents];
        for(int i=0;i<numOfStudents;i++)
        {
            s[i]=new student();
            s[i].enroll();
            s[i].payFees();
            s[i].showInfo();
            System.out.println(s[i].toString());
        }

    }
}
