import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 800;
    public static final int Diameter = 50;
    int x1=0,x2=0,x3=0,x4=0;

    public static void main(String[] args){
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    private void drawCircle1() {
        ellipse(x1, HEIGHT/5, Diameter, Diameter);
        x1=x1+1;
    }

    private void drawCircle2() {
        ellipse(x2, 2*HEIGHT/5, Diameter, Diameter);
        x2=x2+2;
    }

    private void drawCircle3() {
        ellipse(x3, 3*HEIGHT/5, Diameter, Diameter);
        x3=x3+3;
    }

    private void drawCircle4() {
        ellipse(x4, 4*HEIGHT/5, Diameter, Diameter);
        x4=x4+4;
    }
}
