import domain.RomanNumbersConvertor;
import org.junit.Assert;
import org.junit.Test;

public class RomanNumbersTest {
    @Test
    public void should_return_I_when_input1() throws Exception {
        final RomanNumbersConvertor romanNumbersConvertor = new RomanNumbersConvertor();
        Assert.assertEquals("I", romanNumbersConvertor.convertNumber(1));
    }

    @Test
    public void should_return_V_when_input5() throws Exception {
        final RomanNumbersConvertor romanNumbersConvertor = new RomanNumbersConvertor();
        Assert.assertEquals("V", romanNumbersConvertor.convertNumber(5));
    }

    @Test
    public void should_return_empty_when_input0() throws Exception {
        final RomanNumbersConvertor romanNumbersConvertor = new RomanNumbersConvertor();
        Assert.assertEquals("", romanNumbersConvertor.convertNumber(0));
    }

    @Test
    public void should_return_X_when_input10() throws Exception {
        final RomanNumbersConvertor romanNumbersConvertor = new RomanNumbersConvertor();
        Assert.assertEquals("X", romanNumbersConvertor.convertNumber(10));
    }

    @Test
    public void should_return_L_when_input50() throws Exception {
        final RomanNumbersConvertor romanNumbersConvertor = new RomanNumbersConvertor();
        Assert.assertEquals("L", romanNumbersConvertor.convertNumber(50));
    }
    @Test
    public void should_return_C_when_input100() throws Exception {
        final RomanNumbersConvertor romanNumbersConvertor = new RomanNumbersConvertor();
        Assert.assertEquals("C", romanNumbersConvertor.convertNumber(100));
    }
    @Test
    public void should_return_D_when_input500() throws Exception {
        final RomanNumbersConvertor romanNumbersConvertor = new RomanNumbersConvertor();
        Assert.assertEquals("D", romanNumbersConvertor.convertNumber(500));
    }
}
