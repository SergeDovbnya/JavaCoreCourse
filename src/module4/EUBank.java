package module4;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) return 2000;
        else return 2200;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) return 20000;
        else return 10000;
    }

    @Override
    int getMonthlyRate() {
        if (getCurrency() == Currency.EUR) return 1;
        else return 0;
    }

    @Override
    int getCommission(int summ) {
        int commission;
        if (getCurrency() == Currency.EUR) {
            if (summ < 1000) commission = 2;
            else commission = 4;
        } else {
            if (summ < 1000) commission = 5;
            else commission = 7;
        }
        return commission;
    }
}
