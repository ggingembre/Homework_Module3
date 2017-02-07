/**
 * Created by Guillaume Gingembre on 07/02/2017.
 */
public class Module3_Homework2 { // to call methods add and check and print results to see if they work properly
    public static void main(String[] args) {
        int a, b, resultSum;
        boolean resultCheck;

        a = 10;
        b = 15;

        Arithmetic ArithmeticObject = new Arithmetic();
        resultSum = ArithmeticObject.add(a,b);
        System.out.println("The add method of the Arithmetic class with integers " + a +
                " and " + b + " returned the following result: " + resultSum);

        Adder AdderObject = new Adder();
        resultCheck = AdderObject.check(a,b);
        System.out.println("The check method of the Adder class with integers " + a +
                " and " + b + " returned the following result: " + resultCheck);
    }
}
