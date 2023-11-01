package discountStrategy;

public class HolidayDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(Order order) {
        // Assume the flat discount is 30% of the total amount

        return order.getTotalAmount() - (order.getTotalAmount() * 0.3);
    }
}

