/**
 * Project: Motorcycle OOP Project
 * Purpose Details: Models motorcycles using object-oriented programming concepts
 * Course: IST 242
 * Author: Alyssa Thompson
 * Date Developed: 01/24/2026
 * Last Date Changed: 01/25/2026
 * Revision: 2.0
 */
public class Engine {

    /**
     * The engine displacement.
     */
    private String cc;

    /**
     * The engine horsepower.
     */
    private String hp;

    /**
     * Constructs an Engine object.
     *
     * @param cc The engine displacement.
     * @param hp The engine horsepower.
     */
    public Engine(String cc, String hp) {
        this.cc = cc;
        this.hp = hp;
    }

    /**
     * Sets the engine displacement.
     *
     * @param cc The engine displacement.
     */
    public void setCC(String cc) {
        this.cc = cc;
    }

    /**
     * Returns the engine displacement.
     *
     * @return The engine displacement.
     */
    public String getCC() {
        return cc;
    }

    /**
     * Sets the engine horsepower.
     *
     * @param hp The engine horsepower.
     */
    public void setHP(String hp) {
        this.hp = hp;
    }

    /**
     * Returns the engine horsepower.
     *
     * @return The engine horsepower.
     */
    public String getHP() {
        return hp;
    }
}