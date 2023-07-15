public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
        // Convert both strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Remove any spaces and punctuation from both strings
        str1 = str1.replaceAll("[^a-z]", "");
        str2 = str2.replaceAll("[^a-z]", "");

        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create character frequency arrays
        int[] frequency1 = new int[26];
        int[] frequency2 = new int[26];

        // Count the frequency of each character in the first string
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            frequency1[c - 'a']++;
        }

        // Count the frequency of each character in the second string
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            frequency2[c - 'a']++;
        }

        // Check if the character frequencies are equal
        for (int i = 0; i < 26; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(areAnagrams(str1, str2)); // Output: true

        str1 = "restful";
        str2 = "fluster";
        System.out.println(areAnagrams(str1, str2)); // Output: true
    }
}