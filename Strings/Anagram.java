import java.util.*;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAna = true;
        int i = 0;
        if (arr1.length == arr2.length) {
            while (arr1.length > i) {
                if (arr1[i] != arr2[i]) {
                    isAna = false;
                }
                i++;
            }
        } else {
            isAna = false;
        }
        return isAna;
    }

    public static void main(String args[]) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}