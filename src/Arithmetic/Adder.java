package Arithmetic;

/**
 * Created by Guillaume Gingembre on 07/02/2017.
 */
public class Adder extends Arithmetic {

    public boolean check (int a, int b){
        boolean result;

        if (a >= b) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
