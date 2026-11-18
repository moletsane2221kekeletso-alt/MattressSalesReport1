/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssalesreport;

import java.util.Scanner;

/**
 *
 * @author Kekel
 */
public class MattressSalesReport {

    // Calculation Monthly Sales Report
    public static void main(String[] args) {
        String name = "print Product";
       Scanner input = new Scanner(System.in);
       System.out.print("Enter Cozy Nights mattress month1: ");
       double month1 = input.nextDouble();
       
       System.out.print("Enter Cozy Nights mattress month2: ");
       double month2 = input.nextDouble();
       
       System.out.print("Enter Cozy Nights mattress month3: ");
       double month3 = input.nextDouble();
       
       System.out.print("Enter Restonic Barbados mattress month1: ");
       double monthl = input.nextDouble();
       
       System.out.print("Enter Restonic Barbados matress monthll: ");
       double monthll = input.nextDouble();
       
       System.out.print("Enter Restonic Barbados mattress monthlll: ");
       double monthlll = input.nextDouble();
       
       System.out.print("Enter Sealy Phuket mattress monthly1: ");
       double monthly1 = input.nextDouble();
       
       System.out.print("Enter Sealy Phuket mattress monthly2: ");
       double monthly2 = input.nextDouble();
       
       System.out.print("Enter Sealy Phuket mattress monthly3: ");
       double monthly3 = input.nextDouble();
     
       int[] sales = {23, 67, 76, 50};
       

       double total = month1 + month2 + month3;
       double average = total / 3;
     
       System.out.println("Total = " + total);
       System.out.println("Average = " + average);
    } 
} 





       
       
    
       
       
       
       
      
  

