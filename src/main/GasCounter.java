package main;

import javax.swing.JOptionPane;

public class GasCounter {
public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "This is the gas calculator. This doohickey will tell you if you can drive a hundred miles!");
String gallonString = JOptionPane.showInputDialog(null, "How much gas in gallons do you have?");
System.out.println("How much gas do you have");
double gallonAmt = (double) Double.parseDouble(gallonString);
System.out.println(gallonAmt);
String efficiencyString = JOptionPane.showInputDialog(null, "how many miles per gallon?");
System.out.println("How many miles per gallon?");
double efficiency = (double) Double.parseDouble(efficiencyString);
System.out.println(efficiency);
String priceString = JOptionPane.showInputDialog(null, "what is the price of gas?");
System.out.println("what is the price of gas?");
double price = (double) Double.parseDouble(priceString);
System.out.println(price);
double gallons100Miles = (100/efficiency);
System.out.println( "Gallons per 100 miles:" + (gallons100Miles));
double distanceFullTank = (gallonAmt * efficiency);
System.out.println("Your distance in miles on a full tank of gas is " + distanceFullTank);
double priceFullTank = (price * gallonAmt);
System.out.println("Your price for a full tank is $" + String.format("%.2f", priceFullTank));
if (distanceFullTank > 100) {
	System.out.println("AW YEAH!! Your car can go 100 miles}");}
 if (distanceFullTank < 100) {
	 System.out.println("Oh... Your car can't go 100 miles.");}
}
}
// >=]
