package Lection51;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Homework2 {
    public static void main(String[] args) {
        try {
            String ans = "y";
            Scanner in = new Scanner(System.in);
            while (ans.equals("y")) {
                System.out.println("Enter string:");
                String s = in.nextLine();
                StringTokenizer st = spaceDelim(s);
                System.out.println("Continue?(y/n):");
                ans = in.nextLine();
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static StringTokenizer spaceDelim (String s) throws NoSpaceException {
        if (!s.contains(" ")) {
            throw new NoSpaceException("There are no spaces in the given string:\n" +
                    s);
        }

        StringTokenizer st = new StringTokenizer(s," ");
        return st;
    }
}

class NoSpaceException extends Exception {
    public NoSpaceException (String message){
        super(message);
    }
}
