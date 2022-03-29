// Program to find the area of a circle
import java.util.*;
public class CircleArea {
    public static void main (String[]args){
        // Taking Radius as input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        int Radius = sc.nextInt();
        double area = (3.14159* Radius*Radius);
        System.out.println("The area of circle is : "+ area);
    }
}
