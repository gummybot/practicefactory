package newpackage;

public class Vehicle {
    public String v_type;
    public String model;
    public int no_wheels;
    public int no_seats;
    public String color;
    public void display()
    {
        System.out.println("newpackage.Vehicle is a " + v_type);
        System.out.println("newpackage.Vehicle model is " + model);
        System.out.println("newpackage.Vehicle has " + no_wheels + " wheels");
        System.out.println("newpackage.Vehicle has " + no_seats + " seats");
        System.out.println("newpackage.Vehicle is of " + color + " color");

        Person p = new Person();
        p.doSomething();

    }

}
