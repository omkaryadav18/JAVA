import java.util.*;
public class Fibonacci {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n1=0, n2=1;
        System.out.print("Enter number: ");
        int n = scn.nextInt();

        for(int i=0; i<n; i++){
            System.out.println(n1);
            int temp=n1+n2;
            n1=n2;
            n2=temp;
        }
        scn.close();
    }
}
