package Noice;

import java.util.Scanner;
abstract class Shape3d{
    abstract void calculateVolume(double radius);
    abstract void calculateSurfaceArea(double side);
}
class Sphere extends Shape3d{
    void calculateVolume(double r){
        double volume=4/3*3.14*r*r*r;
        System.out.println("volume of sphere is:"+volume);
    }
    void calculateSurfaceArea(double r) {
        double surfaceArea=4*3.14*r*r;
        System.out.println("Surface area of sphere is:"+surfaceArea);
    }
}
class Cube extends Shape3d{
    void calculateVolume(double side){

        double volume = side*side*side;
        System.out.println("volume of cube is:"+volume);
    }
    void calculateSurfaceArea(double side){
        Scanner s=new Scanner(System.in);
        System.out.println("enter radius:");
        double r=s.nextDouble();

        double surfaceArea=6*r*r;
        System.out.println("surface area of cube is:"+surfaceArea);
    }
}

public class Shape3dRunner {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        Sphere a1=new Sphere();
        Cube a2=new Cube();


        System.out.print("enter radius: ");
        double r = s.nextDouble();
        a1.calculateVolume(r);
        a1.calculateSurfaceArea(r);

        System.out.print("enter side of cube: ");
        double side = s.nextDouble();
        a2.calculateVolume(side);
        a2.calculateSurfaceArea(side);

    }

}
