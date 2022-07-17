package AbstractClasses;

public class Cat extends Animal implements AnimalStuff {

    String catFoodPreference;

    // folosim super cu this
    public Cat(int age, String name, String catFoodPreference) {
        super(age, name);
        this.catFoodPreference = catFoodPreference;

    }

    public Cat() {
        super();
    }

    @Override
    public void makeNoise() {
        System.out.println("mew");
    }

    @Override
    public void poop() {
        System.out.println("pooped");
    }

    // asa folosesti super trebuie sa fie nu fi-e abstracta sau private
    public void printName(){
        super.printName();
    }
}
