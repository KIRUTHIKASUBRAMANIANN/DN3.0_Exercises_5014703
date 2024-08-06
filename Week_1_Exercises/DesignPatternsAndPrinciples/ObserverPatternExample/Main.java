public class Main {
    public static void main(String[] args) {
        
        StockMarket stockMarket = new StockMarket();

        
        stockMarket.registerObserver(new MobileApp());
        stockMarket.registerObserver(new WebApp());

        
        stockMarket.notifyObservers("100.00");

        
        stockMarket.deregisterObserver(new WebApp());

        
        stockMarket.notifyObservers("101.00");
    }
}