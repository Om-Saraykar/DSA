package OOPS;

import OOPS1.Guardians;

public class Superhero {
    public static void main(String[] args) {

        Avenger Wanda = new Avenger();
        Wanda.name = "Scarlet Witch";
        Wanda.attack = 99;
        Wanda.gender = 'F';
        System.out.println("Name : " + Wanda.name);
        System.out.println("Attack : " + Wanda.attack);
        System.out.println("Gender : " + Wanda.gender);
        System.out.println();


        Guardians Rocket = new Guardians();
        Rocket.name = "Racoon";
        Rocket.gender = 'M';
        Rocket.setAttack(90);
        System.out.println("Name : " + Rocket.name);
        System.out.println("Attack : " + Rocket.getAttack());
        System.out.println("Gender : " + Rocket.gender);
        System.out.println();

        Avenger CaptainAmerica = new Avenger("Steve Roggers", 69, 'M');
        System.out.println("Name : " + CaptainAmerica.name);
        System.out.println("Attack : " + CaptainAmerica.attack);
        System.out.println("Gender : " + CaptainAmerica.gender);
        System.out.println();
    }
}