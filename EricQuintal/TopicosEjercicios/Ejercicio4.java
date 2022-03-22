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

        food_x= ((int) Math.random()* 500);
        food_y= ((int )Math.random()* 400);
        System.out.printf(food_x+""+food_y); 
        food_s= 20;
    }
   


    public void paint (Graphics g) {

        colision();
        
        
        g.drawRect(x, y, w, h);

        g.fillOval(x, y, w, h);

        g.setColor(Color.GREEN);

        g.drawString("Hola enfermera ", x, (y+h/2));


        

    }



    private void colision() {
        // La posisicion x  de la principal es mayor que la psoscicion de la secundaria 
        // La posisicion en x de la princiapal es maner que la psosicicion de la secundaria 
        // La psosicion  
        if (x>=food_x && y>=food_y && (x+w)> food_x && (y+h)> food_y) {
            
            
        }
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
    public void setSprite(){
        
    }


    
}
