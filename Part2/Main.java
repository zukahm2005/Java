package Lab4.Part2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color: ");
        String color = sc.next();
        double inputRadius;
        do{
            System.out.print("Enter radius: ");
            inputRadius = sc.nextDouble();
            if(inputRadius <= 0){
                System.out.println("Radius bigger than 0, please input again");
            }



        }while (inputRadius <= 0);

        Cirle cirle = new Cirle(inputRadius,color);
        double inputHeight;
        do{
            System.out.print("Enter height: " );
            inputHeight = sc.nextDouble();
            if(inputHeight <= 0){
                System.out.println("Height bigger than 0, please input again");
            }
        }while (inputHeight<= 0);

        System.out.println(cirle.toString());
        Cylinder cylinder = new Cylinder(inputRadius, color, inputHeight);
        System.out.println(cylinder.toString());
    }
}
