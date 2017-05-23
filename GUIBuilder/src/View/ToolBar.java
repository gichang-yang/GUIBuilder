package View;



import javax.swing.JButton;
import javax.swing.JToolBar;


import Model.BtnGroup;

public class ToolBar extends JToolBar{
	
	
	public ToolBar(){
		
		this.add(BtnGroup.getBtn(0));
		
		
		this.add(BtnGroup.getBtn(1));
		this.add(BtnGroup.getBtn(2));
		this.add(BtnGroup.getBtn(3));
		 this.add(BtnGroup.getBtn(4));
		this.add(BtnGroup.getBtn(5));
		 
	
	}
	
	
	
	
}
