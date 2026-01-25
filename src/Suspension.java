/**
 * Project: Motorcycle OOP Project
 * Purpose Details: Represents motorcycle suspension.
 * Course: [Your Course Name]
 * Author: Alyssa Thompson
 * Date Developed: 01/25/2026
 * Last Date Changed: 01/25/2026
 * Revision: 1.0
 */
public class Suspension {

    /**
     * The front suspension type.
     */
    private String front;

    /**
     * The rear suspension type.
     */
    private String back;

    /**
     * Constructs a Suspension object.
     *
     * @param front The front suspension.
     * @param back The rear suspension.
     */
    public Suspension(String front, String back) {
        this.front = front;
        this.back = back;
    }

    /**
     * Sets the front suspension.
     *
     * @param front The front suspension.
     */
    public void setFront(String front) {
        this.front = front;
    }

    /**
     * Returns the front suspension.
     *
     * @return The front suspension.
     */
    public String getFront() {
        return front;
    }

    /**
     * Sets the rear suspension.
     *
     * @param back The rear suspension.
     */
    public void setBack(String back) {
        this.back = back;
    }

    /**
     * Returns the rear suspension.
     *
     * @return The rear suspension.
     */
    public String getBack() {
        return back;
    }
}
