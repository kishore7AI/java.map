import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("math", 90);
        map.put("science", 85);

        System.out.println(map.get("math")); // Output: 90
    }
}
