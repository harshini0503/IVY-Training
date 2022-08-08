import java.util.Scanner;
public class MangoTree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int tree_num=sc.nextInt();
        if  ((tree_num-1)%col==0 || tree_num<=col || (row-1)*col<tree_num){
            System.out.println("Yes, It is a Mango Tree");
        }
        else{
            System.out.println("No, It is not a Mango Tree");
        }
    }
}