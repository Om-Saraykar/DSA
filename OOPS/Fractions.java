package OOPS;

public class Fractions {
    public static class Fraction {
        int num;
        int den;
        public Fraction(){

        }
        public Fraction(int num, int den){
                this.num = num;
                this.den = den;
        }
        public static void simplify(){

        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.num = 27;
        f1.den = 6;
        System.out.println(f1.num + "/" + f1.den);
        f1.simplify();
        System.out.println(f1.num + "/" + f1.den);

        Fraction f2 = new Fraction(4,7);
        System.out.println(f2.num + "/" + f2.den);
    }
}