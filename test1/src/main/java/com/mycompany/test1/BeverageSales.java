package com.mycompany.test1;


public class BeverageSales extends Beverage { 

  

    public BeverageSales(String beverageType, String city, int totalSales) { 

        super(beverageType, city, totalSales); 

    } 

  

    public void printReport() { 

        System.out.println("\t--- Number 1 Coffee Hut Sales Report ---"); 

        System.out.println("Beverage type: " + getBeverageType()); 

        System.out.println("City: " + getCity()); 

        System.out.println("Total sales: " + getTotalSales()); 

    } 

} 
public abstract class Beverage implements IBeverage { 

    private String beverageType; 

    private String city; 

    private int totalSales; 

  

    public Beverage(String beverageType, String city, int totalSales) { 

        this.beverageType = beverageType; 

        this.city = city; 

        this.totalSales = totalSales; 

    } 

  

    @Override 

    public String getBeverageType() { 

        return beverageType; 

    } 

  

    @Override 

    public String getCity() { 

        return city; 

    } 

  

    @Override 

    public int getTotalSales() { 

        return totalSales; 

    } 

}