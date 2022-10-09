package BehavioralPatterns.CommandPattern;

public class KitchenLight implements Light{
    @Override
    public void on() {
        System.out.println("switch on Kitchen light");
    }

    @Override
    public void off() {
        System.out.println("switch off Kitchen light");

    }
}
