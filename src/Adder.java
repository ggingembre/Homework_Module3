/**
 * Created by Guillaume Gingembre on 07/02/2017.
 */
public class Adder extends Arithmetic {

    public boolean check (Integer a, Integer b){
        boolean result;

        if (a >= b) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
