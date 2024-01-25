package interview;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

public class SolutionTest {
	@Test
	public void IsPrimeNumber_ShouldReturn_True() {
		int num = 2;
		boolean expected = true;
		boolean actual = Solution.IsPrimeNumber(num);

		assertEquals(expected, actual);
	}

	@Test
	public void IsPrimeNumber_ShouldReturn_False() {
		int num = 1;
		boolean expected = false;
		boolean actual = Solution.IsPrimeNumber(num);

		assertEquals(expected, actual);
	}

	@Test
	public void CheckValidNumber_ShouldReturn_True() {
		int num = 1;
		boolean expected = true;
		boolean actual = Solution.CheckValidNumber(num);

		assertEquals(expected, actual);
	}

	@Test
	public void CheckValidNumber_ShouldReturn_False() {
		int num = -1;
		boolean expected = false;
		boolean actual = Solution.CheckValidNumber(num);

		assertEquals(expected, actual);
	}

	@Test
	public void PrintGrid_ShouldReturn_MultiplicationTables() {
		int num = 2;
		List<Integer> expected = new ArrayList<>();
		expected.add(4);
		expected.add(6);
		expected.add(10);
		expected.add(6);
		expected.add(9);
		expected.add(15);
		expected.add(10);
		expected.add(15);
		expected.add(25);

		List<Integer> actual = Solution.PrintGrid(num);

		assertEquals(expected, actual);
	}

	@Test
	public void GetPrimeNumbers_ShouldReturn_PrimeNumbers() {
		int num = 6;
		List<Integer> expected = new ArrayList<>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		
		List<Integer> actual = Solution.GetPrimeNumbers(num);

		assertEquals(expected, actual);
	}
}
