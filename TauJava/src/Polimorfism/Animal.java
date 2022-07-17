package Polimorfism;

public class Animal {
    private String name;
    private String Color;

    public void eat() {
        System.out.println("munch");
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
