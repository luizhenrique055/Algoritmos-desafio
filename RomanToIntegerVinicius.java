class Solution {

    public static void main(String[] args) {
        System.out.println(romanToInt(args[0]));

    }

    static int romanToInt(String s) {

        int romanStringLength = s.length();
        char charOfPosition;
        char charAuxOfPosition;
        int totalOfRomanValue = 0;
        boolean x = false;

        for (int i = 0; i < romanStringLength - 1; i++) {

            charOfPosition = s.charAt(i);
            charAuxOfPosition = s.charAt(i + 1);

            if ((charAuxOfPosition == 'X' && charOfPosition == 'I')) {
                totalOfRomanValue += 9;
                i++;

            } else if ((charAuxOfPosition == 'V' && charOfPosition == 'I')) {
                totalOfRomanValue += 4;
                System.out.println("4");
                i++;
            } else if ((charAuxOfPosition == 'L' && charOfPosition == 'X')) {
                totalOfRomanValue += 40;
                i++;
            } else if ((charAuxOfPosition == 'C' && charOfPosition == 'X')) {
                totalOfRomanValue += 90;
                System.out.println("90");
                i++;
            } else if ((charAuxOfPosition == 'D' && charOfPosition == 'C')) {
                totalOfRomanValue += 400;
                i++;
            } else if ((charAuxOfPosition == 'M' && charOfPosition == 'C')) {
                totalOfRomanValue += 900;
                i++;
                System.out.println("900");
            } else {
                totalOfRomanValue += (charToInt(charOfPosition));
            }

            if (i == romanStringLength - 1) {
                x = true;
            }
        }
        if (x) {
            return totalOfRomanValue;
        }

        return totalOfRomanValue + charToInt(s.charAt(romanStringLength - 1));

    }

    public static int charToInt(char A) {
        int totalOfRomanValue = 0;
        switch (A) {
            case 'I':
                totalOfRomanValue += 1;
                break;
            case 'V':
                totalOfRomanValue += 5;
                break;
            case 'X':
                totalOfRomanValue += 10;
                break;
            case 'L':
                totalOfRomanValue += 50;
                break;
            case 'C':
                totalOfRomanValue += 100;
                System.out.println("100");
                break;
            case 'D':
                totalOfRomanValue += 500;
                break;
            case 'M':
                totalOfRomanValue += 1000;
                System.out.println("1000");
                break;
            default:
                break;

        }
        return totalOfRomanValue;
    }
}