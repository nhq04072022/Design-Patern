package facade.examples.computer;


public class ComputerFacade {

    private CPU cpu;
    private HardDrive hardDrive;
    private Memory memory;

    public ComputerFacade() {
        // create components
    }

    public void start() {
        System.out.println("STARTING...");
        cpu.freeze();
        memory.load();
        hardDrive.read();
        cpu.jump();
        cpu.execute();
    }

}
