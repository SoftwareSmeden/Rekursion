package Recursive;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Rekursion r = new Rekursion();
        Scanner input = new Scanner(System.in);

        //Opgave 1:
        System.out.println("Opgave 1: ");
        System.out.println("Iterativt: "+r.pow(2, 3));
        System.out.println("Rekursivt: "+r.powR(2,3));

        //Opgave 2:
        System.out.println("\nOpgave 2: ");
        System.out.println("Iterativt: "+r.fak(8));
        System.out.println("Rekursivt: "+r.fakR(8));

        //Opgave 3:
        System.out.println("\nOpgave 3: ");
        System.out.println("Iterativt: "+r.fib(4));
        System.out.println("Rekursivt: "+r.fibR(4));

        //Opgave 4:
        System.out.println("\nOpgave 4:");
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter a character: ");
        char ch = input.nextLine().charAt(0);
        //Rekursion
        int rTimes = r.countR(str, ch);
        System.out.println("Rekursivt: "+ch + " appears " + rTimes +
                (rTimes > 1 ? " times " : " time ") + "in " + str);
        //Iterativt
        int iTimes = r.count(str,ch);
        System.out.println("Iterativt: "+ch + " appears " + iTimes +
                (iTimes > 1 ? " times " : " time ") + "in " + str);

        //Opgave 5:
        System.out.println("\nOpgave 5: ");
        int[] arrTal = {1,2,3,66,4,2,99,2,4,3,12,44,1,66,87,17,66};
        int n = 66;
        System.out.println("The number "+n+" appears "+ r.countNumbR(arrTal, arrTal.length-1, n) +
                (r.countNumbR(arrTal, arrTal.length-1, n) > 1 ? " times" : " time"));

        //Opgave 6:
        System.out.println("\nOpgave 6: ");
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        //Rekursion
        System.out.print("The reversal of " + s.toUpperCase() + " is ");
        System.out.println(r.reverseDisplay(s).toUpperCase() + " solved with a recursive method");
        //Iterativt
        System.out.print("The reversal of " + s.toUpperCase() + " is ");
        System.out.println(r.reverseString(s,s.length()-1).toUpperCase() + " solved with a iteration method");

        //Opgave 7:
        System.out.println("\nOpgave 7: ");
        int[] arrR = {1,2,3,4,5,6,7,8,9,10};
        r.arrReverseR(arrR,0, arrR.length-1);
        for (int i = 0; i < arrR.length; i++) {
            System.out.println(arrR[i]);
        }

        //Opgave 8:
        System.out.println("\nOpgave 8: ");
        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();
        //Rekursion
        System.out.println("Rekursion: "+ decimal +" is hex "+ r.dec2Hex(decimal));
        //Iterativt
        System.out.println("Iterativt: "+ decimal +" is hex "+ r.dec2HexIterativt(decimal));

        //Extra opgave:
        System.out.println("\nExtra opgave: ");
        String name = "HelleH";
        System.out.println("is "+ name +" a palidrome: "+r.isPalindrome(name));
    }
}
