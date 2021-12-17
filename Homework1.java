package Lection51;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        int[] array = new int[4];
        System.out.println("Enter 4 numbers below:");
        Scanner in = new Scanner(System.in);
        try {
            int i = 0;
            String ans = "y";
            while (ans.equals("y")) {
                array[i] = Integer.parseInt(in.nextLine());
                i++;
                System.out.println("Continue?(y/n)");
                ans = in.nextLine();
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
    }
}
