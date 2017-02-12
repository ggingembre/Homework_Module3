package BirdHomework;

/**
 * Created by Guillaume Gingembre on 06/02/2017.
 */
public class Module3_Homework1 {
    public static void main(String[] args) {
        String Songs [] = new String[4];
        int i;

        Songs[0] = "I am walking";
        Songs[1] = "I am flying";
        Songs[2] = "I am singing";
        Songs[3] = "I am a Bird";

        bird birdObject = new bird();

        for (i = 0; i < Songs.length; i++) {
            birdObject.sing(Songs[i]);
        }

    }
}