package Bank;
/**
 * Created by Guillaume Gingembre on 12/02/2017.
 */

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency){
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public void paySalary(){
        balance = balance + salary;
    }

    public void withdraw(int summ){
        double commissions, comRateSmall, comRateLarge;

        comRateSmall = 1.05;
        comRateLarge = 1.1;

        if (summ<1000){
            summ = (int) (summ * comRateSmall);
        } else {
            summ = (int) (summ * comRateLarge);
        }

        if (balance > summ){
        balance = (balance - summ);
        } else{
            if (summ<1000){
                System.out.println("You do not have enough funds for this transaction. Your balance is " + balance
                        + " . Please try again with a lower amount. You can withdraw a maximum of: " + Math.floor(balance/comRateSmall) + ".\n");
            }else{
                System.out.println("You do not have enough funds for this transaction. Your balance is " + balance
                        + " . Please try again with a lower amount. You can withdraw a maximum of: " + Math.floor(balance/comRateLarge) + ".\n");
            }
        }
    }

    public int companyNameLength(){
        return this.companyName.length();
    }

    public void monthIncreaser(int addMonth){
        this.monthsOfEmployment = this.monthsOfEmployment + addMonth;
    }

    @Override // in order to properly print the objects
    public String toString() {
        return "Name: " + name  + "\nBalance: " + (balance) + "\nMonths of Employment: " +
                monthsOfEmployment + "\nCompany Name: " + companyName + "\nSalary: " + salary + "\nCurrency: "
                + currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
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
}
