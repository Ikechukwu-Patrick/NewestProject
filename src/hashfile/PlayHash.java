package hashfile;

import java.util.HashMap;

public class PlayHash {
    public static void main(String[] args){
        HashMap<String,String> postalCodes = new HashMap<>();
        postalCodes.put("0023", "New York");
        postalCodes.put("0033", "Canada");
        postalCodes.put("0043", "Germany");
        postalCodes.put("0053", "United Kingdom");
        postalCodes.put("0063", "France");
        postalCodes.put("0073", "Spain");
        postalCodes.put("0083", "Italy");
        postalCodes.put("0093", "Japan");
        postalCodes.put("0103", "Australia");
        System.out.println(postalCodes.get("0023"));
        System.out.println(postalCodes.get("0033"));
        System.out.println(postalCodes.get("0043"));
        System.out.println(postalCodes.get("0053"));
        System.out.println(postalCodes.get("0063"));
        System.out.println(postalCodes.get("0073"));
        System.out.println(postalCodes.get("0083"));
        System.out.println(postalCodes.get("0093"));
        System.out.println(postalCodes.get("0103"));
        System.out.println(postalCodes.get("002"));

    }
}
