import java.util.HashMap;
import java.util.Map;

public class Susah3 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 4};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : arr) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " muncul " + entry.getValue() + " kali");
        }
    }
}

