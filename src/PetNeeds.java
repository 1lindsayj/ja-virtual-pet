//attributes & values
public class PetNeeds {
    private String petName;
    private String job;
    private int age;
    private int hunger;
    private int thirst;
    private int lonliness;
    private int bladder;
    private int exhaustion;
    private int dirtiness;
    private int happiness;

    public PetNeeds(String newPetName, String job, int age){
        petName = newPetName;
        this.job = job;
        this.age = age;
        hunger = 1;
        thirst = 1;
        lonliness = 1;
        bladder = 1;
        exhaustion = 1;
        dirtiness = 1;
        happiness = 1;
    }

    // to change values
    public void tick() {
        hunger += 1;
        thirst += 1;
        lonliness += 1;
        bladder += 1;
        exhaustion += 1;
        dirtiness += 1;
        happiness += 1;
    }

    public String toString() {
        return " Name: " + petName + "\n" + " Job: " + job + "\n" + " Age: " + age + "\n" + 
        " Hunger Level: " + hunger + "," + " Thirst Level: " + thirst + "," + 
        " Lonliness Level: " + lonliness + "," + " Bladder Level: " + bladder + "\n" + 
        " Exhaustion Level: " + exhaustion + "," + " Dirtiness Level: " + dirtiness + "," + 
        " Happiness Level: " + happiness + "\n";

        
    }

    public void changeHunger(int newHunger) {
        hunger += newHunger;
    }

    public void changeThirst(int newThirst) {
        thirst += newThirst;
    }

    public void changeLonliness(int newLonliness) {
        lonliness += newLonliness;
    }

    public void changeBladder(int newBladder) {
        bladder += newBladder;
    }

    public void changeExhaustion(int newExhaustion){
        exhaustion += newExhaustion;
    }

    public void changeDirtiness(int newDirtiness){
        dirtiness += newDirtiness;
    }

    public void changeHappiness(int newHappiness){
        happiness += newHappiness;
    }

    // setters of values 
    public void setName(String newName){
        this.petName = newName;
    }

    public void setThirst(int newThirst){
        this.thirst = newThirst;
    }

    public void setHunger(int newHunger){
        this.hunger = newHunger;
    }
    
    public void setLonliness(int newLonliness){
        this.lonliness = newLonliness;
    }

    public void setBladder(int newBladder){
        this.bladder = newBladder;
    }

    public void setExhaustion(int newExhaustion){
        this.exhaustion = newExhaustion;
    }

    public void setDirtiness(int newDirtiness){
        this.dirtiness = newDirtiness;
    }

    public void setHappiness(int newHappiness){
        this.happiness = newHappiness;
    }

    // getters of values
    public String getName(){
        return petName;
    }

    public int getThirst(){
        return thirst;
    }

    public int getHunger(){
        return hunger;
    }

    public int getLonliness(){
        return lonliness;
    }

    public int getBladder(){
        return bladder;
    }

    public int getExhaustion(){
        return exhaustion;
    }

    public int getDirtiness(){
        return dirtiness;
    }

    public int getHappiness(){
        return happiness;
    }
}