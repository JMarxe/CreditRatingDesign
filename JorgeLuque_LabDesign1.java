/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labdesign1;

import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class JorgeLuque_LabDesign1 {

    public static final int LOW_INCOME = 10000;
    public static final int MID_INCOME = 50000;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the country name:");
        String country = scanner.nextLine();
        System.out.println("Enter the per-capita income (integer):");
        int perCapita = scanner.nextInt();
        
        if(perCapita < LOW_INCOME){
            //low income
//            System.out.println("LOW INCOME");
            System.out.println("Enter the country's default history status (Y or N):");
            scanner.nextLine(); //consumer the enter in the buffer.
            String loanDefault = scanner.nextLine();
            if(loanDefault.substring(0, 1).toLowerCase().
                    equals("y")){
                //we know they have defaulted.
                System.out.println("Country: " + country);
                System.out.println("Debt rating: DDE");
            }
            else{
//                System.out.println("The country has NOT defaulted.");
                System.out.println("Enter the country's Corruption Perception Index core (integer):");
                int corPer = scanner.nextInt();
                if(corPer < 32){
                    System.out.println("Country: " + country);
                    System.out.println("Debt rating: CCE");
                } else if(corPer >= 32 && corPer <48) {
                    System.out.println("Country: " + country);
                    System.out.println("Debt rating: CCD");
                } else {
                    System.out.println("Country: " + country);
                    System.out.println("Debt rating: CCC");
                }
            }
        }
        else if(perCapita >= LOW_INCOME &&
                perCapita < MID_INCOME){
            //medium income
//            System.out.println("MID INCOME");
            System.out.println("Enter the country's inflation rate (floating-point):");
            double infRate = scanner.nextDouble();
            System.out.println("Enter the country exchange rate variability (H/M/L):");
            scanner.nextLine();
            String exRate = scanner.nextLine();
            if(infRate > 1.9){
                if(exRate.substring(0, 1).toLowerCase().equals("h")){
                    System.out.println("Country: " + country);
                    System.out.println("Debt rating: BBE");
                } else if(exRate.substring(0, 1).toLowerCase().equals("m")) {
                    System.out.println("Country: " + country);
                    System.out.println("Debt rating: BBD");
                } else {
                    System.out.println("Country: " + country);
                    System.out.println("Debt rating: BBC");
                }
            } else {
                System.out.println("Country: " + country);
                System.out.println("Debt rating: BBB");
            }
        }
        else{
            //high income
//            System.out.println("HIGH INCOME");
            System.out.println("Enter the country's tax revenue as a percentage of GDP (floating-point):");
            double taxRev = scanner.nextDouble();
            if(taxRev >= 23.5){
                System.out.println("Country: " + country);
                System.out.println("Debt rating: AAA");
            } else if (taxRev < 23.5 && taxRev >= 11.2) {
                System.out.println("Country: " + country);
                System.out.println("Debt rating: AAB");
            } else {
                System.out.println("Country: " + country);
                System.out.println("Debt rating: AAC");
            }
        }
    }
    
}