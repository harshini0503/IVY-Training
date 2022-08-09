import java.util.*;
import java.lang.*;

public class OperationsOnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
                int[] array = new int[length];
                for(int i=0;i<length;i++)
                    array[i]=sc.nextInt();
                float total=0;
                float mean=0;
                for(int i=0; i<length; i++)
                {
                    total = total+array[i];
                }
                mean = total/length;
                System.out.println("The mean value is: "+mean);
         System.out.println("---------------------------");
                Arrays.sort(array);
                if(length%2==0)
                    median= array[length/2];
                else
                    median=(array[(length - 1) / 2] + array[length / 2]) / 2;

                System.out.println(" The median is :" +median);
        System.out.println("---------------------------");
    }
    }
