public class InstructionControl {
    public static void main(String[] args){
        Rover rover = new Rover(4,2,Direction.EAST);
        rover.createMap(rover);
        rover.resolveInstructions(rover,"FLFL");
    }
}
