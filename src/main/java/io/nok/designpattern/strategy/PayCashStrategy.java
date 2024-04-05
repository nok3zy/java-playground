package io.nok.designpattern.strategy;

public class PayCashStrategy implements PayStrategy {

    @Override
    public int execute(int price) {
        return price - (price * 10 / 100);
    }
}
