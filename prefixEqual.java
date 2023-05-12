import java.util.Arrays;

public class prefixEqual {

    public static void main(String[] args) {
        String[] teste = new String[] { "googleaaaaa", "gooo", "gooaa" };
       System.out.println(longestCommonPrefix(teste));
    }



    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int strsLength = strs.length;
        String firstChar = strs[0];
        String lastChar = strs[strsLength - 1];
        int count = 0;

        if(strs == null || strs.length == 0){
           return "";
        }

        while (count < strsLength) {
            if (firstChar.charAt(count) == lastChar.charAt(count)) {
                count++;

            } else {
                break;
            }
        }

        if (count == 0) {
            return "";
        } else {
            return firstChar.substring(0, count);
        }

    }

}
