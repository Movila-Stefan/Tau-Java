package Polimorfism;

public class Cat extends Animal {
    private String LitterPreference;

    @Override
    public void eat (){
        System.out.println("mun mun ");
    }


    public String getLitterPreference() {
        return LitterPreference;
    }

    public void setLitterPreference(String litterPreference) {
        LitterPreference = litterPreference;
    }
}
