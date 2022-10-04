import java.util.Scanner;

public class TipCalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Program asks for total bill
        System.out.print("Your total bill: ");
        double totalBill = scan.nextDouble();

        // Program asks for tip percentage
        System.out.print("Tip percentage: ");
        double tipPercentage = scan.nextInt();

        //Program converts tip percentage into a decimal
        tipPercentage = tipPercentage/100;

        // Program asks for the number of people in the party
        System.out.print("Number of people in the party: ");
        int numberOfPeople = scan.nextInt();

        // Program calculates total tip amount, total bill including tip, tip per person, and the total per person and sets them as variables
        double totalTipAmount = totalBill*tipPercentage;
        double totalBillIncludingTip = totalTipAmount+totalBill;
        double tipPerPerson = totalTipAmount/numberOfPeople;
        double totalPerPerson = totalBillIncludingTip/numberOfPeople;

        // Program displays total tip amount, total bill including tip, tip per person, and the total per person. Uses String.format("%.2f", ) to round to the nearest 2 decimals
        System.out.println("Your total tip amount is $" + String.format("%.2f",totalTipAmount));
        System.out.println("Your total bill including tip is $" + String.format("%.2f", totalBillIncludingTip));
        System.out.println("Each person pays $" + String.format("%.2f", tipPerPerson) + " in tips");
        System.out.println("Each person pays $" + String.format("%.2f", totalPerPerson) + " in total including bill and tip");
    }
}
