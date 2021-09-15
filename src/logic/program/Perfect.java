package logic.program;

public class Perfect {
    public static int Perf(int num){
        int i,sum=0;
        for(i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num) {
            System.out.println("The perfect number");
        }
        else
            System.out.println("not Perfect number");
        return 1;
    }
    public static void main(String [] args){
        int res=Perf(16);

    }
}
