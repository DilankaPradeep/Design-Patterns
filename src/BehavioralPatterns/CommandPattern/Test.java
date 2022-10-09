package BehavioralPatterns.CommandPattern;

public class Test {

    public static void main(String[] args) {

        Light livingRoomLight = new LivingRoomLight();
        Light kitchenLight = new KitchenLight();

        Command lightOnCommand = new LightOnCommand(livingRoomLight);
        lightOnCommand.execute();

        Command lightOffCommand = new LightOffCommand(livingRoomLight);
        lightOffCommand.execute();

        Command lightOnCmd = new LightOnCommand(kitchenLight);
        lightOnCmd.execute();

        Command lightOffCmd = new LightOffCommand(kitchenLight);
        lightOffCmd.execute();
    }
}
