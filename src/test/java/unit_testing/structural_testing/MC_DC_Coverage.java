package unit_testing.structural_testing;

import org.junit.Test;
import unit_testing.Program;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MC_DC_Coverage {

    @Test
    public void CC1() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(6);
        numbers.add(28);
        numbers.add(30);
        numbers.add(7);
        assertEquals(-1, Program.searchedNumbers(5, -5, 29, numbers));
        assertEquals(-1, Program.searchedNumbers(5, 2, -1, numbers));
        assertEquals(-1, Program.searchedNumbers(5, 4, 4, numbers));
        assertEquals(-1, Program.searchedNumbers(0, 4, 29, numbers));
        assertEquals(-1, Program.searchedNumbers(107, 0, 29, numbers));
    }
}
