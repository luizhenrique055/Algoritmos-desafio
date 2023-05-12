class powleetCode {

    public static void main(String[] args) {
       System.out.println(myPow(2,5)); 
    }

    public static double myPow(double x, int n) {

        if(n == 0){
            return 1;
        }
        
        return myPow(x, n-1) * x;

    }

}