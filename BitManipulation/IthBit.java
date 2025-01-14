package BitManipulation;

public class IthBit {
    public static int getIthBit(int n, int i){
        int bitMask = n>>i;
        if((bitMask&1) == 1) return 1;
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
    }
}
