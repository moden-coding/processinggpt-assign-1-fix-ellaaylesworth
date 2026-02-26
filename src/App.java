import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void settings() {
        size(400, 400);
    }

    public void setup() {
        background(144, 45, 0);
    }

    public void draw() {
        stroke(255,200,0);
        strokeWeight(2);
        fill(144, 45, 0);
        ellipse(200, 200, 80, 80);

        stroke(70,70,244);
        strokeWeight(30);
        fill(45,45,255);
        rect(-10,250,500,150);

        stroke(0);
        strokeWeight(10);
        line(30, 300, 40, 300);

        stroke(0);
        strokeWeight(10);
        line(40, 280, 40, 300);



    }
}
