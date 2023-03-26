package task_2;

import sun.rmi.server.Activation$ActivationSystemImpl_Stub;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    public ArrayList<String> CoffeeMenu = new ArrayList<>();

    public void loadCoffeeMenu() {
        File file = new File("src/task_2/Coffee.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String output = scan.nextLine();
                CoffeeMenu.add(output);
            }
            } catch(FileNotFoundException eo){
            System.out.println("File is not found");
        }
    }

}
