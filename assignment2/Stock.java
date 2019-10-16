public class Stock
{
    private String symbol,name;
    private double previousClosingPrice,currentPrice;
    
    public Stock(String symbol,String name)
    {
        this.symbol = symbol;
        this.name = name;         
    }
    public double getChangePercent(double currentPrice, double previousClosingPrice)
    {
        return ((currentPrice - previousClosingPrice)*100)/previousClosingPrice;
        this.currentPrice = currentPrice;
        this. previousClosingPrice = previousClosingPrice;
    }   
    public static void main(String args[])
    {
        double prcnt;
        Stock stock = new Stock("ORCL","ORACLE CORPORATION");
        
        prcnt = stock.getChangePercent(34.35,34.5);
        
        if(prcnt > 0)
            System.out.println("Price percentage has increased by " + prcnt + "%");
        else 
            System.out.println("Price percentage has decreased by " + prcnt + "%");
    }
}