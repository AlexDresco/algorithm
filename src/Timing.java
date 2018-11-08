import java.util.*;

public class Timing {
    public static void main(String[] args){
        ArrayList<Integer> range = generateRange();

        for (int arraySize : range) {
            ArrayList array = generateArray(arraySize);
            Collections.shuffle(array);
            long startTime = System.nanoTime();
            Last.testableMethod(array);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println((double) duration/1000000);
        }
    }

    private static ArrayList<Integer> generateRange() {
        ArrayList<Integer> range = new ArrayList<Integer>();
        for(int i = 50000; i <= 1000000; i += 50000){
            range.add(i);
        }
        return range;
    }

    private static ArrayList generateArray(int arraySize) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) { array.add(i); }
        return array;
    }
}








