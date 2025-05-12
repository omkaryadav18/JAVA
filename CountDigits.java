import java.util.*;
public class CountDigits {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scn.nextInt();

        int count=0;
        do{
            n = n/10;
            count++;
        }
        while(n!=0);
        System.out.println(count);
        scn.close();
    }
}
