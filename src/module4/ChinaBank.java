package module4;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) return 100;
        else return 150;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) return 5000;
        else return 10000;
    }

    @Override
    int getMonthlyRate() {
        if (getCurrency() == Currency.USD) return 1;
        else return 0;
    }

    @Override
    int getCommission(int summ) {
        int commission;
        if (getCurrency() == Currency.EUR) {
            if (summ < 1000) commission = 10;
            else commission = 11;
        } else {
            if (summ < 1000) commission = 3;
            else commission = 5;
        }
        return commission;
    }
}
