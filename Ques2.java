package Assignment2;

public class Ques2{
    
    public static class Stock
    {
       private String symbol,name;
       private double previousClosingPrice,currentPrice;
       
       public Stock(String sym,String nam)
       {
           symbol = sym;
           name = nam;         
       }
       public double getChangePercent(double previousClosingPrice,double currentPrice)
       {
           return ((currentPrice - previousClosingPrice)*100)/previousClosingPrice;
       }
    }
        
    public static void main(String args[])
    {
        double perc;
        Stock stock = new Stock("ORCL","ORACLE CORPORATION");
        
        perc = stock.getChangePercent(34.5,34.35);
        
        if(perc > 0)
            System.out.println("Price-Change percentage has increased by " + perc + "%");
        else 
            System.out.println("Price-Change percentage has decreased by " + -perc + "%");
    }
}