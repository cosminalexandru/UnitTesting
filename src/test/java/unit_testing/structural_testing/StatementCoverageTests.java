package unit_testing.structural_testing;

import org.junit.Test;
import unit_testing.Program;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StatementCoverageTests {

    @Test
    public void SC1() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(7);
        numbers.add(28);
        numbers.add(30);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, 3, 29, numbers);
        assertEquals(2, numberOfPerfectNumbers);
    }

    @Test
    public void SC2() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(13);
        numbers.add(7);
        numbers.add(19);
        numbers.add(30);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, 3, 29, numbers);
        assertEquals(0, numberOfPerfectNumbers);
    }

    @Test
    public void SC3() {
        int numberOfPerfectNumbers = Program.searchedNumbers(102, 3, 29, new ArrayList<Integer>());
        assertEquals(-1, numberOfPerfectNumbers);
    }
}

