package com.ekang.refactoring.chapter6;

public class Account {
    int gamma (int inputVal, int quantity, int yearToDate) {
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }

    public int delta() {
        return 0;
    }
}

// step 1. To turn into a method object, declare a new class
class Gamma {
    // provide a final field for the original object
    // and a field for each parameter and temporary variable in the method
    private final Account _account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    Gamma(Account account, int inputValArg, int quantityArg, int yearToDateArg) {
        _account = account;
        inputVal = inputValArg;
        quantity = quantityArg;
        yearToDate = yearToDateArg;
    }

    int compute() {
        importantValue1 = (inputVal * quantity) + _account.delta();
        importantValue2 = (inputVal * yearToDate) + 100;
        importantThing();
        int importantValue3 = importantValue2 * 7;
        // and so on
        return importantValue3 - 2 * importantValue1;
    }

    private void importantThing() {
        if ((yearToDate-importantValue1) > 100)
            importantValue2 -= 20;
    }

}
