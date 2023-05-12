public class findIndexEquals {
    // Input: haystack = "sadbutsad", needle = "sad"
    // Output: 0
    // Explanation: "sad" occurs at index 0 and 6.
    // The first occurrence is at index 0, so we return 0.
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
        String teste = "sadbutsad";

        System.out.println(teste.indexOf("zz"));
        System.out.println(teste.indexOf("sad"));

    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle); // 🤷‍♀️ se ja tem n vou inventar
    }

}
