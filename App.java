import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Expection {
        Pet pet = new Pet();
        pet.setName("George");

        String petsName = pet.getName();
        System.out.println("My pet's name is " + petsName);
    }
};