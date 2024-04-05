package io.nok.designpattern.strategy;

public class CasherSituation {

    public void occur() {
        System.out.println("Customer can pay by cash or by card.");
        System.out.println("If he/she pays by cash, he/she will get a 10% discount.");
        System.out.println("If he/she pays by card, he/she will not get any discount.");

        Casher casher = new Casher();

        System.out.println("A will pay by cash.");
        casher.setPayStrategy(new PayCashStrategy());
        int totalAmountForA = casher.calculateTotalAmount(1000);

        System.out.println("B will pay by card.");
        casher.setPayStrategy(new PayCardStrategy());
        int totalAmountForB = casher.calculateTotalAmount(1000);

        System.out.println("Total amount for A(cash): " + totalAmountForA);
        System.out.println("Total amount for B(card): " + totalAmountForB);
    }

}
