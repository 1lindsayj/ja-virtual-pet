import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userAction;

    // welcome message 
        System.out.println("\n" + "Welcome to JA Virtual Pet!" + "\n" + 
        "Please answer the following question." + "\n" );

    // questions to user + saves input for later
        System.out.println("What is the name of your pet? ");
        String name = input.nextLine();

        System.out.println("What job does your pet have? ");
        String job = input.nextLine();

        System.out.println("How old is your pet in years? ");
        int age = input.nextInt();

        PetNeeds myPet = new PetNeeds(name, job, age);
        
    // loop that runs the tick and changes int values of petneed attributes
        for (int i = 0; i < 3; i++)
        {
            myPet.tick();  
        } 

    // layout stuff + pet needs tick print out
        System.out.println("<-------------------------->");
        System.out.println("   Your Pet's Information   ");
        System.out.println(myPet);

    // loop that displays menu message for user to pick an action in relation to the pet's needs
       do {

        userAction = displayMenu(input);

        switch(userAction)
        {
           case 1: 
           int hunger = 0; 
           System.out.println("Your pet has been feed. It's current hunger is: " + hunger + "\n"); 
           break;

           case 2:
           int lonliness = 0;
           System.out.println("Your pet has had some fun. It's current lonliness is " + lonliness + "\n");
           break;

           case 3:
           int thirst = 0;
           System.out.println("Your pet is well hydrated. It's current thirst is: " + thirst + "\n");
           break;

           case 4:
           int happiness = 0;
           int bladder = 0;
           System.out.println("Your pet enjoyed the outdoors. It's current happiness is: " + happiness 
           + " and your pet's current bladder is: " + bladder + "\n");
           break;

           case 5:
           int dirtiness = 0;
           System.out.println("Your pet is all clean now. It's current dirtiness is: " + dirtiness + "\n");
           break;

           case 6:
           int exhaustion = 0;
           System.out.println("Your pet is well rested. It's current exhaustion is: " + exhaustion + "\n");
           break;

           case 7:
           System.out.println("No action has been taken. Thank you and goodbye!" + "\n");
           break;

           default:
           System.out.println("Wrong entry. Please enter a value between 1-7.");
           break;
        } 
    } while (userAction != 7);
}
     
     // message to prompt user to take action by picking a number from the menu
       public static int displayMenu(Scanner input)
       {
        System.out.printf(" What action would you like to take? \n  ");
        System.out.printf("--------------------------- \n ");
        System.out.printf(" | 1) Feed my pet         |\n", "       ");
        System.out.printf("  | 2) Play with my pet    |\n", "       ");
        System.out.printf("  | 3) Give my pet water   |\n", "       ");
        System.out.printf("  | 4) Take my pet outside |\n", "       ");
        System.out.printf("  | 5) Wash my pet         |\n", "       ");
        System.out.printf("  | 6) Make my pet sleep   |\n", "       ");
        System.out.printf("  | 7) No action & quit    |\n", "       ");
        System.out.printf(" --------------------------- \n");
       {
        return input.nextInt();
       }

      } 
       
       
       // do {have ticks increase or decrease for all attributes}
            // System.out.println(tick int for all attributes)
            // System.out.println (what action to take?)
            // action options - input choice into system 

       // System.out.println("The name of your pet is " + newPetName)
        // newPetName.setName("George");

        // String petsName = pet.getName();
       // System.out.println("My pet's name is " + petsName);
    }

    
