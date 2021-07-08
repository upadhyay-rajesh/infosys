package day4;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;

public class Runnable_Demo extends Applet implements Runnable{
	
	Thread t;
	String str;
	
	//init method automatically will run first
	public void init() {
		t=new Thread(this);
		str="";
		t.start();
	}
	
	@Override
	public void run() {
		while(true) {
			str=new Date().toString();
			try {
				t.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			repaint();
		}
		
	}
	
	public void paint(Graphics g) {
		g.drawString(str, 100, 100);
		g.drawRect(200, 200, 100, 50);
	}

	

}
