public class Factorial {
    public static Long factorial(int n){
        if(n == 1)
            return 1L;
        return n* factorial(n-1);
    }

//    public static void main(String args[]){
//        System.out.println(factorial(5));
//    }
}
