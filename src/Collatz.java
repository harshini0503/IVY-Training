import java.util.*;
public class Collatz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print(num+" ");
        while(num>1)
        {
            if(num%2==0){
                System.out.print(num/2+" ");
                num=num/2;
            }
            else{
                System.out.print((3*num+1)+" ");
                num=3*num+1;
            }
        }
    }
}
