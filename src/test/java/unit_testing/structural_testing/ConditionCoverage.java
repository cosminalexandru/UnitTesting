package unit_testing.structural_testing;

import org.junit.Test;
import unit_testing.Program;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConditionCoverage {

    @Test
    public void CC1() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(13);
        numbers.add(7);
        numbers.add(28);
        numbers.add(30);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, 3, 29, numbers);
        assertEquals(1, numberOfPerfectNumbers);
    }
}
