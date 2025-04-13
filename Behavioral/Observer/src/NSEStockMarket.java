import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NSEStockMarket implements StockMarket {

    private final List<StockObserver> observers;
    Map<String, Double> stocks = new HashMap<>();

    public NSEStockMarket() {
        this.observers = new ArrayList<StockObserver>();
    }


    @Override
    public void addSubscriber(StockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeSubscriber(StockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void updateStockPrice(String stockName, Double price) {
        stocks.put(stockName, price);
        notifyObservers(stockName, price);
    }

    private void notifyObservers(String stockName, Double price) {
        for (StockObserver observer : observers) {
            observer.updatedStockPrice(stockName, price);
        }
    }
}
