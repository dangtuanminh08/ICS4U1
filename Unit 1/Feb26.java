import java.util.Scanner;

public class Feb26 {
    public static void main(String[] args) {
        // Number 1
        /*
        Assignment statements that will cause errors are:
        float c = 3.5; must have an f
        
        a = 4.5; must be type-casted
        b = a + b; must be type-casted if a = 4.5
        e = "h"; char type must use ''
        e = "def"; not a char
        b = f; f has not be assigned a value yet
        */

        // Number 2
        
        System.out.println(240/8); //30
        System.out.println(19/3); //6
        System.out.println(188%9); //8
        System.out.println(9%9); //0
        System.out.println(5+8.0/3.0); //7.6666666
        System.out.println(3+(4*(2+2))%6); //7
        System.out.println(4-5*2%4/1); //2
        System.out.println(4/-9); //0
        System.out.println(3%4); //3

        // Number 3
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the first number? ");
        double num1 = sc.nextDouble();
        System.out.print("What is the second number? ");
        double num2 = sc.nextDouble();
        System.out.print("What is the third number? ");
        double num3 = sc.nextDouble();

        double average = (num1 + num2 + num3)/3;
        System.out.println("Wow! The average is: " + average);

        // Number 4
        System.out.print("An object is falling from 100 meters! What time do you want to know the height of? (Must be less than 4.5 seconds) ");
        double time;
        while(true){
            time = sc.nextDouble();
            if(time > 4.5){
                System.out.println("Time must be less than 4.5 seconds!");
            }
            else{
                break;
            }
        }
        double height = 100-4.9*Math.pow(time, 2);
        System.out.printf("At %.2f seconds, the height is %.2f meters\n", time, height);

        // Number 5
        double labour = 0.75;
        double rent = 1;
        System.out.print("How big is your pizza? (in inches)");
        double size = sc.nextDouble();

        if(size>20){
            labour++;
        }
        double materials = size*size*0.05;
        double total = labour + rent + materials;
        System.out.printf("Your pizza costs $%.2f.", total);
    }
}
