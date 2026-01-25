/**
 * Project: Motorcycle OOP Project
 * Purpose Details: Models motorcycles using object-oriented programming concepts
 * Course: IST 242
 * Author: Alyssa Thompson
 * Date Developed: 01/24/2026
 * Last Date Changed: 01/25/2026
 * Revision: 2.0
 */
public class Motorcycle {
    /**
     * The color of the motorcycle
     */
    private String color;
    /**
     * The year the motorcycle was manufactured
     */
    private int year;
    /**
     * The brand of the motorcycle.
     */
    private Brand brand;
    /**
     * The engine of the motorcycle.
     */
    private Engine engine;
    /**
     * The type of motorcycle.
     */
    private Type type;
    /**
     * The frame of the motorcycle.
     */
    private Frame frame;
    /**
     * The wheels of the motorcycle.
     */
    private Wheels[] wheels;
    /**
     * The suspension of the motorcycle.
     */
    private Suspension suspension;


    /**
     * Constructs a Motorcycle object with all required properties.
     *
     * @param color The color of the motorcycle.
     * @param year The manufacturing year.
     * @param brand The brand of the motorcycle.
     * @param engine The engine specifications.
     * @param type The type of motorcycle.
     * @param frame The frame of the motorcycle.
     * @param wheelSize The size of the wheels.
     * @param suspension The suspension system.
     */
    public Motorcycle(String color,
                      int year,
                      Brand brand,
                      Engine engine,
                      Type type,
                      Frame frame,
                      double wheelSize,
                      Suspension suspension){
        this.color = color;
        this.year = year;
        this.brand = brand;
        this.engine = engine;
        this.type = type;
        this.frame = frame;
        this.suspension = suspension;

        this.wheels = new Wheels[2];
        this.wheels[0] = new Wheels(wheelSize);
        this.wheels[1] = new Wheels(wheelSize);



    }
    // Getters
    /**
     * Returns the color of the motorcycle.
     *
     * @return The motorcycle's color.
     */
    public String getColor(){
        return this.color;
    }
    /**
     * Returns the year of the motorcycle.
     *
     * @return The motorcycle's year.
     */
    public int getYear(){
        return year;
    }
    /**
     * Returns the brand of the motorcycle.
     *
     * @return The motorcycle's brand.
     */
    public Brand getBrand(){
        return brand;
    }
    /**
     * Returns the engine of the motorcycle.
     *
     * @return The motorcycle's engine.
     */
    public Engine getEngine(){
        return engine;
    }
    /**
     * Returns the type of the motorcycle.
     *
     * @return The motorcycle's type.
     */
    public Type getType(){
        return type;
    }
    /**
     * Returns the frame of the motorcycle.
     *
     * @return The motorcycle's frame.
     */
    public Frame getFrame(){
        return frame;
    }
    /**
     * Returns the wheels of the motorcycle.
     *
     * @return The motorcycle's wheels.
     */
    public Wheels[] getWheels(){
        return wheels;
    }
    /**
     * Returns the suspension of the motorcycle.
     *
     * @return The motorcycle's suspension.
     */
    public Suspension getSuspension(){
        return suspension;
    }

    // Setters
    public void setColor(String color){
        this.color = color;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setBrand(Brand brand){
        this.brand = brand;
    }
    public void setEngine(Engine engine){
        this.engine = engine;
    }
    public void setType(Type type){
        this.type = type;
    }
    public void setFrame(Frame frame){
        this.frame = frame;
    }
    public void setWheels(Wheels[] wheels){
        this.wheels = wheels;
    }
    public void setSuspension(Suspension suspension){
        this.suspension = suspension;
    }
}