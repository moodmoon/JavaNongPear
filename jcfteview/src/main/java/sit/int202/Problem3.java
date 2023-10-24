package sit.int202;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Problem3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        Scanner sc = new Scanner(file);

        Map<String, List<Integer>> map = new HashMap<>(125,0.5F);

        // Map<String, List<Integer>> map = new TreeMap<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line," .,?()");
            int wordIndex = 0;
            while (stk.hasMoreElements()) {
                String word = stk.nextToken();
                if (map.get(word) == null) {
                    map.put(word, new LinkedList<Integer>());
                }
                map.get(word).add(++wordIndex);
            }
        }
        sc.close();
        for ( Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "("+ entry.getValue().size()+ "): ");
            for (Integer position : entry.getValue()){
                System.out.print("@"+ position + "  ");
            }
            System.out.println();
        }
    }
}
