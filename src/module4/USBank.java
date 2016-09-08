package module4;

public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) return 1000;
        else return 1200;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) return 10000;
        else return Integer.MAX_VALUE;
    }

    @Override
    int getMonthlyRate() {
        if (getCurrency() == Currency.USD) return 1;
        else return 2;
    }

    @Override
    int getCommission(int summ) {
        int commission;
        if (getCurrency() == Currency.EUR) {
            if (summ < 1000) commission = 6;
            else commission = 8;
        } else {
            if (summ < 1000) commission = 5;
            else commission = 7;
        }
        return commission;
    }
}
