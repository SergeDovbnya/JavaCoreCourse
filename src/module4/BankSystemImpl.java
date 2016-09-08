package module4;


public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();
        double commission = userBank.getCommission(amount) * 0.01 * amount;
        if (userBank.getLimitOfWithdrawal() >= amount + commission) {
            if (user.getBalance() > amount + commission) {
                user.setBalance(user.getBalance() - amount - commission);
            }
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();
        if (userBank.getLimitOfFunding() >= amount) {
            user.setBalance(user.getBalance() + amount);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        withdrawOfUser(fromUser, amount);
        fundUser(toUser, amount);
    }

    @Override
    public void paySalary(User user) {
        fundUser(user, user.getSalary());
    }
}
