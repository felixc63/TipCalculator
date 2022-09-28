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

        //Rounds to the nearest 2 decimals
        totalTipAmount = Math.round(totalTipAmount*100)/100.0;
        totalBillIncludingTip = Math.round(totalBillIncludingTip*100)/100.0;
        tipPerPerson = Math.round(tipPerPerson*100)/100.0;
        totalPerPerson = Math.round(totalPerPerson*100)/100.0;

        // Program displays total tip amount, total bill including tip, tip per person, and the total per person
        System.out.println("Your total tip amount is " + totalTipAmount);
        System.out.println("Your total bill including tip is " + totalBillIncludingTip);
        System.out.println("Each person pays " + tipPerPerson + " in tips");
        System.out.println("Each person pays " + totalPerPerson + " in total including bill and tip");
    }
}
