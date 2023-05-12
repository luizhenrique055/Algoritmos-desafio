class isPalindrome
 {
    public boolean ispalindrome(int x) {
        
        String number = Integer.toString(x);
        String reverseNumber = new StringBuilder(number).reverse().toString();
        boolean palindrome = false;

        if(number.indexOf("-") == -1){
            
            if(number.equals(reverseNumber)){
                return palindrome = true;
            } else{
                return palindrome;
            }

        } else{
            return palindrome;
        }

    }
}

// leetcode is a palindrome number