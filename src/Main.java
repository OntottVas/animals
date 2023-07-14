import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*List<String> lines = FileReader.fileLineByLine("res/dog.txt");
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
        }*/


        List<Animal> animals = new ArrayList<>();
        List<String> lines = FileReader.fileLineByLine("res/dog.txt");
        for (String line : lines) {
            String[] array = line.split(",");
            animals.add(new Dog(array[0],
                    Integer.parseInt(array[1]),
                    array[2]));
        }
        lines = FileReader.fileLineByLine("res/chicken.txt");
        for (String line : lines) {
            String[] array = line.split(",");
            animals.add(new Chicken(Integer.parseInt(array[0]),
                    Double.parseDouble(array[1])));
        }

        for (Animal actual : animals) {
            System.out.println(actual);
        }

        System.out.println();
        System.out.println();
        System.out.println();

        List<Animal> mixed = new ArrayList<>();
        lines = FileReader.fileLineByLine("res/vegyes.txt");
        for (String line : lines) {
            String[] linesAsArray = line.split(",");
            if (linesAsArray[0].equals("csirke")) {
                mixed.add(new Chicken(Integer.parseInt(linesAsArray[1]),
                        Double.parseDouble(linesAsArray[2])));
            } else if (linesAsArray[0].equals("kutya")) {
                mixed.add(new Dog(linesAsArray[1],
                        Integer.parseInt(linesAsArray[2]), linesAsArray[3]));
            } else {
                System.out.println("Cannot be added, because it is not an animal.");
            }
        }

        for (Animal animal : mixed) {
            System.out.println(animal);
        }
    }
}
