package Strings;

import java.util.Scanner;

public class DeclarationOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = {'O','m',' ','S','a','r','a','y','k','a','r'};
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();

        String name = sc.nextLine();
        System.out.println(name);
    }
}
