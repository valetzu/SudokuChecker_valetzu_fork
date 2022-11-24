import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
SudokuVerifier v = new SudokuVerifier();

	@Test
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", a, 0);
	}

	@Test
	public void testIncorrectString() {
		int a = v.verify(i);
		assertEquals("incorrect string", a, -2);
		
	}
	
	@Test
	public void testLowerBoundaryValuesInvalidFullSolution() {
		//contains invalid lower boundary value
		String test = "017369825632158947958724316825437169791586432346912758289643571573291684164875293";
		int a = v.verify(test);
		assertEquals("A cell in a Sudoku game can only store positive digits, i.e 1...9.", -1, a);
	}
	
	@Test
	public void testUpperBoundaryValuesInvalidFullSolution() {
		//Upper boundary value (valid)
		String test = "1023456789912345678891234567789123456678912345567891234456789123345678912234567891";
		int a = v.verify(test);
		assertEquals("A cell in a Sudoku game can only store positive digits, i.e 1...9.", -1, a);
	}
	
	@Test
	public void testLowerBoundaryValueInvalidSingleDigitSolution() {
		//Upper boundary value (valid)
		String test = "0";
		int a = v.verify(test);
		assertEquals("A cell in a Sudoku game can only store positive digits, i.e 1...9.", -1, a);
	}
	
	@Test
	public void testSolutionWithInvalidNonIntegerChar() {
		//Upper boundary value (valid)
		String test = " 123123789912345678891234567789123456678912345567891234456789123345678912234567891";
		int a = v.verify(test);
		assertEquals("A cell in a Sudoku game can only store positive digits, i.e 1...9.", -1, a);
	}
	
	@Test
	public void testNegativeInteger() {
		//Upper boundary value (valid)
		String test = "-123456789912345678891234567789123456678912345567891234456789123345678912234567891";
		int a = v.verify(test);
		assertEquals("A cell in a Sudoku game can only store positive digits, i.e 1...9.", -1, a);
	}
	
	@Test
	public void testInvalidSingleDigitSolution() {
		//Upper boundary value (valid)
		String test = "1";
		int a = v.verify(test);
		assertEquals("A cell in a Sudoku game can only store positive digits, i.e 1...9.", -1, a);
	}
	
	@Test
	public void testInvalidTwoDigitSolution() {
		//Upper boundary value (valid)
		String test = "10";
		int a = v.verify(test);
		assertEquals("A cell in a Sudoku game can only store positive digits, i.e 1...9.", -1, a);
	}
	
	
	
	
	
	
	
}
