package unit_testing.structural_testing;

import org.junit.Test;
import unit_testing.Program;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DecisionCoverageTests {
    @Test
    public void DC1() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(13);
        numbers.add(7);
        numbers.add(19);
        numbers.add(30);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, 3, 29, numbers);
        assertEquals(0, numberOfPerfectNumbers);
    }
}
