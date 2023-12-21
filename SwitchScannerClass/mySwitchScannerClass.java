import java.util.Scanner;

public class mySwitchScannerClass
{
    public static void main(String[]args){
        char grade;
        System.out.print("Please enter your grade: ");
        Scanner obj = new Scanner (System.in);
        grade = obj.next().charAt(0); 
        switch (grade){
            case 'A':
                System.out.println("Excellent, you passed.");
                break;
                             
            case 'B':
                System.out.println("Very well, you passed.");
                break;
                
            case 'C':
                System.out.println("Good, you passed.");
                break;
                
            case 'D':
                System.out.println("You passed.");
                break;
                
            case 'F':
                System.out.println("You failed.");
                break;
                
            default:
                System.out.println("You entered an invalid grade.");
                
        }
        
    }
}
