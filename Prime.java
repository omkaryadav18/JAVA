import java.util.*;
public class Prime {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int t = scn.nextInt();

        for(int i=1; i<=t; i++){
            System.out.print("\nEnter "+i+ " value: ");
            int n = scn.nextInt();

            int count=0;
            for(int j=2; j*j<=n; j++){
                if(n%j == 0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(n+ " is a Prime number");
            }
            else{
                System.out.println(n+ " is not a Prime number");
            }
        }
        scn.close();
    }
}
