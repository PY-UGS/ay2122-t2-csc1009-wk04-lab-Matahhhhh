import java.util.Scanner;

public class Lab4q1 {

    public static void main(String[] args) {
        Scanner input_value = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input_value.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input_value.nextDouble();

        BMI Reagan = new BMI(weight, height);

        System.out.println("BMI is "+ Reagan.calculateBMI());
        System.out.println(Reagan.categoryBMI());
    }
}


    
