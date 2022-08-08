
    import java.util.*;
    public class LabTask {

        public static void main(String[] args) {
            int x,y,z,num;
            Scanner sc=new Scanner(System.in);
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            num=sc.nextInt();
            int d1=x-num;
            int d2=y-num;
            int d3=z-num;
            if(d1<=0 && d2<=0 && d3<=0)
                System.out.println("Cannot be allocated");
            else if(d1<=d2 && d1>=d3)
                System.out.println("Lab 1 can be used");
            else if(d2<=d1 && d2<=d3)
                System.out.println("Lab 2 can be used");
            else
                System.out.println("Lab 3 can be used");


        }

    }


