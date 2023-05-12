class validparentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{[[}"));
    }

    public static boolean isValid(String s) {

        int sLength = s.length();
        char auxCharFirst;
        char auxCharLast =' ';
        boolean validate = true;

        if (isOdd(sLength) || sLength <= 0) {
            return false;
        }

        for (int i = 0; i < sLength / 2; i++) {

            // System.out.println("For numero: " + i);
            auxCharFirst = s.charAt(i);
            // System.out.println("Letra inicial: "  + auxCharFirst);

            if(!isFirstCharValid(auxCharFirst)){
                return false; 
            }

            for (int j = sLength - 1; j >= sLength/2; j--) {
                // System.out.println("For DECRESCENTE numero: " + j);
                auxCharLast = s.charAt(j);
                // System.out.println("Letra FINAL: "  + auxCharLast);
            }

            if(auxCharFirst == parenthInverted(auxCharLast) ){
                validate = true;
            } else{
                validate = false;
            }

        }

        return validate;

    }

    public static boolean isOdd(int sLength) {
        if (sLength % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isFirstCharValid(char auxCharFirst) {
        if (auxCharFirst == ')' || auxCharFirst == '}' || auxCharFirst == ']') {
            return false;
        }
        return true;
    }

    public static char parenthInverted(char lastChar) {
        switch (lastChar) {
            case ')':
                return '(';
            case '}':
                return '{';
            case ']':
                return '[';
            default:
                return '0';
        }
    }

}