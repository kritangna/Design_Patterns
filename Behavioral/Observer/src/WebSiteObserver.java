public class WebSiteObserver implements StockObserver {

    String observer;

    public WebSiteObserver(String observer) {
        this.observer = observer;
    }
    @Override
    public void updatedStockPrice(String stockName, Double price) {
        System.out.println(observer + ": " + stockName + " " + price);
    }
}
