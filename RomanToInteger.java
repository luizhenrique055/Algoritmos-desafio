class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));

    }

    static int romanToInt(String s) {

        int romanStringLength = s.length();
        char charOfPosition;
        char charAuxOfPosition;
        int totalOfRomanValue = 0;
        

        for (int i = 1; i < romanStringLength - 1; i+=2) {      
                 
            charOfPosition = s.charAt(i);
            charAuxOfPosition = s.charAt(i - 1);

            switch (charOfPosition) {
                case 'I':

                    if (charAuxOfPosition == 'V') {
                        totalOfRomanValue += 4;
                        i += 1;
                    } else if (charAuxOfPosition == 'X') {
                        totalOfRomanValue += 9;
                        i += 1;
                    } else {
                        totalOfRomanValue += 1;
                    }

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
                    break;
                case 'D':
                    totalOfRomanValue += 500;
                    break;
                case 'M':
                    totalOfRomanValue += 1000;
                    break;

            }

        }

        return totalOfRomanValue;

    }

}