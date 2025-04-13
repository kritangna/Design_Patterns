public interface StockMarket {

    void addSubscriber(StockObserver observer);
    void removeSubscriber(StockObserver observer);
    void updateStockPrice(String stockName, Double price);
}
