/*
Feb 11 - Minh D 

This program contains the answers to Feb 11's tasks (A-I)

*/

public class Feb11{
    /*
    Task A. 

    1) System.out.println( 1 + 2 + 3 );
    All operations are done with integers.
    Output: 6

    2) System.out.println( 1 + 2 + "Hello" );
    Since the integers come first, they are added as normal, then concatenated
    to the word "Hello". 
    Output: "3Hello"

    3) System.out.println( "Hello" + 2 + 3 );
    Since a string comes first, the integers are also treated as strings.
    Output: "Hello23"

    4) System.out.println( 1 + "Hello" + 3 );
    Since a string is between the integers, they are also treated as strings.
    Output: "1Hello3"

    Task B.

    int a = 11;
    int b = 3;
    int c = 5;
    
    System.out.println("result = " + (a % b + 5 / c));
    System.out.println("result = " + (c * (-5 / 2) + b % 3));
    System.out.println("result = " + ((c + a % 4) * 4 - b));

    Predicted output:
    "result = 3"
    "result = -10"
    "result = 29"

    After running the code, I found that I was correct. :)

    Task C. 

    public class TempConverter {
        public static void main( String[] args ) {
            double celsius = 37.0;
            double fahrenheit;
            
            fahrenheit = celsius * (9 / 5) + 32;
            
            System.out.println( celsius + "C is " + fahrenheit + "F" );
        }  
    }

    The error is that (9/5) will not return a double, even though the user expects it to.
    Because it is integer division, the decimal is ignored and the output becomes an integer.
    It should be changed to (9.0/5) to get the intended result.
    */
    public static void main(String args[]){
        // Task D.
        int num = (int) (Math.random()*7);
        // Math.random() only generates a random number between 0.0-1.0. Multiply this number by 7 and convert
        // to type int to drop the decimal and generate a random integer.
        System.out.println(num);

        // Task E.
        System.out.println(Math.floor(11.9));
        System.out.println(Math.ceil(11.9));
        System.out.println(Math.sqrt(321));
        System.out.println(Math.abs(-2));

        // Task F.
        double aprilRainfall = 12.0;
        double mayRainfall = 14.0;
        double juneRainfall = 8.0;

        double averageRainfall;

        averageRainfall = (aprilRainfall+mayRainfall+juneRainfall)/3;

        System.out.println("Rainfall for April: " + aprilRainfall);
        System.out.println("Rainfall for May: " + mayRainfall);
        System.out.println("Rainfall for June: " + juneRainfall);
        System.out.println("Average rainfall: " + String.format("%.3f", averageRainfall));

        // Task G.

        double sinx = Math.sin(0.5236);
        double cosx = Math.cos(0.5236);
        double result = Math.pow(sinx, 2) + Math.pow(cosx, 2);

        System.out.println("Sine: " + sinx + " Cosine: " + cosx + " Sum: " + result);


        // Task H.

        double x = 89.57;

        // Task I.

        double answer = 3*(Math.pow(x,2)) - 8*x + 4;
        System.out.println("At X = " + x + " the value is " + answer);
    }
}