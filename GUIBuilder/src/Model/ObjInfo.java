package Model;

import java.io.Serializable;

public class ObjInfo implements Serializable{
	int id;
	double startX;
	double startY;
	double endX;
	double endY;
	
	public void setInfo(int id,double startX,double endX,double startY,double endY){
		this.id=id;
		this.startX=startX;
		this.startY=startY;
		this.endY=endY;
		this.endX=endX;
	}
	
	public double getStartX(){
		return startX;
	}
	
	public double getStartY(){
		return startY;
		
	}
	
	public double getEndY(){
		return endY;
	}
	public double getEndX(){
		return endX;
	}
	
	public double getId(){
		return id;
	}
}
