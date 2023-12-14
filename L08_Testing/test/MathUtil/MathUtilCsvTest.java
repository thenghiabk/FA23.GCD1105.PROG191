package L09_Testing.MathUtil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MathUtilCsvTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/L09_Testing/MathUtil/MathUtil_sum_dataTest.csv", numLinesToSkip = 1)
    void testSum(int a, int b, int result) {
        MathUtil mathUtil = new MathUtil();
        Assertions.assertEquals(mathUtil.sum(a, b), result);
    }
}
