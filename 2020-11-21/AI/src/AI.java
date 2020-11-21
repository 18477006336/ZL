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
	Image heroleftImg[]=new Image[3];
	Image herorightImg[]=new Image[3];
	Image heroupImg[]=new Image[3];
	Image herodownImg[]=new Image[3];
	Image currentImg;
	public MainCanvas(){
		try
		{
			for(int i=0;i<heroleftImg.length;i++){
				heroleftImg[i]=Image.createImage("/sayo"+i+"2.png");
			}
			
            //leftImg=Image.createImage("/sayo12.png");
			//img4=Image.createImage("/sayo02.png");
			//img5=Image.createImage("/sayo22.png");
			for(int i=0;i<herorightImg.length;i++){
				herorightImg[i]=Image.createImage("/sayo"+i+"6.png");
			}
			//rightImg=Image.createImage("/sayo16.png");
            //img8=Image.createImage("/sayo06.png");
			//img9=Image.createImage("/sayo26.png");
			for(int i=0;i<heroupImg.length;i++){
				heroupImg[i]=Image.createImage("/sayo"+i+"4.png");
			}
			/*upImg=Image.createImage("/sayo14.png");
			img6=Image.createImage("/sayo04.png");
			img7=Image.createImage("/sayo24.png");*/
            for(int i=0;i<herodownImg.length;i++){
				herodownImg[i]=Image.createImage("/sayo"+i+"0.png");
			}
			/*downImg=Image.createImage("/sayo10.png");
			img10=Image.createImage("/sayo00.png");
			img11=Image.createImage("/sayo20.png");
            */
            currentImg=herodownImg[0];
			//currentImg=herodownImg[1];
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
				 currentImg=heroleftImg[0];
				 leftflag++;}
        
		    else if(leftflag==1){
				 currentImg=heroleftImg[2];
					leftflag--;
					
		}x=x-5;
		//currentImg=leftImg;
		}
        
		if(action==RIGHT){
			if(rightflag==0){
				 currentImg=herorightImg[0];
				 rightflag++;}
        
		    else if(rightflag==1){
				 currentImg=herorightImg[2];
					rightflag--;}
					x=x+5;
        //currentImg=rightImg;
		
		}
        if(action==UP){
			if(upflag==0){
				 currentImg=heroupImg[0];
				 upflag++;}
        
		    else if(upflag==1){
				 currentImg=heroupImg[2];
					upflag--;}
					y=y-5;
        //currentImg=upImg;
		}
		if(action==DOWN){
			if(downflag==0){
				 currentImg=herodownImg[0];
				 downflag++;}
        
		    else if(downflag==1){
				 currentImg=herodownImg[2];
					downflag--;}
                    y=y+5;
        //currentImg=downImg;
		}
		if (x<0){x=0;}
		if (x>215){x=215;}
		if (y<0){y=0;}
		if (y>260){y=260;}
		repaint();
		}
	
}