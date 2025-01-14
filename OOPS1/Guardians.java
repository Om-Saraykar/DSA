package OOPS1;

public class Guardians {
    public String name;
    private int attack;
    public char gender;

    // getter
    public int getAttack(){
        return attack;
    }

    // setter
    public void setAttack(int attack){
        this.attack = attack; // this.attack matlab -> class ka variable attack
    }
}