package task_about_animals;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;

public class Utils {

    public static int numbersOfLegs(Map<?, ?> map) {
        int legs = 0;
        if (map != null) {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                if (entry.getKey().equals("chickens")) {
                    legs += (int)entry.getValue() * 2;
                } else {
                    legs += (int)entry.getValue() * 4;
                }
            }
        }

        return legs;
    }

    public static void runApplication() {
        ObjectMapper mapper = new ObjectMapper();
        Map<?, ?> map = null;

        try {
            map = mapper.readValue(Paths.get("animals.json").toFile(), Map.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Utils.numbersOfLegs(map));
    }
}