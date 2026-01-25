public class Main {
    public static void main(String[] args) {
        Brand yamaha = new Brand("Yamaha");
        Brand ducati = new Brand("Ducati");
        Brand honda = new Brand("Honda");

        Engine engine1 = new Engine("600cc", "105hp");
        Engine engine2 = new Engine("1100cc", "155hp");
        Engine engine3 = new Engine("500cc", "47hp");

        Frame frame1 = new Frame(Material.ALUMINUM_ALLOY);
        Frame frame2 = new Frame(Material.CARBON_FIBER);
        Frame frame3 = new Frame(Material.STEEL);

        Suspension suspension1 = new Suspension("Telescopic", "Mono-shock");
        Suspension suspension2 = new Suspension("Öhlins", "Öhlins");
        Suspension suspension3 = new Suspension("Standard", "Standard");

        Motorcycle m1 = new Motorcycle(
                "Red",
                2023,
                yamaha,
                engine1,
                Type.SPORTBIKE,
                frame1,
                17.0,
                suspension1
        );

        Motorcycle m2 = new Motorcycle(
                "Black",
                2022,
                ducati,
                engine2,
                Type.SPORTBIKE,
                frame2,
                17.0,
                suspension2
        );

        Motorcycle m3 = new Motorcycle(
                "Blue",
                2024,
                honda,
                engine3,
                Type.STANDARD,
                frame3,
                18.0,
                suspension3
        );

        printMotorcycle(m1);
        printMotorcycle(m2);
        printMotorcycle(m3);
    }

    public static void printMotorcycle(Motorcycle m) {
        System.out.println("Color: " + m.getColor());
        System.out.println("Year: " + m.getYear());
        System.out.println("Brand: " + m.getBrand().getName());
        System.out.println("Engine: " + m.getEngine().getCC() + ", " + m.getEngine().getHP());
        System.out.println("Type: " + m.getType());
        System.out.println("Frame Material: " + m.getFrame().getMaterial());
        System.out.println("Wheel Size: " + m.getWheels()[0].getSize());
        System.out.println("Front Suspension: " + m.getSuspension().getFront());
        System.out.println("Rear Suspension: " + m.getSuspension().getBack());
        System.out.println("----------------------------------");
    }
}
