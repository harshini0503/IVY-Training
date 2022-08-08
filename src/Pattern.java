import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char input1,input2;
        input1=sc.next().charAt(0); //charachter1
        input2=sc.next().charAt(0); //charachter2
        int num =sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print(input1 + " ");
            }
            for(int i1=num-1;i1>=i;i1--){
                System.out.print(input2+ " ");
            }
            System.out.println();
        }
    }
}