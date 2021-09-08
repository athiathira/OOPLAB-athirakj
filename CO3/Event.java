import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Event extends Applet implements MouseListener,MouseMotionListener
{
int x=0;
int y=0;
String msg="";
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent e)
{
x=20;
y=40;
msg="Mouse Clicked";
repaint();
}
public void mousePressed(MouseEvent e)
{
x=30;
y=60;
msg="Mouse Pressed";

repaint();
}
public void mouseReleased(MouseEvent e)
{
x=30;
y=60;
msg="Mouse Released";
repaint();
}
public void mouseEntered(MouseEvent e)
{
x=40;
y=80;
msg="Mouse Entered";
repaint();
}
public void mouseExited(MouseEvent e)
{
x=40;
y=80;
msg="Mouse Exited";
repaint();
}
public void mouseDragged(MouseEvent e)
{
x=e.getX();
y=e.getY();
showStatus("Currently mouse dragged"+x+" "+y);

repaint(); }
public void mouseMoved(MouseEvent me)
{
x=e.getX();
y=e.getY();
showStatus("Currently mouse is at"+x+" "+y);
repaint();
}
public void paint(Graphics g)
{
g.drawString("Handling Mouse Events",30,20);
g.drawString(msg,60,40);
}
}