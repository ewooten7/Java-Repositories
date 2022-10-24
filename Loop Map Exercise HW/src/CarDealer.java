import java.util.*;
public class CarDealer {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            HashMap<String, String> cars = new HashMap<>();
            cars.put("Accord", "Honda");
            cars.put("Camry", "Corolla");
            cars.put("Charger", "Dodge");
            cars.put("Maxima", "Nissan");
    
            String model = "";
            while(! model.equals("quit")){
                System.out.println("What kind of car are you looking for?");
                model = input.nextLine();
                if (cars.containsKey(model)) {
                    System.out.printf("Oh, you're looking for a %s? \n", model);
                    System.out.printf("Our %s collection is right over here.\n\n",cars.get(model));
                } else {
                    if (! model.equals("quit")) {
                        System.out.println("Sorry, that vehicle is out of stock.\n");
                    }
                }
            }
        }
    }
