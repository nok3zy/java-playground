package io.nok.designpattern.strategy;

public class PayCardStrategy implements PayStrategy {

    @Override
    public int execute(int price) {
        return price;
    }

}
