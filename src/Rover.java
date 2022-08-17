import java.util.HashMap;

public class Rover {
    private int x;
    private int y;
    private Direction direction;
    private HashMap<Character, Runnable> instructionsMap = new HashMap<Character, Runnable>();

    public Rover(int x, int y, Direction direction){
        this.x=x;
        this.y=y;
        this.direction=direction;

    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setDirection(Direction d){
        this.direction=d;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public Direction getDirection(){
        return this.direction;
    }
    public void setPosition(int x, int y, Direction d){
        this.x=x;
        this.y=y;
        this.direction=d;
    }
    public String getPosition(){
        return "("+this.x+" "+this.y+"), "+this.direction;
    }
    public void createMap(Rover rover){
        instructionsMap.put('F', new Runnable(){
            @Override
            public void run() {
                rover.getDirection().Forward(rover);
            }
        });
        instructionsMap.put('B', new Runnable(){
            @Override
            public void run() {
                rover.getDirection().Backward(rover);
            }
        });
        instructionsMap.put('L', new Runnable(){
            @Override
            public void run() {
                rover.setDirection(rover.getDirection().Left());
            }

        });
        instructionsMap.put('R', new Runnable(){
            @Override
            public void run() {
            rover.setDirection(rover.getDirection().Right());
            }
        });
    }
    public HashMap<Character,Runnable> getInstructionsMap(){
        return this.instructionsMap;
    }
    public void resolveInstructions(Rover rover,String instructions){
        for(int i=0;i<instructions.length();i++){
            rover.getInstructionsMap().get(instructions.charAt(i)).run();
        }
        System.out.println(rover.getPosition());
    }

}
