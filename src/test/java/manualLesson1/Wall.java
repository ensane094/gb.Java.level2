package manualLesson1;

public class Wall implements Barrier{
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean overcome(RunJump runJump) {
        if(runJump.jump()>height){
            return true;
        }
        return false;
    }
}
