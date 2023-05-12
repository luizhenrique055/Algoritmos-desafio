public class lastwordLenght {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Dayz aaa"));
    }

    public static int lengthOfLastWord(String s) {
        int contLenght = 0;
        s = s.trim();

        if (s.length() - 1 == 0) {
            return 1;
        }

        System.out.println(s);

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) != ' ') {
                contLenght++;
            } else {
                break;
            }
        }

        return contLenght;

    }
}