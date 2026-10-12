package com.mycompany.test1;

import java.util.Scanner; 

public class RunApplication { 

    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in); 

  

        System.out.println("Select a beverage type:"); 

        System.out.println("1. Coffee"); 

        System.out.println("2. Tea"); 

        System.out.println("3. Hot Chocolate"); 

        System.out.print("Enter choice (1-3): "); 

        int choice = input.nextInt(); 

        input.nextLine(); // clear the leftover newline 

  

        String beverageType; 

        switch (choice) { 

            case 1: 

                beverageType = "Coffee"; 

                break; 

            case 2: 

                beverageType = "Tea"; 

                break; 

            case 3: 

                beverageType = "Hot Chocolate"; 

                break; 

            default: 

                System.out.println("Invalid choice."); 

                input.close(); 

                return; 

        } 

  

        System.out.print("Enter the city: "); 

        String city = input.nextLine(); 

  

        System.out.print("Enter the total sales in that city: "); 

        int totalSales = input.nextInt(); 

  

        BeverageSales sales = new BeverageSales(beverageType, city, totalSales); 

        sales.printReport(); 

  

        input.close(); 

    } 

}
