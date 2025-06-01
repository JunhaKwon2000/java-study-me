package map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<>();

        map.put("Gundam Exia", "Setusna");
        map.put("Wing Gundam Custom", "Unknwon");
        map.put("Unicorn Gundam", "Barrage");
        map.put("GQuuuuuuX", "Amate Yuzriha");

        // getting value corresponding to key
        System.out.println(map.get("GQuuuuuuX"));
        System.out.println();

        // getting set of key/value
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println();

        // iterating over keyset
        for (String keys : map.keySet()) System.out.println(keys);
        System.out.println();

        // iterating over entries(recommended)
        for (Map.Entry<String, String> entries : map.entrySet()) {
            System.out.println(entries.getKey() + " - Pilot: " + entries.getValue());
        }
        System.out.println();

        // Duplicate keys is not allowed -> overrides the valeu if entry is put with a exsiting key
        map.put("GQuuuuuuX", "Nyaan");
        for (Map.Entry<String, String> entries : map.entrySet()) {
            System.out.println(entries.getKey() + " - Pilot: " + entries.getValue());
        }

        // treemap : automatic arrange (String - in AtoZ order, Integer - in numeric order)
        // linkedhashmap : the order matters
    }

}
