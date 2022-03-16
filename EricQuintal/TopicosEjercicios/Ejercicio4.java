package EricQuintal.TopicosEjercicios;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Ejercicio4 extends Canvas{
    int x,y,w,h;

    public Ejercicio4(){
        x=20;
        y=28;
        w=h=100;
    }
   


    public void paint (Graphics g) {
        

        g.drawRect(x, y, w, h);

        g.fillOval(x, y, w, h);

        g.setColor(Color.BLACK);

        g.drawString("Hola enfermera ", 20, 70);

    }


    
}
