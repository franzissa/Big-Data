 import org.amcgala.TurtleMode;

public class Main extends TurtleMode {

    @Override 
    public void turtleCommands() {
        drawTriangle();
    }

    private void drawTriangle() {
        up();
        move(300);
        turnRight(90);
        move(300);
        turnLeft(90);
        down();
        move(200);
        turnLeft(120);
        move(200);
        turnLeft(120);
        move(200);
        down();
    }

    public static void main(String[] args) {
        new Main();
    }

}