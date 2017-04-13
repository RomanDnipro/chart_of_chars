import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Getting the string from user,
         * copying chars from it to Characters array
         */
        System.out.println("Enter any String do you want:");
        char[] chars = new Scanner(System.in).nextLine().toCharArray();
//        Character[] characters = new Character[chars.length];
//        for (int i = 0; i < characters.length; i++) {
//            characters[i] = (Character) chars[i];
//        }

        /**
         * Creating the map<>.
         * Filling the value of the map according by key
         */
        Map<Character,Integer> map = new HashMap<>();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println("Quantity of characters:");
        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + " : "
                    + entry.getValue());
        }

    }
}
