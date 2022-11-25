import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountingOccurrence {
    public static void main (String[] args) {
        String text = "Over time, computer engineers take advantage of each other's work and invent algorithms for new things. Algorithms combine with other algorithms to utilize the results of other algorithms, in turn producing results for even more algorithms.";

        text = text.replaceAll("\\p{P}", "");
        text = text.toLowerCase();
        String[] wordArr = text.split(" ");

        Map<String, Integer> wordCount = new TreeMap<>();

        for (String word : wordArr) {
            if(!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
            }else {
                wordCount.put(word, wordCount.get(word)+ 1);
            }
        }
        Set<String> set = wordCount.keySet();
        for (String key : set) {
            System.out.println(key + " " + wordCount.get(key));
        }
    }
}
