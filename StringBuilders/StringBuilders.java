package StringBuilders;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringBuilders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaration
        StringBuilder sb = new StringBuilder();

        // by default capacity is 16
        System.out.println(sb.capacity());

        // mention capacity in StringBuilder
        StringBuilder s = new StringBuilder(12);
        System.out.println(s.capacity());

        // Initialize
        StringBuilder a = new StringBuilder("hello guys!");
        System.out.println(a.length());
        System.out.println(a.capacity());

        // Taking Input
        StringBuilder b = new StringBuilder(sc.nextLine());
        System.out.println(b);

        b.setCharAt(2,'l');
        System.out.println(b);

        // understanding
        List<String> str = new ArrayList<>();
        StringBuilder c = new StringBuilder();
        c.append("->");
        System.out.println(c);
        str.add(c.toString());
        System.out.println(str);
        c = new StringBuilder();
        System.out.println(c);

    }
}