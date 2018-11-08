import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Pairs {


    public static List testableMethod(ArrayList array) {

    //creates somewhere to store the pairs
    List<String> pairs = new ArrayList<>();

    //take the first element of the array and list all pairs excluding itself
    for (int j = 0; j <= array.size(); j++){
        for (int i = j + 1; i <= array.size(); i++) {
            int[] pair = {j, i};
            pairs.add(Arrays.toString(pair));
        }
    }
    //take second element and list all pairs excluding
        return pairs;
    }
}
