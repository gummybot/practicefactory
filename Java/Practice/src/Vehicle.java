public class Vehicle {
    public String v_type;
    public String model;
    public int no_wheels;
    public int no_seats;
    public String color;
    public void display()
    {
        System.out.println("Vehicle is a " + v_type);
        System.out.println("Vehicle model is " + model);
        System.out.println("Vehicle has " + no_wheels + " wheels");
        System.out.println("Vehicle has " + no_seats + " seats");
        System.out.println("Vehicle is of " + color + " color");
    }

}
