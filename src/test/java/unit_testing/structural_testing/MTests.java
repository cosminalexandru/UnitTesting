package unit_testing.structural_testing;

import org.junit.Test;
import unit_testing.Program;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MTests {
    @Test
    public void numberEqualsWithX() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(6);
        numbers.add(28);
        numbers.add(30);
        numbers.add(7);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, 6, 29, numbers);
        assertEquals(2, numberOfPerfectNumbers);
    }

    @Test
    public void numberEqualsWithY() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(6);
        numbers.add(28);
        numbers.add(30);
        numbers.add(29);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, 3, 28, numbers);
        assertEquals(2, numberOfPerfectNumbers);
    }

    @Test
    public void numberEqualsWithXandY() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(28);
        numbers.add(30);
        numbers.add(29);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, 6, 28, numbers);
        assertEquals(2, numberOfPerfectNumbers);
    }

    @Test
    public void yEquals0() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(6);
        numbers.add(28);
        numbers.add(30);
        numbers.add(29);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, 3, 0, numbers);
        assertEquals(-1, numberOfPerfectNumbers);
    }
}
