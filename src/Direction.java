public enum Direction {
    NORTH{
        @Override
        public void Forward(Rover rover){
            rover.setY(rover.getY()+1);
        }
        @Override
        public void Backward(Rover rover){
            rover.setY(rover.getY()-1);
        }
        @Override
        public Direction Left(){
            return WEST;
        }
        @Override
        public Direction Right(){
            return EAST;
        }
    },
    EAST{

        @Override
        public void Forward(Rover rover){
            rover.setX(rover.getX()+1);
        }
        @Override
        public void Backward(Rover rover){
            rover.setX(rover.getX()-1);
        }
        @Override
        public Direction Left(){
            return NORTH;
        }
        @Override
        public Direction Right(){
            return SOUTH;
        }
    },
    SOUTH{
        @Override
        public void Forward(Rover rover){
            rover.setY(rover.getY()-1);
        }
        @Override
        public void Backward(Rover rover){
            rover.setY(rover.getY()+1);
        }
        @Override
        public Direction Left(){
            return EAST;
        }
        @Override
        public Direction Right(){
            return WEST;
        }
    },
    WEST{
        @Override
        public void Forward(Rover rover){
            rover.setX(rover.getX()-1);
        }
        @Override
        public void Backward(Rover rover){
            rover.setX(rover.getX()+1);
        }
        @Override
        public Direction Left(){
            return SOUTH;
        }
        @Override
        public Direction Right(){
            return NORTH;
        }
    };
    public abstract void Forward(Rover rover);
    public abstract void Backward(Rover rover);
    public abstract Direction Left();
    public abstract Direction Right();
}
