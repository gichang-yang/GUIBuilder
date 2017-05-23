package Model;

import javax.swing.JButton;

public class BtnGroup{
	private static JButton[] btnList=new JButton[]{
					new JButton("새로만들기")
					,new JButton("열기")
					,new JButton("저장")
					,new JButton("다른 이름으로 저장")
					,new JButton("추출")
					,new JButton("닫기")
	};
	public static JButton getBtn(int index){
		
		return btnList[index];
	}
	
}
