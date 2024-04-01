import java.time.Duration;
import java.time.Instant;

public class GCD {
    //greatest common divisor(gcd)
    // for positive integers
    //example: gcd(120,68) = 4
    //If p > q, the gcd of p and q is the same as the gcd of q and p % q.

    public static int gcd(int n1,int n2){
        if(n2 !=0){
            return gcd(n2,n1%n2);
        }
        else
            return n1;
    }

// Non recursive implementation
    public static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }


        public static void main(String args[]){
            Instant startGcd = Instant.now();
            gcd(120,68);
            Instant finishGcd = Instant.now();
            long timeElapsedGcd = Duration.between(startGcd, finishGcd).toNanos();
            System.out.println("Time elapsed for Gcd1(recursion) : "+timeElapsedGcd);

            Instant startGcd2 = Instant.now();
            gcd2(120,68);
            Instant finishGcd2 = Instant.now();
            long timeElapsedGcd2 = Duration.between(startGcd2, finishGcd2).toNanos();
            System.out.println("Time elapsed for Gcd2(non-recursive) : "+timeElapsedGcd2);

    }


}
