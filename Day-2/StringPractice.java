import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string1=sc.next();
        String string2=sc.next();
        String string3=string1.concat(string2);
        System.out.println("Merging two strings: "+string3);
        System.out.println("---------------------------------");
        System.out.println("Length of a String: "+string3.length());
        System.out.println("---------------------------------");

        String string4="string program practice";
        String[] words=string4.split("\\s");
        for(String w:words){
            System.out.println(w);
        }
        System.out.println("---------------------------------");

        char[] array = string4.toCharArray();
        System.out.println("String reverse : ");
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i]);
        System.out.println();
        System.out.println("---------------------------------");

        System.out.println(" String Compare: "+string1.equals(string2));
        System.out.println("---------------------------------");
    }
    }
