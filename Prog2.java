import java.util.*;
public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks = sc.nextInt();

        if(marks > 90){
            System.out.println("Excellent");
        }
        else if(marks>80 && marks<=90){
            System.out.println("Good");
        }
        else if(marks>70 && marks<=80){
            System.out.println("Fair");
        }
        else if(marks>60 && marks<=70){
            System.out.println("Meet Expectations");
        }
        else if(marks<=60){
            System.out.println("Below par");
        }
        sc.close();
    }
}
