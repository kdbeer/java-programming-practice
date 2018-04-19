// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public String solution(String S, String C) {
        String[] parts = S.split(", ");
        String res = "";
        HashMap<String, Integer> emails = new HashMap<String, Integer>();

        for (int i = 0; i < parts.length; i++) {
            String name = parts[i];
            if (name.length() == 0) {
                continue;
            }

            String[] innerParts = name.split(" ");
            String first = innerParts[0].charAt(0) + "";
            first = first.toLowerCase();

            String last = innerParts[innerParts.length - 1];
            last = last.replaceAll("-", "").toLowerCase();

            String emailName = first + "." + last;

            Object count = emails.get(emailName);
            if (count == null) {
                emails.put(emailName, 1);
            } else {
                emails.put(emailName, (int)count + 1);
                emailName = emailName + ((int)count + 1);
            }
            
            String companyEmail = "@" + C.toLowerCase() + ".com";
            
            res += emailName + companyEmail;
            if (i != parts.length - 1) {
                res += ", ";
            }
        }

        return res;
        
    }
}
