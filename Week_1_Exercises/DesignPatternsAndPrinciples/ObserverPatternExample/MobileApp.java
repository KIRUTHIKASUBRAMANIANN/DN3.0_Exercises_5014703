public class MobileApp implements Observer {
    @Override
    public void update(String stockPrice) {
        System.out.println("Mobile App: Stock price updated to " + stockPrice);
    }
}

