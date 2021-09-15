package logic.program;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        int flag=0;

        for(int j=2;j<n/2;j++) {
            if (n % j == 0) {
                System.out.println("Not Prime");
                flag = 1;
                break;
            }
        }

        if(flag==0){

            System.out.println("Prime");
        }
    }

}
