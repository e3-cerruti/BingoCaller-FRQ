import org.junit.jupiter.api.BeforeEach;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class BingoCallerTest {

    public static final int CALLED_NUMBER = 50;
    private static final int UNCALLED_NUMBER = 35;
    private boolean[] numbersCalled;

    @BeforeEach
    void setUp() {
        BingoCaller caller = new BingoCaller();

        Field privateField = null;
        try {
            // Create Field object
            privateField = BingoCaller.class.getDeclaredField("numbersCalled");

            // Set the accessibility as true
            privateField.setAccessible(true);

            // Store the value of private field in variable
            numbersCalled = (boolean[]) privateField.get(null);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        numbersCalled[CALLED_NUMBER] = true;
    }

    @org.junit.jupiter.api.Test
    void hasBeenCalledIsTrue() {
        assertTrue(BingoCaller.hasBeenCalled(CALLED_NUMBER));
    }

    @org.junit.jupiter.api.Test
    void hasBeenCalledIsFalse() {
        assertFalse(BingoCaller.hasBeenCalled(UNCALLED_NUMBER));
    }

    @org.junit.jupiter.api.Test
    void getRandomNumberForB() {
        int number = BingoCaller.getRandomNumber("B");
        assertTrue( 1 <= number);
        assertTrue( 15 >= number);
    }

    @org.junit.jupiter.api.Test
    void getRandomNumberForI() {
        int number = BingoCaller.getRandomNumber("I");
        assertTrue( 16 <= number);
        assertTrue( 30 >= number);
    }


    @org.junit.jupiter.api.Test
    void getRandomNumberForN() {
        int number = BingoCaller.getRandomNumber("N");
        assertTrue( 31 <= number);
        assertTrue( 45 >= number);
    }


    @org.junit.jupiter.api.Test
    void getRandomNumberForG() {
        int number = BingoCaller.getRandomNumber("G");
        assertTrue( 46 <= number);
        assertTrue( 60 >= number);
    }


    @org.junit.jupiter.api.Test
    void getRandomNumberForO() {
        int number = BingoCaller.getRandomNumber("O");
        assertTrue( 61 <= number);
        assertTrue( 75 >= number);
    }


    @org.junit.jupiter.api.Test
    void makeCallNotNull() {
        assertNotNull(BingoCaller.makeCall());
    }


    @org.junit.jupiter.api.Test
    void makeCallCorrectNumberForLetter() {
        String call = BingoCaller.makeCall();
        String letter = call.substring(0,1);
        int number = Integer.parseInt(call.substring(1));
        int multiplier = "BINGO".indexOf(letter);

        assertTrue( 1 + (5 * multiplier) <= number);
        assertTrue( 15 + (5 * multiplier) >= number);
    }

}