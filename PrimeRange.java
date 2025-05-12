import java.util.*;
public class PrimeRange {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter low value: ");
        int low = scn.nextInt();
        System.out.print("Enter high value: ");
        int high = scn.nextInt();

        for(int i=low+1; i<high; i++){
            int count=0;
            for(int j=2; j*j<=i; j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i+" is Prime");
            }
            else{
                System.out.println(i+" is not Prime");
            }
        }
        scn.close();
    }
}
