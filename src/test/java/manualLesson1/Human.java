package manualLesson1;

public class Human implements Members, RunJump {

    private final double MAX_JUMP_CAPACITY = 1.80;
    private final double MAX_RUN_CAPACITY = 8000;

    private double jumpHeight;
    private double runCapacity;

    @Override
    public double jump() {
        return getJumpHeight();
    }

    @Override
    public double run() {
        return getRunCapacity();
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public double getRunCapacity() {
        return runCapacity;
    }

    public Human(double jumpHeight, double runCapacity) {
        if (jumpHeight <= MAX_JUMP_CAPACITY && runCapacity <= MAX_RUN_CAPACITY) {
            this.jumpHeight = jumpHeight;
            this.runCapacity = runCapacity;
        } else if (jumpHeight > MAX_JUMP_CAPACITY) {
            this.jumpHeight = MAX_JUMP_CAPACITY;
        } else if (runCapacity > MAX_RUN_CAPACITY) {
            this.runCapacity = MAX_RUN_CAPACITY;
        }
    }
}
