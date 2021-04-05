package Bridge;

/**
 * @author KIKOFranklin
 * @create 2021/4/5 0005 14:23
 */
public class RedCircle implements DrawApi{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
