import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EquivalencePartitioningTests {

    @Test
    public void C_11() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(7);
        numbers.add(28);
        numbers.add(4);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, 3, 29, numbers);
        assertEquals(2, numberOfPerfectNumbers);
    }

    @Test
    public void C_12() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(7);
        numbers.add(28);
        numbers.add(4);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, 15, 9, numbers);
        assertEquals(-1, numberOfPerfectNumbers);
    }

    @Test
    public void C_13() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        int numberOfPerfectNumbers = Program.searchedNumbers(10, -5, 0, numbers);
        assertEquals(-1, numberOfPerfectNumbers);
    }

    @Test
    public void C_14() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        int numberOfPerfectNumbers = Program.searchedNumbers(10, 0, -19, numbers);
        assertEquals(-1, numberOfPerfectNumbers);
    }

    @Test
    public void C_2() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        int numberOfPerfectNumbers = Program.searchedNumbers(0, 3, 29, numbers);
        assertEquals(-1, numberOfPerfectNumbers);
    }

    @Test
    public void C_3() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, 105, 29, numbers);
        assertEquals(-1, numberOfPerfectNumbers);
    }
}

