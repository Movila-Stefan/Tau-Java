package Polimorfism;

public class Dog extends Animal {
    private int breed;

    @Override
    public void eat(){
        System.out.println("chomp chomp");
    }

    //@Overload
    public void eat(int numberOfThimes){
        for (int i = 0; i < numberOfThimes ; i++) {
            System.out.println("champ champ");
        }
}

    public int getBreed(){
        return breed;
    }
    public void setBreed(int breed) {
        this.breed = breed;
    }
}
