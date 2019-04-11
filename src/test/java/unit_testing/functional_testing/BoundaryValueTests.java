package unit_testing.functional_testing;

import org.junit.Test;
import unit_testing.Program;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BoundaryValueTests {
    @Test
    public void N_11() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        int numberOfPerfectNumbers = Program.searchedNumbers(1, 3, 29, numbers);
        assertEquals(0, numberOfPerfectNumbers);
    }

    @Test
    public void N_12() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++)
            numbers.add(i);
        int numberOfPerfectNumbers = Program.searchedNumbers(100, 3, 29, numbers);
        assertEquals(2, numberOfPerfectNumbers);
    }

    @Test
    public void N_13() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 100; i = i + 20)
            numbers.add(i);
        int numberOfPerfectNumbers = Program.searchedNumbers(100, 3, 29, numbers);
        assertEquals(0, numberOfPerfectNumbers);
    }

    @Test
    public void N_21() {
        int numberOfPerfectNumbers = Program.searchedNumbers(0, 3, 29, null);
        assertEquals(-1, numberOfPerfectNumbers);
    }

    @Test
    public void N_22() {
        int numberOfPerfectNumbers = Program.searchedNumbers(-25, 3, 29, null);
        assertEquals(-1, numberOfPerfectNumbers);
    }

    @Test
    public void N_31() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 101; i++)
            numbers.add(i);
        int numberOfPerfectNumbers = Program.searchedNumbers(101, 3, 29, numbers);
        assertEquals(-1, numberOfPerfectNumbers);
    }

    @Test
    public void N_32() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 125; i++)
            numbers.add(i);
        int numberOfPerfectNumbers = Program.searchedNumbers(125, 3, 29, numbers);
        assertEquals(-1, numberOfPerfectNumbers);
    }

    @Test
    public void S_11() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(7);
        numbers.add(28);
        numbers.add(4);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, 0, 1, numbers);
        assertEquals(0, numberOfPerfectNumbers);
    }

    @Test
    public void S_12() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(7);
        numbers.add(28);
        numbers.add(4);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, 3, 8, numbers);
        assertEquals(1, numberOfPerfectNumbers);
    }

    @Test
    public void S_21() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(7);
        numbers.add(28);
        numbers.add(4);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, 1, 0, numbers);
        assertEquals(-1, numberOfPerfectNumbers);
    }

    @Test
    public void S_22() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(7);
        numbers.add(28);
        numbers.add(4);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, 8, 3, numbers);
        assertEquals(-1, numberOfPerfectNumbers);
    }

    @Test
    public void S_31() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(7);
        numbers.add(28);
        numbers.add(4);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, -1, 8, numbers);
        assertEquals(-1, numberOfPerfectNumbers);
    }

    @Test
    public void S_32() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(7);
        numbers.add(28);
        numbers.add(4);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, -7, 8, numbers);
        assertEquals(-1, numberOfPerfectNumbers);
    }

    @Test
    public void S_41() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(7);
        numbers.add(28);
        numbers.add(4);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, 3, -1, numbers);
        assertEquals(-1, numberOfPerfectNumbers);
    }

    @Test
    public void S_42() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(7);
        numbers.add(28);
        numbers.add(4);
        int numberOfPerfectNumbers = Program.searchedNumbers(5, 3, -9, numbers);
        assertEquals(-1, numberOfPerfectNumbers);
    }
}
