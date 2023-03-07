import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FunkyCalculatorTest  {

    FunkyCalculator funkyCalculator = new FunkyCalculator();

    @Test
    void add() {
        assertEquals(10.0, funkyCalculator.add(3.0, 7.0));
    }

    @Test
    void subtract() {

        assertEquals(2.0, funkyCalculator.subtract(4.0, 2.0));

    }

    @Test
    void getDifference_withFirstNumberBigger() {
        assertEquals(4, funkyCalculator.getDifference(8, 4));
    }

    @Test
    void getDifference_withSecondNumberBigger() {
        assertEquals(4, funkyCalculator.getDifference(4, 8));
    }

    @Test
    void divideIntegers_shouldReturnDouble() {
        assertEquals(1.5, funkyCalculator.divideWithOneDecimalPointRoundingDown(6, 4));
    }

    @Test
    void divideIntegers_shouldReturnOneDecimalPoint() {
        assertEquals(1.2, funkyCalculator.divideWithOneDecimalPointRoundingDown(11, 9));
    }

    @Test
    void divideIntegers_shouldRoundDown() {
        assertEquals(1.1, funkyCalculator.divideWithOneDecimalPointRoundingDown(7, 6));
    }
    @Test
    void divideWithTwoDecimalPointsRoundingUp() {
        assertEquals(0.67, funkyCalculator.divideWithTwoDecimalPointsRoundingUp(2, 3));
    }

    @Test
    void divideWithTwoDecimalPointsRoundingUp_1() {
        assertEquals(23.8, funkyCalculator.divideWithTwoDecimalPointsRoundingUp(119, 5));
    }

    @Test
    void divideWithTwoDecimalPointsRoundingUp_2() {
        assertEquals(6.84, funkyCalculator.divideWithTwoDecimalPointsRoundingUp(41, 6));
    }

    @Test
    void isEven_testEvenNumber() {
        assertTrue(funkyCalculator.isEven(10));
    }

    @Test
    void isEven_testOddNumber() {
        assertFalse(funkyCalculator.isEven(11));
    }

    @Test
    void isOdd_testOddNumber() {
        assertTrue(funkyCalculator.isOdd(11));
    }


    @Test
    void getFirstRow_asymmetricMatrix() {
        int[][] testMatrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};

        assertArrayEquals(new int[]{1, 2, 3, 4}, funkyCalculator.getFirstRow(testMatrix));
    }

    @Test
    void getFirstRow_asymmetricMatrix_1() {
        int[][] testMatrix = new int[][]{
                {1, 2},
                {5, 6},
                {4, 5},
                {9, 9}

        };

        assertArrayEquals(new int[]{1, 2}, funkyCalculator.getFirstRow(testMatrix));
    }

    @Test
    void getLastRow_asymmetricMatrix() {
        int[][] testMatrix = new int[][]{
                {1, 2},
                {5, 6},
                {4, 5},
                {9, 9}

        };
        assertArrayEquals(new int[]{9, 9}, funkyCalculator.getLastRow(testMatrix));
    }

    @Test
    void getSumOfFirstAndLastRowTest() {
        int[][] testMatrix = new int[][]{
                {1, 2},
                {5, 6},
                {4, 5},
                {9, 9}

        };
        assertArrayEquals(new int[]{10, 11}, funkyCalculator.getSumOfFirstAndLastRow(testMatrix));
    }

    @Test
    void getLeftColumnTest() {
        int[][] testMatrix = new int[][]{
                {1, 2},
                {5, 6},
                {4, 5},
                {9, 9}
        };

        assertArrayEquals(new int[]{1, 5, 4, 9}, funkyCalculator.getLeftColumn(testMatrix));
    }

    @Test
    void getRightColumnTest() {
        int[][] testMatrix = new int[][]{
                {1, 2},
                {5, 6},
                {4, 5},
                {9, 9}
        };

        assertArrayEquals(new int[]{2, 6, 5, 9}, funkyCalculator.getRightColumn(testMatrix));
    }

    @Test
    void getSumOfLeftAndRightColumn() {

        int[][] testMatrix = new int[][]{
                {1, 2, 3},
                {5, 6, 4},
                {4, 5, 5},
                {9, 9, 6}
        };
        assertArrayEquals(new int[]{4,9,9,15}, funkyCalculator.getSumOfLeftAndRightColumn(testMatrix));
    }

}