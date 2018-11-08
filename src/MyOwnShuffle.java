import java.util.*;

public class MyOwnShuffle {
    public static ArrayList testableMethod(ArrayList array){
        Random random = new Random();

        for (int i = 0; i < array.size(); i++) {
            int randomPosition = random.nextInt(array.size());
            array.set(i, array.get(randomPosition));
            array.set(randomPosition, array.get(i));
        }
        return array;
    }
}
