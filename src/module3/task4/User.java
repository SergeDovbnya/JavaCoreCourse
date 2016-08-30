package module3.task4;

public class User {
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    void paySallary() {
        setBalance(getBalance() + getSalary());
    }

    void withdraw(int summ) {
        double commission;
        if (summ < 1000) commission = summ * 0.05;
        else commission = summ * 0.1;
        if (getBalance() >  summ + commission) setBalance(getBalance() - summ - commission);
    }

    int companyNameLength() {
        return getCompanyName().length();
    }

    void monthIncreaser(int addMonth) {
        setMonthsOfEmployment(getMonthsOfEmployment() + addMonth);
    }

}
