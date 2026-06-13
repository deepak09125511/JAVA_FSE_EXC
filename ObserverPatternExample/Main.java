import java.util.*;

interface Stock {

    void registerObserver(Observer o);
    void deregisterObserver(Observer o);
    void notifyObservers();
}
interface Observer {
    void update(int price);
}
class StockMarket implements Stock {

    private List<Observer> observers = new ArrayList<>();
    private int price;

    public void setPrice(int price) {
        this.price = price;
        notifyObservers(); 
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void deregisterObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(price);
        }
    }
}
class MobileApp implements Observer {

    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    public void update(int price) {
        System.out.println("MobileApp [" + name + "] notified. Stock price: " + price);
    }
}
class WebApp implements Observer {

    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    public void update(int price) {
        System.out.println("WebApp [" + name + "] notified. Stock price: " + price);
    }
}
public class Main {
    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobile1 = new MobileApp("MobileUser1");
        Observer web1 = new WebApp("WebUser1");

        stockMarket.registerObserver(mobile1);
        stockMarket.registerObserver(web1);

        System.out.println("Setting stock price to 100:");
        stockMarket.setPrice(100);

        System.out.println("Setting stock price to 150:");
        stockMarket.setPrice(150);

        stockMarket.deregisterObserver(mobile1);

        System.out.println("Setting stock price to 200:");
        stockMarket.setPrice(200);
    }
}