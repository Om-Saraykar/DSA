package BitManipulation;

public class OddEven {
    public static void main(String[] args) {
        int n = 101001;
        int bitMask = 1;

        if((n&bitMask) == 0) System.out.println("even");
        else System.out.println("odd");
    }
}