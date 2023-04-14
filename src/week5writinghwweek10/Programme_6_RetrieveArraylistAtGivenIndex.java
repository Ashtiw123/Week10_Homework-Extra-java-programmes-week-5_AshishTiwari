package week5writinghwweek10;

import java.util.ArrayList;
import java.util.Scanner;

//Write a Java program to retrieve an element (at a specified index) from a given array list
public class Programme_6_RetrieveArraylistAtGivenIndex {
    public static void main(String[] args) {

        ArrayList<String> vegetableList = new ArrayList<>();
        vegetableList.add("Cucumber");
        vegetableList.add("Cauliflower");
        vegetableList.add("Potatoes");
        vegetableList.add("Aubergine");
        vegetableList.add("Onion");
        vegetableList.add("Beetroot");
        vegetableList.add("Mushroom");
        vegetableList.add("Bitter_Groud");
        System.out.println(vegetableList);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an index number : ");
        int index = scan.nextInt();
        if (index < vegetableList.size()) {
            System.out.println(vegetableList.get(index));
        } else {
            System.out.println("Invalid Index!!");
        }
        scan.close();
    }
}

