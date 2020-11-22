import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
import java.io.*;
public class AI extends MIDlet
{
	Display display;
	MainCanvas mc;
	public AI(){
		display=Display.getDisplay(this);
		mc=new MainCanvas();
		display.setCurrent(mc);
	}
	public void startApp(){
	}
	public void destroyApp(boolean unc){
	}
	public void pauseApp(){
	}
}
class MainCanvas extends Canvas
{
	int leftflag,upflag,rightflag,downflag;
	int x,y;
	Image heroImg[][]=new Image[4][3];
	//4个方向、每个方向3张图片，0表示left、1表示right、2表示up、3表示down
	Image currentImg;
	public MainCanvas(){
		try
		{
			for (int i=0;i<heroImg.length;i++)
			{for (int j=0;j<heroImg[i].length;j++)
			{heroImg[i][j]=Image.createImage("/sayo"+i+j+".png");}
			}
			
            currentImg=heroImg[3][1];

			leftflag=0; 
			rightflag=0;
			upflag=0;
			downflag=0;
			x=120;
			y=100;
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		}
	public void paint(Graphics g){
		g.setColor(0,0,0);
		g.fillRect(0,0,getWidth(),getHeight());
		g.drawImage(currentImg,x,y,0);
	}
	public void keyPressed(int keyCode){
		int action=getGameAction(keyCode);
        
		if(action==LEFT){
			if(leftflag==0){
				 currentImg=heroImg[0][0];
				 leftflag++;}
        
		    else if(leftflag==1){
				 currentImg=heroImg[0][2];
					leftflag--;
					
		}x=x-5;
		
		}
        
		if(action==RIGHT){
			if(rightflag==0){
				 currentImg=heroImg[1][0];
				 rightflag++;}
        
		    else if(rightflag==1){
				 currentImg=heroImg[1][2];
					rightflag--;}
					x=x+5;
        
		
		}
        if(action==UP){
			if(upflag==0){
				 currentImg=heroImg[2][0];
				 upflag++;}
        
		    else if(upflag==1){
				 currentImg=heroImg[2][2];
					upflag--;}
					y=y-5;
        
		}
		if(action==DOWN){
			if(downflag==0){
				 currentImg=heroImg[3][0];
				 downflag++;}
        
		    else if(downflag==1){
				 currentImg=heroImg[3][2];
					downflag--;}
                    y=y+5;
        
		}
		if (x<0){x=0;}
		if (x>215){x=215;}
		if (y<0){y=0;}
		if (y>260){y=260;}
		repaint();
		}
	
}