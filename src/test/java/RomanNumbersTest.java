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
}
