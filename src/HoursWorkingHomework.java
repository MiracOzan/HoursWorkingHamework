import java.util.Scanner;

public class HoursWorkingHomework {
    public static void main(String[] args) {
        System.out.println("Enter the working hours you work");
        Scanner scn = new Scanner(System.in);
        Calculator(scn.nextDouble());
    }

    public static void Calculator(double hour) {
        if (hour <= 60){
            if (hour <= 40) {
                System.out.println("your earnings are " + hour * 8 + " usd");
            }
            else if (hour > 40){
                System.out.println("your earnings are " + hour * 12 + " usd" );
            }
        }
        else{
            System.out.println("Best Employess My Friends :) ");
        }

    }
}
