package chapter8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamSampleModified {

    public static List<AnimalModified> getAnimals(File dataFile) throws IOException, ClassNotFoundException {
        List<AnimalModified> animals = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(dataFile)))) {
            while(true) {
                Object object = in.readObject();
                if(object instanceof AnimalModified)
                    animals.add((AnimalModified)object);
            }
        } catch (EOFException e) {
            // File end reached
        }
        return animals;
    }

    public static void createAnimalsFile(List<AnimalModified> animals, File dataFile) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            for (AnimalModified animal: animals) {
                out.writeObject(animal);
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<AnimalModified> animals = new ArrayList<>();
        animals.add(new AnimalModified("Tommy Tiger",5,'T'));
        animals.add(new AnimalModified("Peter Penguin",8,'P'));
        File dataFile = new File("animal.data");
        createAnimalsFile(animals, dataFile);
        System.out.println(getAnimals(dataFile));
    }
}
