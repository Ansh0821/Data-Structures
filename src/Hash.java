import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int[] hash = new int[13];
//        for (int i = 0; i < n; i++) {
//            hash[arr[i]] += 1;
//        }
//
//        int q = sc.nextInt();
//        while (q > 0){
//            int number = sc.nextInt();
//            System.out.println(hash[number]);
//            q--;
//        }

//        String s = sc.next();
//
//        int[] hash = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            hash[s.charAt(i) - 'a']++;
//        }
//        int q = sc.nextInt();
//        while (q > 0){
//            char c = sc.next().charAt(0);
//            System.out.print(hash[c - 'a']);
//            q--;
//        }
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;
            if (mpp.containsKey(key)) freq = mpp.get(key);
            freq++;
            mpp.put(key, freq);
        }

        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
        }

        int q = sc.nextInt();
        while (q-- > 0) {
            int number;
            number = sc.nextInt();
            if (mpp.containsKey(number)) System.out.println(mpp.get(number));
            else System.out.println(0);
        }
    }
}
