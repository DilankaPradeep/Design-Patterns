package BehavioralPatterns.TemplatePattern;

public abstract class Beverages {
    abstract void brew();
    abstract  void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pour into cup");
    }

    public void prepareRecipie(){
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }
}
