import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        List<Animals> animals = Arrays.asList(mapper.readValue(Paths.get("animals.json").toFile(), Animals[].class));

        System.out.println(Utils.numbersOfLegs(animals));
    }
}