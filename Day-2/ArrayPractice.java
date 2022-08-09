import java.util.*;
public class ArrayPractice {
    public static void main(String[] args) {
        int size=10;
        int marksarray[]=new int[10];

        Scanner sc=new Scanner(System.in);
        int marks=0;
        for(int i=0;i<10;i++){
            marks=sc.nextInt();
            marksarray[i]=marks;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int top=0,least=0;
        for(int i=0;i<10;i++){
            if(marksarray[i]>max){
                max=marksarray[i];
                top=i;
            }
            if(marksarray[i]<min){
                min=marksarray[i];
                least=i;
            }
        }
        System.out.println("minimum marks in the array is "+min);
        System.out.println("maximum marks in the array is "+max);
        System.out.println("minimum marks index "+least);
        System.out.println("maximum marks  index "+top);
    }
}
