package taskexamples;

import java.util.Scanner;

public class GitHub {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER:");
        int number=sc.nextInt();
        for(int i=2;i<=number;i++){
            boolean isPrime=true;
            for(int j=2;j<number/2;j++){
                if(i%j==0 && i!=j){
                    isPrime=false;
                    break;
                }
                }
            if (isPrime) {
                System.out.print(i+", ");


            }
        }
    }
}
