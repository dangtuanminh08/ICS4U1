import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Feb19 {
    public static void main(String[] args) {
        // Invoice
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$0.00");
        double item1 = 99.99;
        double item2 = 249.99;

        System.out.println("What is your name?");
        //String name = sc.nextLine().trim();

        System.out.printf("%50s\n","CANADA COMPUTERS INC.");
        System.out.printf("%50s\n", "---------------------");
        System.out.printf("%-20s%-50s%s\n", "QTY", "ITEM", "PRICE");
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-20s%-50s%s\n", "1", "WD 2TB External Hard Drive", df.format(item1));
        System.out.printf("%-20s%-50s%s\n", "1", "ASUS 24\" LED Monitor", df.format(item2));
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%28s%49s\n", "SUBTOTAL:", df.format(item1+item2));
        System.out.printf("%28s%49s\n", "HST:", df.format((item1+item2)*0.13));
        System.out.printf("%28s%49s\n", "GRAND TOTAL:", df.format((item1+item2)*1.13));
        
        // Making Change

        double change;
        while(true){
            try{
                System.out.println("How much change do you have?");
                change = sc.nextDouble();
                break;
            }  
            catch (InputMismatchException e){
                System.out.println("Only type digits please.");
            } 
        }

        int cents = (int) Math.round(change*100);
        int toonies = cents/200;
        cents %= 200;
        int loonies = cents/100;
        cents %= 100;
        int quarters = cents/25;
        cents %= 25;
        int dimes = cents/10;
        cents %= 10;
        int nickels = cents/5;
        cents %= 5;
        int pennies = cents;
        cents = 0;

        System.out.printf("%s\t%s\n", "AMOUNT OF CHANGE:", df.format(change));
        System.out.printf("%30s%d\n", "Toonies:", toonies);
        System.out.printf("%30s%d\n", "Loonies:", loonies);
        System.out.printf("%30s%d\n", "Quarters:", quarters);
        System.out.printf("%30s%d\n", "Dimes:", dimes);
        System.out.printf("%30s%d\n", "Nickels:", nickels);
        System.out.printf("%30s%d\n", "Pennies:", pennies);
    }
}
