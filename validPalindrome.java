public class validPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {

        String str1 = s;

        str1 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String stringReverse = new StringBuilder(str1).reverse().toString();

        System.out.println("Visualizacao\n"+ str1);
        System.out.println(stringReverse + "\nResultado");

        if (str1.equals(stringReverse)) {
            return true;
        } else {
            return false;
        }

    }

}
