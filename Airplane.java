/*
 * Airplane class.
 *
 * @author Emmanuel FN
 * @version 1.0
 * @since 2024-04-21
 */

/**
* The Airplane() class.
*/
public class Airplane {
    /**
     * The speed of the airplane.
     */
    private int speed;

    /**
     * Constructor.
     */
    public Airplane() {
        this.speed = 0;
    }

    /**
     * This method sets the speed.
     *
     * @param newSpeed The speed set to the airplane.
     */
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    /**
     * This method gets the speed.
     *
     * @return The speed of the airplane.
     */
    public int getSpeed() {
        return this.speed;
    }
}
