public class Account {
    public String customername;
    private double accountBalance;
    public String residence;

    public void setAccountDetails(String name , double balance, String home){
        this.customername=name;
        this.accountBalance=balance;
        this.residence=home;
    }
    public String getCustomerResidence(){
        return this.residence;
    }
    public String getCustomerName(){
        return this.customername;
    }
    public double getAccountBalance(){
        return this.accountBalance;
    }
    public void showDetails(){
        System.out.print("customer Name is: " +this.getCustomerName()+ ", Balance : Ksh " +this.getAccountBalance()+ " and residence is " +this.getCustomerResidence()+ "\n");
    }
}
