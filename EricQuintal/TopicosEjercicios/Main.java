package EricQuintal.TopicosEjercicios;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.event.*;



public class Main extends Frame implements MouseListener, MouseMotionListener,KeyListener{
    Panel p;
    Ejercicio4 mundo;
    public Main(){
        p=new Panel();
        mundo = new Ejercicio4();
        this.setLayout(new BorderLayout());
        p.setLayout(new BorderLayout());
        p.add(new Ejercicio4());
        p.add(mundo);
        mundo.addMouseListener(this);
        mundo.addMouseMotionListener(this);
        this.addKeyListener(this);
        p.addKeyListener(this);
        mundo.addKeyListener(this);
        this.add(p,BorderLayout.CENTER);
        p.setSize(500,400);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        


        
    }

    public static void main(String[] args) {
        Main canvasI = new Main();
        
    }

    

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Moved");
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method 
        System.out.println("clicked");
        mundo.setX(e.getX());
        mundo.setY(e.getY());
        mundo.repaint();
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Pressed");
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Released");
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Entered");
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Exited");
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        switch (e.getKeyCode()) {
            case 'a':
            case KeyEvent.VK_A:
            mundo.setX(mundo.getX()-1);
            mundo.repaint();
                
                break;
            case 's':
            case KeyEvent.VK_S:
            mundo.setY(mundo.getY()+1);
            mundo.repaint();

            case 'd':
            case KeyEvent.VK_D:
            mundo.setX(mundo.getX()+1);
            mundo.repaint();

            case 'w':
            case KeyEvent.VK_W:
            mundo.setY(mundo.getY()-1);
            mundo.repaint();
        
            default:
                break;
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    
    
    
}
