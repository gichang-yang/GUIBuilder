package Controller;

import java.io.File;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import Model.ObjInfo;

public class JsonControll {
	Gson gson;
	File jsonFile;
	public void fOpen(){
	
		gson=new Gson();
		
		
		jsonFile=new File("save.json");
		if(!jsonFile.exists())try{jsonFile.createNewFile();}catch(Exception e){}
		
		
	}
	
	public ObjInfo getFromJson(){
		ObjInfo info=new ObjInfo();
		info.setInfo(
				gson.fromJson("id", Integer.class),
				gson.fromJson("startX", Double.class),
				gson.fromJson("startY", Double.class),
				gson.fromJson("endX", Double.class),
				gson.fromJson("endY;", Double.class)
				);
		
		return info;
		
		
		
	}
	
	public void setToJson(ArrayList<ObjInfo> i){
		
			System.out.println(""+gson.toJson(i).toString());
			StringBuffer json=new StringBuffer("");
			for(int n=0;n<i.size();n++){
			json.append("{\n");
			
			json.append("\""+i.get(n).getId()+"\":{\n");
			json.append("\""+i.get(n).getStartX()+"\"");
			json.append("\""+i.get(n).getStartY());
			
			//i.getEndX();
			//i.getEndY();
			json.append("}");
			}
			
			saveToFile(json.toString());
		
	}
	
	private void saveToFile(String buf){
		
	}
	
	
}
