
import java.util.ArrayList;
import java.util.HashMap;

class VowelCount {
    HashMap<String, Integer> vovelMap;

    public void Vowels(String text) {
        // vovelMap = new HashMap<String, Integer>();
        // vovelMap.put("a", 1);
        // vovelMap.put("e", 1);
        // vovelMap.put("i", 1);
        // vovelMap.put("o", 1);
        // vovelMap.put("u", 1);

        // int count = 0;
        // for (int i = 0; i < text.length(); i++) {
        //     String ch = (text.charAt(i) + "").toLowerCase();
        //     if (vovelMap.get(ch) != null) {
        //         count++;
        //     }
        // }

        int count = text.replaceAll("(?i)[^aeiou]", "").length();

        System.out.println(count);

        ArrayList<String> g = new ArrayList<String>();
        
    }
}