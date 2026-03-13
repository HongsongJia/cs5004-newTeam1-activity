import org.junit.jupiter.api.Test;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Description：A test for SyntaxValid solution question
 *
 * @author Yikang Liu(Richard)
 * @source HackerRank (https://www.hackerrank.com/challenges/pattern-syntax-checker/problem)
 * @version  CS5004 Object-oriented programming
 */

class SyntaxValidTest {

    @Test
    void testValidRegex() {
        // These should not throw any exception
        assertDoesNotThrow(() -> Pattern.compile("([A-Z])(.+)"));
        assertDoesNotThrow(() -> Pattern.compile("[a-z]"));
    }

    @Test
    @SuppressWarnings("all")
    void testInvalidRegex() {
        // These should throw PatternSyntaxException
        assertThrows(PatternSyntaxException.class, () -> Pattern.compile("[AZ[a-z](a-z)"));
        assertThrows(PatternSyntaxException.class, () -> Pattern.compile("batcatpat(nat"));
    }

    @Test
    void testEdgeCases() {
        // Empty string is a valid regex (matches everything/nothing)
        assertDoesNotThrow(() -> Pattern.compile(""));
    }
}