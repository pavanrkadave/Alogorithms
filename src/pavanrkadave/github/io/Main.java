package pavanrkadave.github.io;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int count = 0;

    //Variables to store the dictionary and the userInput String
    public static String user_Str = "";
    public static ArrayList<String> dict;

    public static char temp_char[];

    public static void main(String[] args) {

        //Creating a Small Dictionary using Arraylist
        //Dictionary holds 3 words
        dict = new ArrayList<>();
        dict.add("Apple");
        dict.add("Able");
        dict.add("ale");

        //Scan a String from the user
        System.out.println("Enter A String : ");
        Scanner sc = new Scanner(System.in);
        user_Str = sc.nextLine();
        user_Str.trim();

        while (count != user_Str.length()) {
            System.out.println(user_Str.charAt(count));
            count++;
        }


    }
}
