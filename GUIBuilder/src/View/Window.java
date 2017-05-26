package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

import Controller.JsonControll;
import Model.ObjInfo;

public class Window extends JFrame {

	private JPanel contentPane;
	private EditorPane editor;
	private AttributePane attributePane;
	private ToolBar toolbar;
	private MenuBar menubar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Window() {
		ObjInfo obj=new ObjInfo();
		obj.setInfo(32,13.0,23.0,32.0,43.0);
		ArrayList<ObjInfo> arr=new ArrayList<ObjInfo>();
		arr.add(obj);
		JsonControll controll=new JsonControll();
		controll.fOpen();
		controll.setToJson(obj);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI Builder");
		setBounds(100, 100, 450, 300);
		
		menubar=new MenuBar();
	
		toolbar=new ToolBar();
		toolbar.setBounds(0, 20, 3000, 25);
	
		//JPanel bar = new JPanel();
		
		
		editor=new EditorPane();
		
		attributePane=new AttributePane();
		
		
		Container contentPane = getContentPane();
		contentPane.add(menubar,BorderLayout.BEFORE_FIRST_LINE);
		contentPane.add(toolbar,BorderLayout.NORTH);
		contentPane.add(editor,BorderLayout.WEST); 
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.BLUE);
		//contentPane.setLayout(new FlowLayout());
		setContentPane(contentPane);
	}

}
