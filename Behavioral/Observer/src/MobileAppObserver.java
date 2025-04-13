public class MobileAppObserver implements StockObserver {

    private String observer;

    public MobileAppObserver(String observer) {
        this.observer = observer;
    }
    @Override
    public void updatedStockPrice(String stockName, Double price) {
        System.out.println(observer + ": " + stockName + " " + price);
    }
}
