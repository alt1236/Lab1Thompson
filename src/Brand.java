/**
 * Project: Motorcycle OOP Project
 * Purpose Details: Models motorcycles using object-oriented programming concepts
 * Course: IST 242
 * Author: Alyssa Thompson
 * Date Developed: 01/24/2026
 * Last Date Changed: 01/25/2026
 * Revision: 2.0
 */

/**
 * The name of the motorcycle brand.
 */
public class Brand {
    private String name;

    /**
     * Constructs a Brand object.
     *
     * @param name The name of the brand.
     */
    public Brand(String name){
        this.name = name;
    }

    /**
     * Returns the brand name.
     *
     * @return The brand name.
     */
    public String getName(){
        return name;
    }

    /**
     * Sets the brand name.
     *
     * @param name The brand name.
     */
    public void setName(String name){
        this.name = name;
    }
}
