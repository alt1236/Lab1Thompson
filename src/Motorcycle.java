public class Motorcycle {
    private String color;
    private int year;
    private Brand brand;
    private Engine engine;
    private Type type;
    private Frame frame;
    private Wheels[] wheels;
    private Suspension suspension;


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
    public String getColor(){
        return this.color;
    }
    public int getYear(){
        return year;
    }
    public Brand getBrand(){
        return brand;
    }
    public Engine getEngine(){
        return engine;
    }
    public Type getType(){
        return type;
    }
    public Frame getFrame(){
        return frame;
    }
    public Wheels[] getWheels(){
        return wheels;
    }
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