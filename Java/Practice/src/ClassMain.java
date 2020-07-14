import newpackage.Person;
import newpackage.Vehicle;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClassMain {
    public static void main(String[] args) {
        Vehicle jeep = new Vehicle();
        jeep.model = "Jeep";
        jeep.v_type = "Car";
        jeep.no_seats = 5;
        jeep.no_wheels = 4;
        jeep.color = "Gray";
        jeep.display();

        JFrame window = new JFrame();                   //creating window variable to hold JFrame object
        window.setSize(500,300);           //setting size of window
        window.setTitle("JFrame Window");               //setting title of window
        window.setVisible(true);                        //setting window visibility to true
        JLabel label = new JLabel();                    //creating label variable to hold JLabel object
        label.setText("Label");                         //setting text of label
        window.add(label);                              //adding label to window

        Person p = new Person();
        p.doSomethingPublic();
    }
}
