package discountStrategy;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(100);
        order.setDiscountStrategy(new FlatDiscount());
        System.out.println(order.applyDiscount());

        order.setDiscountStrategy(new SeasonalDiscount());
        System.out.println(order.applyDiscount());

        order.setDiscountStrategy(new HolidayDiscount());
        System.out.println(order.applyDiscount());
    }
}
