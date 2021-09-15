package logic.program;

public class Fibnocci {
    public static int Fib(int n){
        int i=0,j=1,sum=0;
        System.out.print(i+" "+j);
        for(int a=1;a<=n;a++){
            sum=i+j;
            i=j;
            j=sum;

            System.out.print(" "+sum+" ");
        }
            return 1;

    }

    public static void main(String[] args) {
        int series=Fib(7);

    }
}
