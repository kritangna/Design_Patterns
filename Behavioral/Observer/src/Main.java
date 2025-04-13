public class Main {
    public static void main(String[] args) {
        StockMarket market = new NSEStockMarket();
        StockObserver user1 = new MobileAppObserver("Rachel");
        StockObserver user2 = new MobileAppObserver("Ross");
        StockObserver user3 = new WebSiteObserver("Phoebe");
        StockObserver user4 = new WebSiteObserver("Chandler");

        market.addSubscriber(user1);
        market.addSubscriber(user2);
        market.addSubscriber(user3);
        market.addSubscriber(user4);

        market.updateStockPrice("Suzlon", 57.00);
        System.out.println("*******************************************");
        market.updateStockPrice("Sky Gold", 357.00);
        System.out.println("*******************************************");
        market.updateStockPrice("SBI ETF", 76.00);
        System.out.println("*******************************************");
        market.updateStockPrice("Nippon", 157.00);
        market.removeSubscriber(user1);
        market.updateStockPrice("Quant", 161.00);
        System.out.println("*******************************************");


    }
}