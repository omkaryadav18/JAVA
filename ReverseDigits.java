import java.util.*;
public class ReverseDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        while(n != 0){
            int a = n % 10;
            System.out.println(a);
            n = n / 10;
        }
        sc.close();
    }
}
