public class StockMarket implements Stock {
    private List<Observer> observers;
    private String stockPrice;

    public StockMarket() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String stockPrice) {
        this.stockPrice = stockPrice;
        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }
}