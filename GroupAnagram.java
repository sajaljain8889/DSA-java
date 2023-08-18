import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String argu[]) {

        String str[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> ans = groupAnagram(str);
        for (List<String> a : ans) {
            System.out.println(a);
        }

    }

    private static List<List<String>> groupAnagram(String[] xyz) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : xyz) {
            // Sort the characters in the current string
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            // Check if the sorted string is already present in the map
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            System.out.println(map.get(sortedStr) + "  -- ");
            // Add the current string to the list of anagrams for the sorted string
            map.get(sortedStr).add(str);
        }

        // Return the list of lists containing grouped anagrams
        return new ArrayList<>(map.values());

        // Map<String, List<String>> anagramGroups = new HashMap<>();

        // for (String x : str) {
        // String sortedStr = sortedcharArray(x);

        // if (!anagramGroups.containsKey(sortedStr)) {
        // anagramGroups.put(sortedStr, new ArrayList<>());
        // }

        // anagramGroups.get(sortedStr).add(x);
        // }

        // for (List<String> y : anagramGroups.values()) {
        // System.out.println(y + " -- ");
        // }

        // return new ArrayList<>(anagramGroups.values());
    }

    // private static String sortedcharArray(String string) {
    // char[] result = string.toCharArray();
    // Arrays.sort(result);

    // return result.toString();
    // }
}
