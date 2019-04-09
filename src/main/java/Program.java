import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Program {

    private int n, x, y;
    private ArrayList<Integer> numbers = new ArrayList<Integer>();

    Program() {
        try {
            Scanner sc = new Scanner(new File("date.txt"));
            this.x = sc.nextInt();
            this.y = sc.nextInt();
            this.n = sc.nextInt();

            for (int i = 0; i < n; ++i) {
                int number = sc.nextInt();
                this.numbers.add(number);
            }

        } catch (FileNotFoundException var8) {
            System.out.println("Fisierul nu a fost gasit");
        }
    }

    static int searchedNumbers(int n, int x, int y, ArrayList<Integer> numbers) {
        int numberOfOccurrences = 0;
        if (x < 0 || y < 0)
            return -1;
        if (x >= y)
            return -1;
        if (n < 1 || n > 100)
            return -1;


        for (Integer number : numbers) {
            if (number >= x && number <= y) {
                int sum = 1;

                for (int d = 2; d <= number / 2; ++d) {
                    if (number % d == 0) {
                        sum += d;
                    }
                }

                if (sum == number) {
                    ++numberOfOccurrences;
                    System.out.println(number);
                }
            }
        }
        return numberOfOccurrences;
    }
}
