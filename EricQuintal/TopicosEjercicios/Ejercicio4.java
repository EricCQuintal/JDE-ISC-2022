package EricQuintal.TopicosEjercicios;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Ejercicio4 extends Canvas{
    int x,y,w,h;
    int food_x , food_y, food_s;


    public Ejercicio4(){
        x=20;
        y=28;
        w=h=100;

        food_x= ((int) Math.random()* this.getWidth();
        food_y= ((int )Math.ramdom()* this.get)
    }
   


    public void paint (Graphics g) {
        
        
        g.drawRect(x, y, w, h);

        g.fillOval(x, y, w, h);

        g.setColor(Color.GREEN);

        g.drawString("Hola enfermera ", x, (y+h/2));


        

    }



    public void setX(int x) {
        this.x=x;
    }
    @Override
    public int getX() {
        // TODO Auto-generated method stub
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getY() {
        // TODO Auto-generated method stub
        return y;
    }


    
}
