import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class HWRobot {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot(); // creating Robot instance


//        closing window
//        robot.keyPress(KeyEvent.VK_ALT); // pressing  I
//        robot.keyPress(KeyEvent.VK_F4); // pressing enter

        // Move mouse to X Y coordinates
        robot.mouseMove(30, 1220);

        // Click mouse buttons (left / right mouse buttons)
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(3000);
        robot.mouseMove(190, 210);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(500, 500);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(200, 300);
        robot.mouseMove(230, 310);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        // don’t forget to use mouseRelease on key
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
