package unit_testing;

import java.util.ArrayList;

public class Program {

    public static int searchedNumbers(int n, int x, int y, ArrayList<Integer> numbers) {
        int numberOfOccurrences = 0;
        if (x < 0 || y < 0 || x >= y || n < 1 || n > 100)
            return -1;

        for (Integer number : numbers) {
            if (number >= x && number <= y) {
                int sum = 1;

                for (int d = 2; d <= number / 2; d++) {
                    if (number % d == 0) {
                        sum += d;
                    }
                }
                if (sum == number) {
                    ++numberOfOccurrences;
                }
            }
        }
        return numberOfOccurrences;
    }
}
