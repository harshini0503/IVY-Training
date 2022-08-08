import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hours[]=new int[7];
        int salary=0,total_hours=0;
        for(int i=0;i<7;i++){
            hours[i]=sc.nextInt();
            if(i<5){
                total_hours=total_hours+(hours[i]);
            }
        }
        for(int i=0;i<7;i++) {
            if (hours[i] <= 8) {
                salary += hours[i] * 100;
            } else if (hours[i] > 8 && total_hours < 40) {
                salary += hours[i] * 100 + (hours[i] - 8) * 15;
            }
            else {
                if (i == 5) {
                    salary += hours[i] * 100 + 25 + 0.25 * hours[i];
                } else if (i == 6) {
                    salary += hours[i] * 100 + 25 + 0.5 * hours[i];
                } else {
                    salary += hours[i] * 100 + 25;
                }
            }
        }

        System.out.println(salary);
    }
}