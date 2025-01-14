package Strings;
public class StringMethods {
    public static void main(String[] args) {
        String str = "Om Saraykar";

        // length() -> int
        int n = str.length();
        System.out.println("Length of string is "+n);

        // charAt() -> char
        char ch = str.charAt(5);
        System.out.println(ch);

        // indexOf() -> int
        n = str.indexOf('a');
        System.out.println("a"+" is at index "+n);

        // compareTo() -> int
        String a = "abczzzzz";
        String b = "abc";
        System.out.println(a.compareTo(b));

        // contains() -> boolean
        String c = "Thik hai samaj gaya meko.";
        System.out.println(c.contains("ik"));

        // toLowerCase()
        System.out.println(str.toLowerCase());
        System.out.println(str);

        // toUpperCase()
        str = str.toUpperCase(); // this changer str permanently
        System.out.println(str);

        // concat()
        System.out.println(a.concat(b));
    }
}
