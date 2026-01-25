/**
 * Project: Motorcycle OOP Project
 * Purpose Details: Represents the motorcycle frame.
 * Course: [Your Course Name]
 * Author: Alyssa Thompson
 * Date Developed: 01/25/2026
 * Last Date Changed: 01/25/2026
 * Revision: 1.0
 */
public class Frame {

    /**
     * The material of the frame.
     */
    private Material material;

    /**
     * Constructs a Frame object.
     *
     * @param material The frame material.
     */
    public Frame(Material material) {
        this.material = material;
    }

    /**
     * Returns the frame material.
     *
     * @return The frame material.
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Sets the frame material.
     *
     * @param material The frame material.
     */
    public void setMaterial(Material material) {
        this.material = material;
    }
}
