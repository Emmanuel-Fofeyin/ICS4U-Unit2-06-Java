/*
* This is the main code that runs with the Jet Class.
*
* @author  Emmanuel FN
* @version 1.0
* @since   2024-04-21
*/

/**
* This is the FlyTest class.
*/
final class FlyTest {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if instantiation is attempted
    */
    private FlyTest() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // MagicNumbers & LocalVariableNames
        final int twoHundredTwelve = 212;
        final int fourHundredTwentyTwo = 422;
        final int four = 422;
        final int fiveThousand = 5000;

        final Airplane biplane = new Airplane();
        biplane.setSpeed(twoHundredTwelve);
        System.out.println(biplane.getSpeed());
        final Jet boeing = new Jet();
        boeing.setSpeed(fourHundredTwentyTwo);
        System.out.println(boeing.getSpeed());
        int counter = 0;
        while (counter < four) {
            boeing.accelerate();
            System.out.println(boeing.getSpeed());
            if (boeing.getSpeed() > fiveThousand) {
                biplane.setSpeed(biplane.getSpeed() * 2);
            } else {
                boeing.accelerate();
            }
            counter++;
        }
        System.out.println(biplane.getSpeed());
    }
}
