public class Main {
    public static void main(String[] args) {
        Computer.Builder builder = new Computer.Builder()
                .setCpu("Intel Core i7")
                .setRam(16)
                .setStorage("1TB SSD");

        Computer computer = builder.build();
        System.out.println("Computer configuration: " + computer.getCpu() + ", " + computer.getRam() + "GB RAM, " + computer.getStorage());

        builder = new Computer.Builder()
                .setCpu("AMD Ryzen")
                .setRam(8)
                .setStorage("512GB SSD");

        computer = builder.build();
        System.out.println("Computer configuration: " + computer.getCpu() + ", " + computer.getRam() + "GB RAM, " + computer.getStorage());
    }
}