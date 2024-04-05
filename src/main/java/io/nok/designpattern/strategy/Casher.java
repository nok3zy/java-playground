package io.nok.designpattern.strategy;

public class Casher {

    private PayStrategy payStrategy;

    public Casher() {
    }

    public Casher(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public PayStrategy getPayStrategy() {
        return payStrategy;
    }

    public int calculateTotalAmount(int price) {
        if (payStrategy == null) {
            throw new IllegalStateException("Pay strategy is not set.");
        }
        return payStrategy.execute(price);
    }

}
