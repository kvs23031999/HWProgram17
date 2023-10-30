import java.util.Scanner;

public class Bank {

    public String name;
    public double dollarPrice;

    public Bank(String name, double dollarPrice) {
        this.name = name;
        this.dollarPrice = dollarPrice;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", dollarPrice=" + dollarPrice +
                '}';
    }
}


