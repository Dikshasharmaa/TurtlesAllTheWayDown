public class GCD {
    //greatest common divisor(gcd)
    // for positive integers
    //example: gcd(120,68) = 4
    //If p > q, the gcd of p and q is the same as the gcd of q and p % q.
    public static int divisor(int n1,int n2){
        if(n2 !=0){
            return divisor(n2,n1%n2);
        }
        else
            return n1;
    }
//    public static void main(String args[]){
//        System.out.println(divisor(366,60));
//
//    }


}
