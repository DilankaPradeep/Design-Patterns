package BehavioralPatterns.TemplatePattern;

public class Tea extends Beverages{

    public Tea() {
        super();
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
