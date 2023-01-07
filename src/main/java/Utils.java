import java.util.List;

public class Utils {

    public static int numbersOfLegs(List<Animals> animals) {
        int legs = 0;
        for (Animals animal : animals) {
            if (animal.getName().equals("chickens")) {
                legs += animal.getQuantity() * 2;
            } else {
                legs += animal.getQuantity() * 4;
            }
        }

        return legs;
    }

    public static int numbersOfLegsAn(List<Animals> animals) {
        int legs = 0;
        int sum = 0;
        for (Animals animal : animals) {
            switch (animal.getName()) {
                case "pigs":
                case "cows":
                    legs = animal.getQuantity() * 4;
                    break;
                case "chickens":
                    legs = animal.getQuantity() * 2;
                    break;
            }
            sum += legs;
        }

        return sum;
    }
}
