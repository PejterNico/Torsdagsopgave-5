package task_2;

public class Main {
    public static void main(String[] args) {


        Cafe cafe = new Cafe();

        cafe.loadCoffeeMenu();

        System.out.println(cafe.CoffeeMenu);

        for(int i=0;i<cafe.CoffeeMenu.size();i++){
            System.out.println(cafe.CoffeeMenu.get(i));
        }

    }

}