package Bank;

/**
 * Created by Guillaume Gingembre on 12/02/2017.
 */
public class BankSolution {
    public static void main(String[] args) {

        // create new user
        User Guillaume = new User ("Gingembre",10000,
                1, "GoIT",1000,"EUR");

        // print new user before changes
        System.out.println(Guillaume.toString());

        // test the companyNameLength method
        System.out.println("\nThe length of the name of the company where Guillaume works (" +
        Guillaume.getCompanyName() + ") is: " + Guillaume.companyNameLength()+". \n");

        // make changes calling methods from user class
        Guillaume.paySalary();
        Guillaume.withdraw(20000);
        Guillaume.monthIncreaser(1);

        // check results by printing Guillaume after changes
        System.out.println(Guillaume.toString());

    }
}
