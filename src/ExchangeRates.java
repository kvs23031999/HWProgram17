import java.util.Arrays;
import java.util.Random;

public class ExchangeRates {
    public static final int MIN_PRICE = 35;
    public static final int MAX_PRICE = 40;

    public static <MinValue> void main(String[] args) {
        Random random = new Random();

        double randomValue = MIN_PRICE + (MAX_PRICE - MIN_PRICE) * random.nextDouble();
        Bank[] banks = new Bank[]{new Bank("ПРИВАТБАНК", MIN_PRICE + (MAX_PRICE - MIN_PRICE) * random.nextDouble()),
                new Bank("Сенс Банк", MIN_PRICE + (MAX_PRICE - MIN_PRICE) * random.nextDouble()),
                new Bank("Сітібанк", MIN_PRICE + (MAX_PRICE - MIN_PRICE) * random.nextDouble()),
                new Bank("ІНГ Банк Україна", MIN_PRICE + (MAX_PRICE - MIN_PRICE) * random.nextDouble()),
                new Bank("Ощадбанк", MIN_PRICE + (MAX_PRICE - MIN_PRICE) * random.nextDouble()),
                new Bank("Укрексімбанк", MIN_PRICE + (MAX_PRICE - MIN_PRICE) * random.nextDouble()),
                new Bank("УКРГАЗБАНК", MIN_PRICE + (MAX_PRICE - MIN_PRICE) * random.nextDouble()),
                new Bank("Райффайзен Банк", MIN_PRICE + (MAX_PRICE - MIN_PRICE) * random.nextDouble()),
                new Bank("УКРСИББАНК", MIN_PRICE + (MAX_PRICE - MIN_PRICE) * random.nextDouble()),
                new Bank("ПУМБ", MIN_PRICE + (MAX_PRICE - MIN_PRICE) * random.nextDouble()),
                new Bank("КРЕДІ АГРІКОЛЬ БАНК", MIN_PRICE + (MAX_PRICE - MIN_PRICE) * random.nextDouble()),
                new Bank("Південний", MIN_PRICE + (MAX_PRICE - MIN_PRICE) * random.nextDouble()),
                new Bank("КРЕДОБАНК", MIN_PRICE + (MAX_PRICE - MIN_PRICE) * random.nextDouble()),
                new Bank("Банк Кредит Дніпро", MIN_PRICE + (MAX_PRICE - MIN_PRICE) * random.nextDouble())};
        System.out.println(Arrays.toString(banks));

        double max = banks[0].dollarPrice;
        for (int i = 1; i < banks.length; i++) {
            max = Math.max(max, banks[i].dollarPrice);
            double name = banks[0].dollarPrice;
            for (int j = 1; j < banks.length; j++) {
                name = Math.max(name, banks[i].dollarPrice);
            }
            if ( max == banks[i].dollarPrice ){

            }
            }
            System.out.println(max);


        }
    }
