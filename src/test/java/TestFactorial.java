import org.junit.Assert;
import org.junit.Test;

public class TestFactorial {
    @Test
    public void testFactorial(){
        int n = 5;
        Factorial fact =new Factorial();
        Long expected = 120L;
        Long actual = fact.factorial(n);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testFactorial1(){
        int n = 9;
        Factorial fact =new Factorial();
        Long expected = 362880L;
        Long actual = fact.factorial(n);
        Assert.assertEquals(expected,actual);

    }



}
