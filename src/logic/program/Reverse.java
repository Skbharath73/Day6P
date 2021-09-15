package logic.program;

public class Reverse {
    public static int Rev(String n){
        int i,d,r,sum=0;
        int len=n.length();
        d=Integer.parseInt(n);
        for(i=0;i<len;i++){

            r=d%10;
            sum=sum*10+r;
            d=d/10;

        }
        return sum;
    }
    public static void main(String [] args){
        System.out.println(Rev("1000"));
    }
}
