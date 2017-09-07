import domain.RomanNumbersConvertor;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RmanNumberFeature {

    @Test
    public void should_check_all_roman_numbers_between_1_to_500() throws Exception {
        URL fileName = RomanNumbersTest.class.getResource("romannumber.txt");
        final RomanNumbersConvertor romanNumbersConvertor = new RomanNumbersConvertor();
        try (Stream<String> stream = Files.lines(Paths.get(fileName.toURI()))) {

            final List<String> testCases = stream.collect(Collectors.toList());
            for (String testCase : testCases) {
                String[] arabRomanNumber = testCase.split("=");
                String arabNumber = arabRomanNumber[0];
                String romanNumber = arabRomanNumber[1];
                String romanNumberCalculated = romanNumbersConvertor.convertNumber(Integer.parseInt(arabNumber));
                Assert.assertEquals(romanNumber, romanNumberCalculated);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
