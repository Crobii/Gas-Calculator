package main;

import javax.swing.JOptionPane;

public class GasCounter {
public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "Welcome to the Gas Calculator. This doohickey tells you how if you can go 100 miles.");	
String gasString = JOptionPane.showInputDialog(null, "How many gallons of gas in the tank?");
double gasInTank = Double.parseDouble(gasString);
String efficiencyString = JOptionPane.showInputDialog(null, "What is the fuel efficiency of your car in miles per gallon?");
double efficiency = Double.parseDouble(efficiencyString);
String costString = JOptionPane.showInputDialog(null, "What is the price of gas per gallon?");
double costPerGallon = Double.parseDouble(costString);
double gasFor100Miles = (100/efficiency);
double costFor100Miles = (gasFor100Miles * costPerGallon);
double distanceOnFullTank = (gasInTank * efficiency);
String costDisplay = String.format("cost = $%.2f", costFor100Miles);
String distanceDisplay = String.format("Car's range is %.2f", distanceOnFullTank);
JOptionPane.showMessageDialog(null, costDisplay + "\n" + distanceDisplay);
}
}