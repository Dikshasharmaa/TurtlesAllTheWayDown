import org.junit.Assert;
import org.junit.Test;

public class testGcd {
    @Test
    public void testGcd(){
        int n1 = 366;
        int n2 = 60;
        GCD gcd1 = new GCD();
        int expected = 6;
        int actual = gcd1.gcd(n1,n2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGcd2(){
        int n1 = 120;
        int n2 = 68;
        GCD gcd1 = new GCD();
        int expected = 4;
        int actual = gcd1.gcd(n1,n2);
        Assert.assertEquals(expected,actual);
    }
}
