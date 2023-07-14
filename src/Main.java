import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines = FileReader.fileLineByLine("res/dog.txt");
        List<Dog> dogs = new ArrayList<>();
        for (String line : lines) {
            String[] lineAsArray = line.split(",");
            dogs.add(new Dog(lineAsArray[0],
                    Integer.parseInt(lineAsArray[1]),
                    lineAsArray[2]));
        }

        for (var actual : dogs) {
            System.out.println(actual);
        }

        lines = FileReader.fileLineByLine("res/chicken.txt");
        List<Chicken> chickens = new ArrayList<>();
        for (String line : lines) {
            String[] lineAsArray = line.split(",");
            chickens.add(new Chicken(Integer.parseInt(lineAsArray[0]),
                    Double.parseDouble(lineAsArray[1])));
        }

        for (Chicken chicken : chickens) {
            System.out.println(chicken);
        }
    }
}
