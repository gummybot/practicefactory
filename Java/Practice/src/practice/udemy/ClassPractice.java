package practice.udemy;

public class ClassPractice {

    public float areaSquare(float side){
        return side*side;
    }

    public float areaRect(float width, float length){
        return length*width;
    }

    public float areaTriang(float base, float height){
        return base*height;
    }

    public float FtoC(float f_temp){
        return (((f_temp-32)*5)/9);
    }

    public float CtoF(float c_temp){
        return (((c_temp*9)/5)+32);
    }

    public float inchtocm(float inch){
        return (inch*2.54f);
    }

    public float cmtoinch(float cm){
        return (cm*0.39f);
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.prepend(10);
        llist.prepend(8);
        llist.prepend(6);
        llist.append(12);
        llist.append(14);
        llist.prepend(4);
        llist.prepend(2);
        llist.printList();
        System.out.println(llist.toString());
        System.out.println(llist.peekHead());
        System.out.println(llist.peekTail());
        System.out.println(llist.peekNthElement(2));
        System.out.println(llist.removeNthElement(4));
        System.out.println(llist.toString());
        System.out.println(llist.removeHead());
        System.out.println(llist.toString());
        System.out.println(llist.removeTail());
        System.out.println(llist.toString());
        llist.insertAt(100, 2);
        System.out.println(llist.toString());
    }
}
