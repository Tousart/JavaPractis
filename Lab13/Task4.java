package Lab13;

import java.util.ArrayList;

public class Task4 {
    public static void makeArray(ArrayList<Shirt> shirtArray, String[] shirts) {
        for (int i = 0; i < shirts.length; i++) {
            shirtArray.add(new Shirt(shirts[i]));
        }
    }

    public static void printArray(ArrayList<Shirt> shirtArray) {
        for (int i = 0; i < shirtArray.size(); i++) {
            System.out.println(shirtArray.get(i).toString());
        }
    }

    public static void main(String[] args) {
        String[] shirts = {"S001,Black Polo Shirt,Black,XL", "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL", "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL", "S006,Black T-Shirt,Black,XL",
                "S007,White T Shirt,White,XL", "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S", "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"};

        ArrayList<Shirt> shirtArray = new ArrayList<>();
        makeArray(shirtArray, shirts);
        printArray(shirtArray);
    }
}
