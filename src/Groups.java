import java.lang.reflect.Array;
import java.util.*;

public class Groups {

    public static ArrayList testableMethod(ArrayList array) {

        // Set how many groups
        int numberOfGroups = 3;

        // Divide the number of people by groups
        int membersPerGroup = array.size() / numberOfGroups;

        //Creates a place to store
        ArrayList<String> groups = new ArrayList<>();

        // Create equal groups
        for (int start = 0; start < array.size(); start += membersPerGroup) {
            int end = Math.min(start + membersPerGroup, array.size());
            List<Integer> group = array.subList(start, end);
            // Show the groups

        }
        return groups;
    }
}

