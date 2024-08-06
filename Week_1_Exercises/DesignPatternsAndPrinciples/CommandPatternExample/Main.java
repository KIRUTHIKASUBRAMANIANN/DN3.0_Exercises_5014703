public class Main {
    public static void main(String[] args) {
        
        Light light = new Light();

        
        Command onCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);

        
        RemoteControl remoteControlOn = new RemoteControl(onCommand);


        remoteControlOn.pressButton();


        RemoteControl remoteControlOff = new RemoteControl(offCommand);

        
        remoteControlOff.pressButton();
    }
}