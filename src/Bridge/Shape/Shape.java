package Bridge;

/**
 * @author KIKOFranklin
 * @create 2021/4/5 0005 14:25
 */
public abstract class Shape {

    protected DrawApi drawAPI;

    protected Shape(DrawApi drawApi){
        this.drawAPI = drawApi;
    }

    public abstract void draw();
}
