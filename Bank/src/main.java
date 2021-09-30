import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Account firstCustomer = new Account(); //object created
        firstCustomer.setAccountDetails(  "Kevin Otieno",  378.56,"Nairobi");
        firstCustomer.showDetails();


        Account secondCustomer=new Account();
        secondCustomer.setAccountDetails("Mercy Karanja", 500.334,"Kinangop");
       secondCustomer.showDetails();

       Account thirdCustomer= new Account();
       thirdCustomer.setAccountDetails("Martin Mwangi ", 335580, "Ngong");
       thirdCustomer.showDetails();


    }
}
