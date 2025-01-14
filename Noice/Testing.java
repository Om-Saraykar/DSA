package Noice;

public class Testing {
    public static void main(String[] args) {
        Student om = new Student();
        om.roll = 17;
        om.type = "Sigma";

        Student habib = new Student();
        habib.roll = 10;
        habib.type = "Beta";

        System.out.println(om.roll + " " + om.type);
        System.out.println(habib.roll + " " + habib.type);
    }
}
class Student{
    static int roll;
    String type;
}