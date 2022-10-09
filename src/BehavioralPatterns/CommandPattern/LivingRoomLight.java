package BehavioralPatterns.CommandPattern;

public class LivingRoomLight implements Light {
    @Override
    public void on() {
        System.out.println("switch on LivingRoom light");

    }

    @Override
    public void off() {
        System.out.println("switch off LivingRoom light");

    }
}
