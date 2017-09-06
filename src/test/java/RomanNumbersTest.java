import domain.RomanNumbersConvertor;
import org.junit.Assert;
import org.junit.Test;

public class RomanNumbersTest {
    @Test
    public void should_return_I_when_input1() throws Exception {
        final RomanNumbersConvertor romanNumbersConvertor = new RomanNumbersConvertor();
        Assert.assertEquals("I", romanNumbersConvertor.convertNumber(1));
    }
}
