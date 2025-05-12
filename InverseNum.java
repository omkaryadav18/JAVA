import java.util.*;
public class InverseNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int inv = 0;
        int oriPos = 1;
        while(n!=0){
            int oriDig = n%10;
            int invDig = oriPos;
            int invPos = oriDig;

            //make change to inv using invPos and invDig
            inv = inv + invDig * (int)Math.pow(10, invPos - 1);

            n = n/10;
            oriPos++;
        }
        System.out.println(inv);
        sc.close();
        
    }
}
