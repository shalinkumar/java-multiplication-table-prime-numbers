package interview;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> GetPrimeNumbers(int num) {
        List<Integer> listOfPrime = new ArrayList<>();
        int count = 2;
        // num + 1 : Prime number creation
        while (listOfPrime.size() < num + 1) {
            if (IsPrimeNumber(count))
                listOfPrime.add(count);
            count++;
        }
        return listOfPrime;
    }

    public static List<Integer> PrintGrid(int num) {
        List<Integer> gridList = new ArrayList<>();
        if (CheckValidNumber(num)) {
            List<Integer> rows = GetPrimeNumbers(num);
            List<Integer> columns = rows;
            System.out.print("     ");
            for (int columnNum : columns) {
                System.out.printf(" %d ", columnNum);
            }
            System.out.print("\n\n");
            for (int rowNum : rows) {
                System.out.printf("%d| ", rowNum);
                for (int columnNum : columns) {
                    System.out.printf(" %d ", columnNum * rowNum);
                    gridList.add(columnNum * rowNum);
                }
                System.out.print("\n\n");
            }
        }
        return gridList;
    }

    public static boolean CheckValidNumber(int num) {
        return num > 0;
    }

    public static boolean IsPrimeNumber(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}


