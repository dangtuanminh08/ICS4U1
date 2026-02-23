import java.text.DecimalFormat;
import java.util.Scanner;

public class Feb23 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("Enter the radius of the circle >> ");
        double radius = sc.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.println("The area of the circle is: " + df.format(area) + " units squared");
        System.out.println("The circumference of the circle is: " + df.format(circumference) + " units");

        System.out.println("Enter the length of the rectangle >> ");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the rectangle >> ");
        double width = sc.nextDouble();
        int areaRec = (int) (length * width);
        int perimeterRec = (int) (2 * (length + width));
        System.out.printf("%s %d %s\n", "The area of the rectangle is:", areaRec, "units squared");
        System.out.printf("%s %d %s\n", "The perimeter of the rectangle is:", perimeterRec, "units");

        System.out.println("Enter the side length of the square >> ");
        double side_length = sc.nextDouble();
        double areaSquare = Math.pow(side_length, 2);
        double perimeterSquare = side_length*4;
        System.out.printf("%-20s%.2f\n", "Area:", areaSquare);
        System.out.printf("%-20s%.2f\n", "Perimeter:", perimeterSquare);

        System.out.println("Enter the base of the triangle");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle:");
        double height = sc.nextDouble();
        double areaTriangle = (base*height)/2;
        double perimeterTriangle = base + 2*Math.sqrt(Math.pow(base/2, 2) + Math.pow(height, 2));
        System.out.printf("%-20s%.2f\n", "Area:", areaTriangle);
        System.out.printf("%-20s%.2f\n", "Perimeter:", perimeterTriangle);
    }  
}
