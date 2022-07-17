package AbstractClasses;

public abstract class Animal {
    int age;
    String name;

    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Animal() {
    }

    public abstract void makeNoise();{
        System.out.println("animal noise");
    }

    public void printName(){
        System.out.println("My name is " + name);
    }

}
